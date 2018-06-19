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
            <label class="layui-label-right">${model.inputapplydetailId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">主表id<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.intputapplymainId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">商品id<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.commodityId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">计划入库数量<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.planinputnum}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">实际已入库数量<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.actualinputnum`actualinputnum}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">调单入库数量<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.allocainputnum}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">调单入库数量<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.notinputnum}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">计量单位id<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.unitId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">录单时间<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.inputDate}</label>
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
