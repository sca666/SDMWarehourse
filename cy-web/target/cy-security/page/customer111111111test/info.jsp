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
            <label class="layui-label-left">主键<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.id}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">客户分类id<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.categoryId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">客户编码<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.code}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">客户名称<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.name}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">联系人<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.contact01}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">联系QQ<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.qq01}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">联系固话<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.tel01}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">联系人手机<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.mobile01}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">备用联系人<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.contact02}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">备用联系人QQ<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.qq02}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">备用联系人固话<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.tel02}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">备用联系人手机<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.mobile02}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">地址<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.address}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">发货地址<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.addressShipping}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">收货地址<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.addressReceipt}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">客户名称拼音<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.py}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">开户行<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.bankName}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">开户行账号<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.bankAccount}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">税号<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.taxNumber}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">传真<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.fax}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">备注<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.note}</label>
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
