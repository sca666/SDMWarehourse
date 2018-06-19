<!--
* 详情页面
* @author chenyi
* @email 228112142@qq.com
* @date 2018-06-15 14:56:37
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
            <label class="layui-label-right">${model.id}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">分类编码<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.code}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">分类名称<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.name}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">上级ID<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.parentId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">公司Id<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.companyId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">价格体系<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.psId}</label>
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
