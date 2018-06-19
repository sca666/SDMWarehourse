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
            <label class="layui-label-right">${model.commodityId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left"> 商品分类id<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.categoryId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">商品code<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.code}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">商品名称<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.name}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">计量单位编码<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.unitCode}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">规格型号<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.spec}</label>
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
