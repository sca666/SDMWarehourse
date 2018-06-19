<%--
  Created by chenyi
  email: 228112142@qq.com
  Date : 2018-06-12 20:54:04
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>商品分类</title>
    <%@ include file="/common/jsp/resource.jsp" %>
    <script type="text/javascript" src="/page/category/js/list.js"></script>
</head>
<body>
<form class="layui-form " action="">
    <div class="layui-form-item">
        <label class="layui-form-label">名称:</label>
        <div class="layui-input-inline">
            <input type="text" name="name"  placeholder="请输入商品类型名称" class="layui-input">
        </div>

        <div class="layui-input-inline">
            <button class="layui-btn search-btn"
                    table-id="categoryTable" lay-submit=""
                    lay-filter="search"><i class="fa fa-search">&nbsp;</i>查询
            </button>
            <button type="reset" class="layui-btn layui-btn-primary"><i class="fa fa-refresh">&nbsp;</i>重置</button>
        </div>
    </div>
</form>
<div class="layui-btn-group">
        <shiro:hasPermission name="category:save">
        <button class="layui-btn" onclick="addPage('/category/add')">
            <i class="fa fa-plus">&nbsp;</i>增加
        </button>
        </shiro:hasPermission>
        <shiro:hasPermission name="category:update">
        <button class="layui-btn" onclick="editPage('categoryTable','/category/edit')">
            <i class="fa fa-pencil-square-o">&nbsp;</i>修改
        </button>
         <%--<button class="layui-btn layui-btn-green" onclick="updateState('批量启用','categoryTable','/category/enable')">--%>
            <%--<i class="fa fa-check-square-o">&nbsp;</i>启用--%>
        <%--</button>--%>
        <%--<button class="layui-btn  layui-btn-danger" onclick="updateState('批量禁用','categoryTable','/category/limit')">--%>
            <%--<i class="fa fa-expeditedssl">&nbsp;</i>禁用--%>
        <%--</button>--%>
        </shiro:hasPermission>
        <shiro:hasPermission name="category:delete">
         <button class="layui-btn layui-btn-delete" onclick="deleteBatch('批量删除','categoryTable','/category/delete');">
            <i class="fa fa-trash-o">&nbsp;</i>删除
        </button>
        </shiro:hasPermission>

</div>
<div class="layui-form ">
    <table class="layui-table" id="categoryTable" cyType="pageGrid"
           cyProps="url:'/category/list',checkbox:'true',pageColor:'#2991d9'">
        <thead>
        <tr>
            <!--复选框-->
            <th width="1%" param="{type:'checkbox'}">
                <input type="checkbox" lay-skin="primary" lay-filter="allChoose">
            </th>
            			            <!--isPrimary：是否是主键-->
            <th width="10%" param="{name:'categoryId',isPrimary:'true',hide:'true'}">主键ID</th>

		          <th width="10%" param="{name:'name'}">商品分类名称</th>

                  <th width="10%" param="{name:'code'}">商品分类编码</th>

		          <%--<th width="10%" param="{name:'parentId'}">商品分类父类id</th>--%>
			            			
		          <%--<th width="10%" param="{name:'fullName'}">商品分类全名</th>--%>
                  <th width="10%" param="{name:'parentName'}">商品父类名称</th>
			            			
		          <th width="10%" param="{name:'remark'}">备注</th>
			                        <!--isPrimary：渲染列-->
            <th width="10%" param="{operate:'true',buttons:'Render.state,Render.edit,Render.delete'}">操作</th>
        </tr>
        </thead>
    </table>
</div>
</body>
</html>