function pass(){

    var data = $grid.selectGetChecked();

    if (data.length == 0) {
        layer.alert('请选择通过审核的数据', {
            icon: 5
        });
    } else {
        var app_ids = "";
        var data_ids = "";
        var csup_ids = "";
        var flag=false;
        $(data).each(function () {
            app_ids += this.rowData.app_id + ",";
            data_ids += this.rowData.data_id + ",";
            csup_ids += this.rowData.csup_id + ",";
            if("通过"===this.rowData.state){
                flag=true;
            }
        });
        if(flag){
            layer.alert('不允许重复通过!', {
                icon: 5
            });
            return false;
        }

        ajaxPostLay({
            url: "queryStatusBeforeAudit.do?isCheck=false",
            para: {
                "type_code": $type_code,
                "filed_code": $filed_code,
                "filed_name": $filed_name,
                "app_ids": app_ids.substring(0, app_ids.length - 1),
                "data_ids": data_ids.substring(0, data_ids.length - 1),
                "csup_ids": csup_ids.substring(0, csup_ids.length - 1),
                "state": 2
            }
        }, function (responseData) {
            var msgs=[];
            for(var p in responseData){
                var e=responseData[p];
                msgs.push('规格:"'+e['spec_name']+'"对应的产品:"'+e['prod_name']+'"审核状态为:'+e['state_text']);
            }
            msgs.push('确定通过审核?');
            var msg=msgs.join(',')

        });
    }
}