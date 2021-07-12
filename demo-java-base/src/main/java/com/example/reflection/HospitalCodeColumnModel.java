package com.example.reflection;

import lombok.Data;

/***
 * 院内码打印属性
 */
@Data
public class HospitalCodeColumnModel {
	@PrintModelProperty(text="产品名称")
	private String prod_name;
	@PrintModelProperty(text="规格型号")
	private String spec_name;
	@PrintModelProperty(text="生产批号")
	private String batch_no;
	@PrintModelProperty(text="生产日期")
	private String batch_date;
	@PrintModelProperty(text="有效期")
	private String inva_date;
	@PrintModelProperty(text="院内码")
	private String hosp_barcode;
	@PrintModelProperty(text="序列号码")
	private String serial_no;
	@PrintModelProperty(text="配送企业")
	private String sup_name;
}
