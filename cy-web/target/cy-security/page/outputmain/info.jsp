<!--
* 详情页面
* @author chenyi
* @email 228112142@qq.com
* @date 2018-06-12 20:54:03
*-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ include file="/common/jsp/resource.jsp" %>
</head>
<body>
<div class="layui-field-box">
    <form class="layui-form" action="">
             <div class="layui-form-item">
            <label class="layui-label-left">主键ID<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.outputmainId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">公司id<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.companyId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">出库单号<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.outputmainRef}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">出库仓库id<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.warehouseId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">录单时间<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.inputDate}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">单据状态<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.bill-status}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">业务员id<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.userId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">备注<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.remark}</label>
        </div>
          </form>
</div>
<script>
    $(document).ready(function () {
       var labels=$(".layui-label-right");
       for(var i=0;i<labels.length;i++){
           if($(labels[i]).html()==""){
               $(labels[i]).html("-");
           }
       }
    });
</script>
</body>
</html>
