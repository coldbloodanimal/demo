package com.example.json;

import com.alibaba.fastjson.JSONObject;
import org.springframework.util.ObjectUtils;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author :zw
 * 时间：2023/3/21
 */
public class JSONCompareTest {
    public static void main(String[] args) {
        downloadCertFactory();
        downloadCertProd();
        downloadFactories();
        downloadSuppliers();
        downloadProducts();
    }
    public static void downloadCertSupplier(){
        System.out.println("下载厂商资质");
        String source="{\n" +
                "\t\"end_date\": null,\n" +
                "\t\"fac_id\": null,\n" +
                "\t\"is_new\": 1,\n" +
                "\t\"cert_date\": \"2023-03-01 至 长期\",\n" +
                "\t\"cert_code\": \"234143414\",\n" +
                "\t\"is_long\": 1,\n" +
                "\t\"cert_id\": 609735947200582,\n" +
                "\t\"is_stop\": 0,\n" +
                "\t\"business_scope\": null,\n" +
                "\t\"fac_name\": null,\n" +
                "\t\"cert_name\": \"营业执照\",\n" +
                "\t\"cert_type_name\": \"营业执照\",\n" +
                "\t\"cert_type_code\": \"YYZZCS\",\n" +
                "\t\"cert_files\": [],\n" +
                "\t\"name\": \"342\",\n" +
                "\t\"id\": null,\n" +
                "\t\"start_date\": \"2023-03-01\"\n" +
                "}";
        String target="{\n" +
                "\t\"type\": \"supplier\",\n" +
                "\t\"id\": 1,\n" +
                "\t\"cert_id\": \"200883692860081\",\n" +
                "\t\"cert_code\": \"G1-1.国械准20153102383\",\n" +
                "\t\"cert_type_code\": \"YYZZ\",\n" +
                "\t\"cert_type_name\": \"营业执照\",\n" +
                "\t\"cert_name\": \"营业执照\",\n" +
                "\t\"business_scope\": \"医疗器械类\",\n" +
                "\t\"start_date\": \"2018-01-01\",\n" +
                "\t\"end_date\": \"\",\n" +
                "\t\"is_long\": 1,\n" +
                "\t\"cert_date\": \"2018-01-01至长期\",\n" +
                "\t\"is_stop\": 0,\n" +
                "\t\"is_new\": 1,\n" +
                "\t\"fac_id\": \"产品注册证的时候有厂商id\",\n" +
                "\t\"fac_name\": \"产品注册证的时候有厂商名称\",\n" +
                "\t\"cert_files\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"file_name\": \"fed6a9d853e0873be8f.jpg\",\n" +
                "\t\t\t\"file_name_o\": \"原文件名称.jpg\",\n" +
                "\t\t\t\"file_type\": \".jpg\",\n" +
                "\t\t\t\"file_path\": \"/file/img/\",\n" +
                "\t\t\t\"file_size\": 220,\n" +
                "\t\t\t\"size_unit\": \"KB\"\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}";
        compare(source,target);
    }
    public static void downloadCertFactory(){
        System.out.println("下载厂商资质");
        String source="{\n" +
                "\t\"end_date\": null,\n" +
                "\t\"fac_id\": null,\n" +
                "\t\"is_new\": 1,\n" +
                "\t\"cert_date\": \"2023-03-01 至 长期\",\n" +
                "\t\"cert_code\": \"234143414\",\n" +
                "\t\"is_long\": 1,\n" +
                "\t\"cert_id\": 609735947200582,\n" +
                "\t\"is_stop\": 0,\n" +
                "\t\"business_scope\": null,\n" +
                "\t\"fac_name\": null,\n" +
                "\t\"cert_name\": \"营业执照\",\n" +
                "\t\"cert_type_name\": \"营业执照\",\n" +
                "\t\"cert_type_code\": \"YYZZCS\",\n" +
                "\t\"cert_files\": [],\n" +
                "\t\"name\": \"342\",\n" +
                "\t\"id\": null,\n" +
                "\t\"start_date\": \"2023-03-01\"\n" +
                "}";
        String target="{\n" +
                "\t\"type\": \"supplier\",\n" +
                "\t\"id\": 1,\n" +
                "\t\"cert_id\": \"200883692860081\",\n" +
                "\t\"cert_code\": \"G1-1.国械准20153102383\",\n" +
                "\t\"cert_type_code\": \"YYZZ\",\n" +
                "\t\"cert_type_name\": \"营业执照\",\n" +
                "\t\"cert_name\": \"营业执照\",\n" +
                "\t\"business_scope\": \"医疗器械类\",\n" +
                "\t\"start_date\": \"2018-01-01\",\n" +
                "\t\"end_date\": \"\",\n" +
                "\t\"is_long\": 1,\n" +
                "\t\"cert_date\": \"2018-01-01至长期\",\n" +
                "\t\"is_stop\": 0,\n" +
                "\t\"is_new\": 1,\n" +
                "\t\"fac_id\": \"产品注册证的时候有厂商id\",\n" +
                "\t\"fac_name\": \"产品注册证的时候有厂商名称\",\n" +
                "\t\"cert_files\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"file_name\": \"fed6a9d853e0873be8f.jpg\",\n" +
                "\t\t\t\"file_name_o\": \"原文件名称.jpg\",\n" +
                "\t\t\t\"file_type\": \".jpg\",\n" +
                "\t\t\t\"file_path\": \"/file/img/\",\n" +
                "\t\t\t\"file_size\": 220,\n" +
                "\t\t\t\"size_unit\": \"KB\"\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}";
        compare(source,target);
    }
    public static void downloadCertProd(){
        System.out.println("下载产品资质");
        String source="{\n" +
                "\t\"end_date\": null,\n" +
                "\t\"fac_id\": null,\n" +
                "\t\"is_new\": 1,\n" +
                "\t\"cert_date\": \"2023-03-01 至 长期\",\n" +
                "\t\"cert_code\": \"41243542525\",\n" +
                "\t\"is_long\": 1,\n" +
                "\t\"cert_id\": 326019707954490,\n" +
                "\t\"is_stop\": 0,\n" +
                "\t\"business_scope\": null,\n" +
                "\t\"fac_name\": null,\n" +
                "\t\"cert_name\": \"营业执照\",\n" +
                "\t\"cert_type_name\": \"营业执照\",\n" +
                "\t\"cert_type_code\": \"YYZZ\",\n" +
                "\t\"cert_files\": [],\n" +
                "\t\"name\": null,\n" +
                "\t\"id\": null,\n" +
                "\t\"start_date\": \"2023-03-01\"\n" +
                "}";
        String target="{\n" +
                "\t\"type\": \"supplier\",\n" +
                "\t\"id\": 1,\n" +
                "\t\"cert_id\": \"200883692860081\",\n" +
                "\t\"cert_code\": \"G1-1.国械准20153102383\",\n" +
                "\t\"cert_type_code\": \"YYZZ\",\n" +
                "\t\"cert_type_name\": \"营业执照\",\n" +
                "\t\"cert_name\": \"营业执照\",\n" +
                "\t\"business_scope\": \"医疗器械类\",\n" +
                "\t\"start_date\": \"2018-01-01\",\n" +
                "\t\"end_date\": \"\",\n" +
                "\t\"is_long\": 1,\n" +
                "\t\"cert_date\": \"2018-01-01至长期\",\n" +
                "\t\"is_stop\": 0,\n" +
                "\t\"is_new\": 1,\n" +
                "\t\"fac_id\": \"产品注册证的时候有厂商id\",\n" +
                "\t\"fac_name\": \"产品注册证的时候有厂商名称\",\n" +
                "\t\"cert_files\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"file_name\": \"fed6a9d853e0873be8f.jpg\",\n" +
                "\t\t\t\"file_name_o\": \"原文件名称.jpg\",\n" +
                "\t\t\t\"file_type\": \".jpg\",\n" +
                "\t\t\t\"file_path\": \"/file/img/\",\n" +
                "\t\t\t\"file_size\": 220,\n" +
                "\t\t\t\"size_unit\": \"KB\"\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}";
        compare(source,target);
    }
    public static void downloadFactories(){
        System.out.println("下载生产企业");
        String source="{\n" +
                "\t\t\t\"fac_name\": \"342\",\n" +
                "\t\t\t\"fac_id\": null,\n" +
                "\t\t\t\"fac_type_name\": \"国有企业\",\n" +
                "\t\t\t\"wbx_code\": \"342\",\n" +
                "\t\t\t\"address\": \"232\",\n" +
                "\t\t\t\"province\": null,\n" +
                "\t\t\t\"city\": null,\n" +
                "\t\t\t\"phone\": \"15842561523\",\n" +
                "\t\t\t\"county\": null,\n" +
                "\t\t\t\"cfac_id\": 253647785695912,\n" +
                "\t\t\t\"spell_code\": \"342\"\n" +
                "\t\t}";
        String target="{\n" +
                "\t\"cfac_id\": \"123\",\n" +
                "\t\"fac_id\": \"123\",\n" +
                "\t\"fac_name\": \"哈药iu长\",\n" +
                "\t\"spell_code\": \"HZ****YLQXYXGS\",\n" +
                "\t\"wbx_code\": \"SDFHHJ\",\n" +
                "\t\"fac_type_name\": \"国内生产厂家\",\n" +
                "\t\"province\": \"黑龙江省\",\n" +
                "\t\"city\": \"哈尔滨市\",\n" +
                "\t\"county\": \"道外区\",\n" +
                "\t\"address\": \"黑龙江省哈尔滨市道外区南直路326\",\n" +
                "\t\"phone\": \"0451-55601688\"\n" +
                "}";
        compare(source,target);
    }


