<!--
* 公用页面
* @author chenyi
* @email 228112142@qq.com
* @date 2018-06-12 20:54:04
*-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta charset="UTF-8">

                 <%--<div class="layui-form-item">--%>
            <%--<label class="layui-form-label">主键ID<span class="span_must">*</span></label>--%>
            <%--<div class="layui-input-normal">--%>
                <%--<input type="text"  name="categoryId" maxlength="11"  value="${model.categoryId}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">--%>
            <%--</div>--%>
        <%--</div>--%>
              <div class="layui-form-item">
            <label class="layui-form-label">商品分类编码<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="code" maxlength="100"  value="${model.code}" lay-verify="required" placeholder="请输入商品分类编码"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">商品分类名称<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="name" maxlength="100"  value="${model.name}" lay-verify="required" placeholder="请输入商品分类名称"  class="layui-input">
            </div>
        </div>
              <%--<div class="layui-form-item">--%>
            <%--<label class="layui-form-label">商品分类父类id<span class="span_must">*</span></label>--%>
            <%--<div class="layui-input-normal">--%>
                <%--<input type="text"  name="parentId" maxlength="11"  value="${model.parentId}" lay-verify="required" placeholder="请输入商品分类父类id"  class="layui-input">--%>
            <%--</div>--%>
        <%--</div>--%>
<div class="layui-form-item">
    <label class="layui-form-label">上级商品类别<span class="span_must">*</span></label>
    <div class="layui-input-normal">
        <input value=""  id="parent" cyType="treeTool"  lay-verify="required"
               cyProps="url:'/category/select',name:'parentId'"
               placeholder="请选择上级商品类别" class="layui-input"/>
        <%--<input type="text"   style="display: none" name="parentId"  class="layui-input">--%>
        <!-- 选择菜单 -->
    </div>
</div>
              <div class="layui-form-item">
            <label class="layui-form-label">商品分类全名<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="fullName" maxlength="100"  value="${model.fullName}" lay-verify="required" placeholder="请输入商品分类全名"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备注<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="remark" maxlength="200"  value="${model.remark}"  placeholder="请输入备注"  class="layui-input">
            </div>
        </div>
      