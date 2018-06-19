<%--
  Created by chenyi
  email: 228112142@qq.com
  Date : 2018-06-12 20:54:03
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>客户结算明细表</title>
    <%@ include file="/common/jsp/resource.jsp" %>
    <script type="text/javascript" src="/page/companysettledetail/js/list.js"></script>
</head>
<body>
<form class="layui-form " action="">
    <div class="layui-form-item">
        <label class="layui-form-label">名称:</label>
        <div class="layui-input-inline">
            <input type="text" name=""  placeholder="请输入名称" class="layui-input">
        </div>

        <div class="layui-input-inline">
            <button class="layui-btn search-btn" table-id="companysettledetailTable" lay-submit="" lay-filter="search"><i class="fa fa-search">&nbsp;</i>查询
            </button>
            <button type="reset" class="layui-btn layui-btn-primary"><i class="fa fa-refresh">&nbsp;</i>重置</button>
        </div>
    </div>
</form>
<div class="layui-btn-group">
        <shiro:hasPermission name="companysettledetail:save">
        <button class="layui-btn" onclick="addPage('/companysettledetail/add')">
            <i class="fa fa-plus">&nbsp;</i>增加
        </button>
        </shiro:hasPermission>
        <shiro:hasPermission name="companysettledetail:update">
        <button class="layui-btn" onclick="editPage('commparaTable','/companysettledetail/edit')">
            <i class="fa fa-pencil-square-o">&nbsp;</i>修改
        </button>
         <button class="layui-btn layui-btn-green" onclick="updateState('批量启用','companysettledetailTable','/companysettledetail/enable')">
            <i class="fa fa-check-square-o">&nbsp;</i>启用
        </button>
        <button class="layui-btn  layui-btn-danger" onclick="updateState('批量禁用','companysettledetailTable','/companysettledetail/limit')">
            <i class="fa fa-expeditedssl">&nbsp;</i>禁用
        </button>
        </shiro:hasPermission>
        <shiro:hasPermission name="companysettledetail:delete">
         <button class="layui-btn layui-btn-delete" onclick="deleteBatch('批量删除','companysettledetailTable','/companysettledetail/delete');">
            <i class="fa fa-trash-o">&nbsp;</i>删除
        </button>
        </shiro:hasPermission>

</div>
<div class="layui-form ">
    <table class="layui-table" id="companysettledetailTable" cyType="pageGrid"
           cyProps="url:'/companysettledetail/list',checkbox:'true',pageColor:'#2991d9'">
        <thead>
        <tr>
            <!--复选框-->
            <th width="1%" param="{type:'checkbox'}">
                <input type="checkbox" lay-skin="primary" lay-filter="allChoose">
            </th>
            			            <!--isPrimary：是否是主键-->
            <th width="10%" param="{name:'comsetdetailId',isPrimary:'true',hide:'true'}">主键ID</th>
            
		                			
		          <th width="10%" param="{name:'companyId'}">公司id</th>
			            			
		          <th width="10%" param="{name:'commodityId'}">商品id</th>
			            			
		          <th width="10%" param="{name:'outputnum'}">出库数量</th>
			            			
		          <th width="10%" param="{name:'balancenum'}">未出库数量</th>
			            			
		          <th width="10%" param="{name:'inputapplyId'}">入库申请单id</th>
			            			
		          <th width="10%" param="{name:'outputapplyId'}">出库申请单id</th>
			            			
		          <th width="10%" param="{name:'intputDate'}">入库时间</th>
			            			
		          <th width="10%" param="{name:'outputDate'}">出库时间</th>
			            			
		          <th width="10%" param="{name:'depositDays'}">存放天数</th>
			            			
		          <th width="10%" param="{name:'basicrentId'}">基本仓租类型</th>
			            			
		          <th width="10%" param="{name:'raiserentId'}">加租仓租类型</th>
			            			
		          <th width="10%" param="{name:'paymenttype'}">付款标记</th>
			            			
		          <th width="10%" param="{name:'settlementStatus'}">结算状态</th>
			            			
		          <th width="10%" param="{name:'price'}">单价</th>
			            			
		          <th width="10%" param="{name:'totalMoney'}">应付金额</th>
			            			
		          <th width="10%" param="{name:'loadingcost'}">装车费</th>
			            			
		          <th width="10%" param="{name:'remark'}">备注</th>
			                        <!--isPrimary：渲染列-->
            <th width="10%" param="{name:'state',enumName:'StateEnum',render:'Render.customState'}">状态</th>
            <th width="10%" param="{operate:'true',buttons:'Render.state,Render.edit,Render.delete'}">操作</th>
        </tr>
        </thead>
    </table>
</div>
</body>
</html>