    public static void downloadSuppliers(){
        System.out.println("下载配送企业");
        String source="\t\t{\n" +
                "\t\t\t\"is_three_cert\": 0,\n" +
                "\t\t\t\"note\": \"\",\n" +
                "\t\t\t\"wbx_code\": \"UYUKCTAUKSEWDBWN\",\n" +
                "\t\t\t\"address\": \"北京海淀\",\n" +
                "\t\t\t\"csup_id\": 517974169495707,\n" +
                "\t\t\t\"create_time\": 1678353203000,\n" +
                "\t\t\t\"city\": \"其他\",\n" +
                "\t\t\t\"contact_person\": \"王五\",\n" +
                "\t\t\t\"county\": \"其他\",\n" +
                "\t\t\t\"taxpayer\": \"7639234772398231\",\n" +
                "\t\t\t\"is_stop\": 0,\n" +
                "\t\t\t\"sup_id\": 20,\n" +
                "\t\t\t\"sup_name\": \"北京美中双和医疗器械股份有限公司\",\n" +
                "\t\t\t\"bank\": \"中国银行\",\n" +
                "\t\t\t\"update_time\": 1679302195000,\n" +
                "\t\t\t\"province\": \"其他\",\n" +
                "\t\t\t\"phone\": \"17782787387\",\n" +
                "\t\t\t\"short_name\": \"北京美中双和医疗器械股份有限公司\",\n" +
                "\t\t\t\"spell_code\": \"BJMZSHYLQXGFYXGS\",\n" +
                "\t\t\t\"account\": \"美中双和\"\n" +
                "\t\t}";
        String target="{\n" +
                "\t\"csup_id\": \"452479273171139\",\n" +
                "\t\"sup_id\": \"1\",\n" +
                "\t\"sup_name\": \"西安器械有限公司\",\n" +
                "\t\"short_name\": \"西安器械有限公司\",\n" +
                "\t\"province\": \"\",\n" +
                "\t\"city\": \"\",\n" +
                "\t\"county\": \"\",\n" +
                "\t\"address\": \"东泰安南天门大街东华软件\",\n" +
                "\t\"phone\": \"\",\n" +
                "\t\"spell_code\": \"\",\n" +
                "\t\"wbx_code\": \"\",\n" +
                "\t\"is_three_cert\": \"\",\n" +
                "\t\"is_stop\": \"\",\n" +
                "\t\"note\": \"\",\n" +
                "\t\"taxpayer\": \"\",\n" +
                "\t\"bank\": \"\",\n" +
                "\t\"account\": \"\",\n" +
                "\t\"contract_person\": \"联系人\",\n" +
                "\t\"create_time\": \"创建时间\",\n" +
                "\t\"update_time\": \"更新时间\"\n" +
                "}";
        compare(source,target);
    }

