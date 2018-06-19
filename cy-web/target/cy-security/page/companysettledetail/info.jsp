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
            <label class="layui-label-right">${model.comsetdetailId}</label>
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
            <label class="layui-label-left">出库数量<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.outputnum}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">未出库数量<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.balancenum}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">入库申请单id<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.inputapplyId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">出库申请单id<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.outputapplyId}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">入库时间<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.intputDate}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">出库时间<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.outputDate}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">存放天数<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.depositDays}</label>
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
            <label class="layui-label-left">付款标记<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.paymenttype}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">结算状态<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.settlementStatus}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">单价<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.price}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">应付金额<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.totalMoney}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">装车费<span class="label_span">:</span></label>
            <label class="layui-label-right">${model.loadingcost}</label>
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
