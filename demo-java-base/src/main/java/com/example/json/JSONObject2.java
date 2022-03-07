package com.example.json;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author: zw
 * @Date: 2021/12/21 16:07
 */
public class JSONObject2 {
	public static void main(String[] args) {
		String json="{\"returnCode\":1,\"returnMsg\":\"业务执行成功\",\"dataSet\":[{\"deviceRecordKey\":\"00195278517159202111190911070\",\"versionNumber\":1,\"versionStatus\":\"新增\",\"versionTime\":\"2021-11-30\n" +
				"00:00:00\",\"deviceClinical\":[{\"ccdw\":\"DD\",\"ccz\":\"1\",\"lcsycclx\":\"ANGLE\"}],\"devicePackage\":[],\"deviceStorage\":[{\"cchcztj\":\"STORAGE_HANDLING\",\"jldw\":\"CEL\",\"zdz\":\"1\",\"zgz\":\"11\"}],\"contactList\":[],\"ybbm\":\"\",\"sydycpbs\":\"\",\"btcpbs\":\"\",\"cpms\":\"test\",\"zxxsdycpbs\":\"00195278517159\",\"flbm\":\"21\",\"cphhhbh\":\"\",\"ylqxzcrbarmc\":\"通用电气医疗系统信息技术公司\",\"cpmctymc\":\"心电信息管理软件\",\"spmc\":\"Test\",\"ggxh\":\"9.0\",\"sfybtzjbs\":\"否\",\"sfwblztlcp\":\"否\",\"zdcfsycs\":\"\",\"mjfs\":\"[\\\"OZONE\\\"]\",\"cpbsfbrq\":\"2021-11-30\",\"tyshxydm\":\"91310000607327827A\",\"cpbsbmtxmc\":\"GS1\",\"btcpbsyzxxsdycpbssfyz\":\"\",\"sfbjwycxsy\":\"是\",\"zczbhhzbapzbh\":\"国械注进20162705149\",\"ylqxzcrbarywmc\":\"GE\n" +
				"Medical Systems Information Technologies,\n" +
				"Inc.\",\"zxxsdyzsydydsl\":\"1\",\"bszt\":\"一维码\",\"tsrq\":\"\",\"qtxxdwzlj\":\"\",\"scbssfbhsxrq\":\"是\",\"scbssfbhscrq\":\"是\",\"scbssfbhph\":\"是\",\"scbssfbhxlh\":\"是\",\"tsccsm\":\"\",\"tscchcztj\":\"\",\"qxlb\":\"器械\",\"cplb\":\"设备\",\"yflbm\":\"\",\"sfwwjbz\":\"是\",\"syqsfxyjxmj\":\"是\",\"cgzmraqxgxx\":\"条件安全\"}]}";
		JSONObject jj=JSONObject.parseObject(json);
		System.out.println(jj.toJSONString());
		System.out.println(jj);

	}
}
