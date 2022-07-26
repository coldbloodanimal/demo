package com.example.collection;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import lombok.Data;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {

////        System.out.println(selectAll());
////       System.out.println(chineseName());
////        System.out.println(selectFemale());
////        System.out.println(killList());
        ////       System.out.println(distinct());
        ////      System.out.println(groupBySimple());
        ////        System.out.println(groupBy());
        ////      System.out.println(groupByMultiColumn());
  //      System.out.println(sortByHeight());
//        System.out.println(whoIsShe());
       System.out.println(getUserPetsName());

    //    List<WorldUser> worldUserList = getList();

      //  worldUserList.stream().filter(p -> 165 > p.height).filter(p -> "female".equals(p.sex)).filter(p -> "china".equals(p.country)).forEach(p -> System.out.println(p));

    }

    //她是谁
    public static List<WorldUser> whoIsShe(){
        List<WorldUser> worldUserList = getList();
        return worldUserList.stream()
                .filter(p -> 165 > p.height && "female".equals(p.sex) && "china".equals(p.country))
                .collect(Collectors.toList());
    }

    //全表查询
    public static List<WorldUser> selectAll() {
        List<WorldUser> worldUserList = getList();
        return worldUserList.stream().collect(Collectors.toList());
    }

    //她是谁
    public static List<String> chineseName(){
        List<WorldUser> worldUserList = getList();
        return worldUserList.stream() //获取流
                        .filter(p -> "china".equals(p.country)) //将满足判定条件的元素组成流
                        .map(p -> p.name) // 方法返回值组成流，”p->p.name"这种写法属于lambda表达式
                        .collect(Collectors.toList()); // 生成一个新的 List
    }

    //条件查询
    public static List<WorldUser> selectFemale() {
        List<WorldUser> worldUserList = getList();
        return worldUserList.stream().filter(p -> "female".equals(p.getSex())).collect(Collectors.toList());
    }

    //字段筛选
    public static List<String> killList() {
        List<WorldUser> worldUserList = getList();
        return worldUserList.stream()
                .filter(p -> "male".equals(p.getSex()))
                .map(p -> p.getName())
                .collect(Collectors.toList());
    }

    //where is she
    public static List<String> distinct() {
        List<WorldUser> worldUserList = getList();
        return worldUserList.stream()
                .map(p -> p.getCountry())
                .distinct()
                .collect(Collectors.toList());
    }

    //简单分组(group by)
    public static Map<String,List<WorldUser>> groupBySimple() {
        List<WorldUser> worldUserList = getList();
        return worldUserList.stream()
                .collect(Collectors.groupingBy(p->p.getCountry()));
    }

    //统计分组(group by)
    public static Map<String,Long> groupBy() {
        List<WorldUser> worldUserList = getList();
        return worldUserList.stream()
                .collect(Collectors.groupingBy(p->p.getCountry(),Collectors.counting()));
    }

    //多字段分组
    public static Map<String,Map<String,Long>> groupByMultiColumn() {
        List<WorldUser> worldUserList = getList();
        return worldUserList.stream()
                .collect(Collectors.groupingBy(p->p.getCountry(),
                        Collectors.groupingBy(p->p.getSex(),Collectors.counting())));
    }

    //排序
    public static List<WorldUser> sortByHeight() {
        List<WorldUser> worldUserList = getList();
        return worldUserList.stream()
                .sorted((p1,p2)-> p2.getHeight().compareTo(p1.getHeight()))
                .collect(Collectors.toList());
    }







    //获得宠物名称
    /**
     * [
     *        {
     * 		"name": "刘亦菲",
     * 		"pets": [
     *            {
     * 				"name": "小猪佩奇"
     *            },
     *            {
     * 				"name": "小猪乔治"
     *            }
     * 		]
     *    },
     *    {
     * 		"name": "花泽香菜",
     * 		"pets": [
     *            {
     * 				"name": "小羊苏西"
     *            }
     * 		]
     *    }
     * ]
     * @return
     */
    public static List<JSONObject> getUserPetsName() {
        return getUserWithPets().stream()
                .flatMap(p->p.getJSONArray("pets").toJavaList(JSONObject.class).stream())
                .collect(Collectors.toList());
    }

    public static List<WorldUser> getList() {
        String ss = "[{\"age\": 35, \"sex\": \"female\", \"name\": \"刘亦菲\", \"height\": 170, \"country\": \"china\"}, {\"age\": 25, \"sex\": \"female\", \"name\": \"lisa\", \"height\": 165, \"country\": \"korea\"}, {\"age\": 33, \"sex\": \"female\", \"name\": \"花泽香菜\", \"height\": 157, \"country\": \"japan\"}, {\"age\": 27, \"sex\": \"female\", \"name\": \"辣目洋子\", \"height\": 162, \"country\": \"china\"}, {\"age\": 36, \"sex\": \"female\", \"name\": \"石原里美\", \"height\": 157, \"country\": \"japan\"}, {\"age\": 40, \"sex\": \"male\", \"name\": \"胡歌\", \"height\": 185, \"country\": \"china\"}, {\"age\": 40, \"sex\": \"male\", \"name\": \"彭于晏\", \"height\": 182, \"country\": \"china\"}]";
        List<WorldUser> worldUserList = JSONObject.parseArray(ss, WorldUser.class);
        return worldUserList;
    }

    public static List<JSONObject> getUserWithPets() {
        String ss = "[{\"name\":\"刘亦菲\",\"pets\":[{\"name\":\"小猪佩奇\"},{\"name\":\"小猪乔治\"}]},{\"name\":\"花泽香菜\",\"pets\":[{\"name\":\"小羊苏西\"}]}]";
        return JSONArray.parseArray(ss).toJavaList(JSONObject.class);
    }
}

@Data
class WorldUser {
    Integer age;
    String country;
    Integer height;
    String name;
    String sex;
}