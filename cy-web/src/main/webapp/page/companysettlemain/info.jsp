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
            <label class="layui-label-right">${model.comsetmainId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">公司id<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.companyId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">应付金额<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.totalMoney}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">已付金额<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.paidMoney}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">未付金额<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.unpidMoney}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">制表日期<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.settleDate}</label>
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
