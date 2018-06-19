<!--
* 详情页面
* @author chenyi
* @email 228112142@qq.com
* @date 2018-06-12 20:54:04
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
            <label class="layui-label-right">${model.inputdetailId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">主表id<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.inputmainId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">公司id<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.companyId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">商品id<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.commodityId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">入库数量<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.inputnum}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">录单时间<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.inputDate}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">基本仓租类型<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.basicrentId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">加租仓租类型<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.raiserentId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">司机id<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.driverId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">车辆id<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.carId}</label>
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
