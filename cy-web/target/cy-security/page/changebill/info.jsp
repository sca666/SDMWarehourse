<!--
* 详情页面
* @author chenyi
* @email 228112142@qq.com
* @date 2018-06-12 20:54:02
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
            <label class="layui-label-right">${model.changebillId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">调入公司id<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.inputcompanyId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">调出公司id<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.outputcompanyId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">商品id<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.commodityId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">调单的入库单id<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.intputId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">调单的出库单id<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.outputId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">调单数量<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.changenum}</label>
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
