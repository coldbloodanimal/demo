package com.example.demoeasyexcel;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.merge.AbstractMergeStrategy;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.util.ObjectUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 主从结构的数据展示在一个表格时候，通过id合并主体信息
 *
 * 特别鸣谢：
 * https://www.cnblogs.com/monianxd/p/16359369.html 提供了如何使用easyexcel合并
 * https://www.baeldung.com/java-apache-poi-merge-cells 提供了如何使用poi合并的细节
 */

// 主从结构合并策略
public class GroupByIdMergeStrategy<T> extends AbstractMergeStrategy {

    /**
     * 原始数据
     */
    private List<T> dataList;
    /**
     * 要合并的坐标，key=rowIndex,columnIndex
     */
    private Map<String,CellRangeAddress> cellRangeAddressMap;

    private String idName;
    // 合并的列开始和结束位置
    private Integer startColumnIndex;
    private Integer endColumnIndex;
    // 数据集大小，用于区别结束行位置
    private Integer titleHeight;

    /**
     *
     * @param dataList 要处理的数据
     * @param idName 主体信息id，主体信息合并依据
     * @param titleHeight 标题高度
     * @param startColumnIndex 开始合并的列
     * @param endColumnIndex 结束合并的列
     */
    public GroupByIdMergeStrategy(List<T> dataList, String idName, Integer titleHeight, Integer startColumnIndex, Integer endColumnIndex) {
        this.idName=idName;
        this.startColumnIndex = startColumnIndex;
        this.endColumnIndex = endColumnIndex;
        this.titleHeight = titleHeight;
        this.dataList=dataList;
        this.cellRangeAddressMap=caculateCellRangeAddress(dataList);
    }

    /**
     * 如果当前行的主键和上一行相等，和下一样不等，则此处要合并单元格
     * @param dataList
     * @return
     */
    private Map<String, CellRangeAddress> caculateCellRangeAddress(List<T> dataList) {
        //记录上一次合并的位置，从标题位开始
        int lastMergeRowPointer=0;
        Map<String, CellRangeAddress> map=new HashMap<>();
        int size=dataList.size();
        for(int i=0;i<dataList.size();i++){
            Object id=getIdValue(dataList.get(i));
            Object nextRowId=i+1<size?getIdValue(dataList.get(i+1)):null;
            //当前行与上一个合并位置距离>1且与下一样值不相等才需要合并
            if(i-lastMergeRowPointer>1&&!id.equals(nextRowId)){
                //excel中的实际行坐标是标题+数据坐标
                for(int j=this.startColumnIndex;j<=this.endColumnIndex;j++){
                    int firstRow=lastMergeRowPointer+1, lastRow=i+this.titleHeight,firstCol=j,lastCol=j;
                    map.put(i+this.titleHeight+","+j,new CellRangeAddress(firstRow,lastRow,firstCol,lastCol));
                }
                lastMergeRowPointer=i;
            }
        }
        return map;
    }

    /**
     * 获得分组依据id的值
     * @param t
     * @param <T>
     * @return
     */
    public <T> Object getIdValue(T t){
        try {
            Class clazz=Class.forName(t.getClass().getName());
            Field field=clazz.getDeclaredField(idName);
            field.setAccessible(true);
            Object id=field.get(t);
            return id;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 合并规则：该方法应该会遍历每个单元格，我们在第一次
     * 将主表主键放在第一列（也可以是和主键等效的列，也可以放在其它列，需要额外处理）
     *
     *
     * @param sheet
     * @param cell
     * @param head
     * @param relativeRowIndex
     */
    @Override
    protected void merge(Sheet sheet, Cell cell, Head head, Integer relativeRowIndex) {
        {
            int columnIndex = cell.getColumnIndex();
            int rowIndex = cell.getRowIndex();
            CellRangeAddress cellRangeAddress=this.cellRangeAddressMap.get(rowIndex+","+columnIndex);
            if(!ObjectUtils.isEmpty(cellRangeAddress)){
                sheet.addMergedRegion(cellRangeAddress);
            };
        }
    }

}