    public static void downloadProducts(){
        System.out.println("下载品规");
        String source="{\n" +
                "\t\"is_impl\": 0,\n" +
                "\t\"cert_code\": \"12433214\",\n" +
                "\t\"prod_type_name1\": \"耗材\",\n" +
                "\t\"is_table\": 0,\n" +
                "\t\"prod_id\": 382860035285675,\n" +
                "\t\"prod_type_name2\": null,\n" +
                "\t\"hos_cat_name\": null,\n" +
                "\t\"contract_code\": null,\n" +
                "\t\"yb_code\": null,\n" +
                "\t\"price\": 0.0,\n" +
                "\t\"app_date\": \"2023-03-20\",\n" +
                "\t\"model\": \"\",\n" +
                "\t\"origin_name\": \"德国\",\n" +
                "\t\"is_collect_purchase\": null,\n" +
                "\t\"fac_id\": 1174,\n" +
                "\t\"csup_id\": 517974169495707,\n" +
                "\t\"check_state\": 2,\n" +
                "\t\"is_hospbarcode\": 0,\n" +
                "\t\"weight\": \"1kg\",\n" +
                "\t\"brand_name\": \"泰瑞\",\n" +
                "\t\"origin_type\": 2,\n" +
                "\t\"stora_term\": \"必须冷藏\",\n" +
                "\t\"volume\": \"1平方米\",\n" +
                "\t\"fac_name\": \"西安\",\n" +
                "\t\"term_name\": \"\",\n" +
                "\t\"yb_fac_name\": \"\",\n" +
                "\t\"is_batch_date_required\": 1,\n" +
                "\t\"yb_serialno\": null,\n" +
                "\t\"end_date\": null,\n" +
                "\t\"yb_classify2\": \"\",\n" +
                "\t\"yb_classify3\": \"\",\n" +
                "\t\"chos_id\": 103128929954347,\n" +
                "\t\"is_batch_no_required\": 1,\n" +
                "\t\"is_cold\": 1,\n" +
                "\t\"yb_classify1\": \"\",\n" +
                "\t\"sup_id\": 20,\n" +
                "\t\"yb_specs\": \"\",\n" +
                "\t\"is_temp\": 0,\n" +
                "\t\"tender_name\": null,\n" +
                "\t\"spec_id\": 165565547925296,\n" +
                "\t\"inv_id\": 4504,\n" +
                "\t\"yb_prod_name\": \"\",\n" +
                "\t\"start_date\": \"2023-03-15\",\n" +
                "\t\"sunbid_code\": \"\",\n" +
                "\t\"hos_cat_id\": null,\n" +
                "\t\"receive_unit\": \"袋\",\n" +
                "\t\"is_long\": 1,\n" +
                "\t\"prod_name\": \"小柴胡\",\n" +
                "\t\"is_inva_date_required\": 1,\n" +
                "\t\"cert_batch\": null,\n" +
                "\t\"is_sno\": 0,\n" +
                "\t\"yb_material\": \"\",\n" +
                "\t\"spec_name_sec\": \"\",\n" +
                "\t\"bar_code\": \"\",\n" +
                "\t\"yb_name\": \"\",\n" +
                "\t\"hos_tender_name\": null,\n" +
                "\t\"spec_name\": \"1313\",\n" +
                "\t\"is_escrow\": 0\n" +
                "}";
        String target="{\n" +
                "\t\"is_impl\": 0,\n" +
                "\t\"cert_code\": \"国械注进307005\",\n" +
                "\t\"prod_type_name1\": \"耗材\",\n" +
                "\t\"is_table\": 0,\n" +
                "\t\"prod_id\": 627531513254505,\n" +
                "\t\"prod_type_name2\": null,\n" +
                "\t\"hos_cat_name\": null,\n" +
                "\t\"contract_code\": null,\n" +
                "\t\"yb_code\": \"医保代码307005\",\n" +
                "\t\"price\": 10.0,\n" +
                "\t\"app_date\": \"2023-03-07\",\n" +
                "\t\"model\": \"100ml/瓶\",\n" +
                "\t\"origin_name\": null,\n" +
                "\t\"is_collect_purchase\": null,\n" +
                "\t\"fac_id\": 3,\n" +
                "\t\"csup_id\": 233496799576937,\n" +
                "\t\"check_state\": 2,\n" +
                "\t\"is_hospbarcode\": 0,\n" +
                "\t\"weight\": \"\",\n" +
                "\t\"brand_name\": null,\n" +
                "\t\"origin_type\": 1,\n" +
                "\t\"stora_term\": null,\n" +
                "\t\"volume\": \"\",\n" +
                "\t\"fac_name\": \"ABBOTT\",\n" +
                "\t\"term_name\": null,\n" +
                "\t\"yb_fac_name\": \"耗材企业-山东天悦\",\n" +
                "\t\"is_batch_date_required\": 1,\n" +
                "\t\"yb_serialno\": \"1234567\",\n" +
                "\t\"end_date\": \"2050-12-01\",\n" +
                "\t\"yb_classify2\": \"2\",\n" +
                "\t\"yb_classify3\": \"3\",\n" +
                "\t\"chos_id\": 640293833623170,\n" +
                "\t\"is_batch_no_required\": 1,\n" +
                "\t\"is_cold\": 0,\n" +
                "\t\"yb_classify1\": \"1\",\n" +
                "\t\"sup_id\": 10,\n" +
                "\t\"yb_specs\": \"特征：液体\",\n" +
                "\t\"is_temp\": 0,\n" +
                "\t\"tender_name\": null,\n" +
                "\t\"spec_id\": 383321882820362,\n" +
                "\t\"inv_id\": 307005,\n" +
                "\t\"yb_prod_name\": \"单件产品名称：碘伏\",\n" +
                "\t\"start_date\": \"2018-07-14\",\n" +
                "\t\"sunbid_code\": null,\n" +
                "\t\"hos_cat_id\": null,\n" +
                "\t\"receive_unit\": \"瓶\",\n" +
                "\t\"is_long\": 0,\n" +
                "\t\"prod_name\": \"碘伏005\",\n" +
                "\t\"is_inva_date_required\": 1,\n" +
                "\t\"cert_batch\": null,\n" +
                "\t\"is_sno\": 0,\n" +
                "\t\"yb_material\": \"材质：木+棉\",\n" +
                "\t\"spec_name_sec\": null,\n" +
                "\t\"bar_code\": null,\n" +
                "\t\"yb_name\": \"医保通用名-碘伏\",\n" +
                "\t\"hos_tender_name\": null,\n" +
                "\t\"spec_name\": \"100ml/瓶\",\n" +
                "\t\"is_escrow\": 0\n" +
                "}";
        compare(source,target);
    }

    public static void compare(String source,String target){
        Map<String,Object> s= JSONObject.parseObject(source);
        Map<String,Object> t= JSONObject.parseObject(target);
        //检测缺少字段
        Set<String> lessKeys=t.keySet().stream().filter(p->!s.keySet().contains(p)).collect(Collectors.toSet());
        if(ObjectUtils.isEmpty(lessKeys)){
            System.out.println("无字段缺失");
        }else{
            System.out.println("缺少字段："+lessKeys.stream().collect(Collectors.joining("、")));
        }
        //值为空的key
        Set<String> nullKeys=t.keySet().stream().filter(p->ObjectUtils.isEmpty(s.get(p))).collect(Collectors.toSet());
        System.out.println("值为空的字段："+nullKeys.stream().collect(Collectors.joining("、")));


    }
}
