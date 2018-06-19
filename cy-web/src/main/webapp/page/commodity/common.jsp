<!--
* 公用页面
* @author chenyi
* @email 228112142@qq.com
* @date 2018-06-12 20:54:04
*-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

                 <%--<div class="layui-form-item">--%>
            <%--<label class="layui-form-label">主键ID<span class="span_must">*</span></label>--%>
            <%--<div class="layui-input-normal">--%>
                <%--<input type="text"  name="commodityId" maxlength="11"  value="${model.commodityId}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">--%>
            <%--</div>--%>
        <%--</div>--%>

<div class="layui-form-item">
    <label class="layui-form-label">商品所属类<span class="span_must">*</span></label>
    <div class="layui-input-normal">
        <input value=""  id="parent" cyType="treeTool"  lay-verify="required"
               cyProps="url:'/category/select',name:'categoryId'"
               placeholder="请选择商品所属类" class="layui-input"/>
<%--<input type="text"   style="display: none" name="parentId"  class="layui-input">--%>
<!-- 选择菜单 -->
</div>
</div>
              <div class="layui-form-item">
            <label class="layui-form-label">商品code<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="code" maxlength="100"  value="${model.code}" lay-verify="required" placeholder="请输入商品code"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">商品名称<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="name" maxlength="100"  value="${model.name}" lay-verify="required" placeholder="请输入商品名称"  class="layui-input">
            </div>
        </div>
              <%--<div class="layui-form-item">--%>
            <%--<label class="layui-form-label">计量单位编码<span class="span_must">*</span></label>--%>
            <%--<div class="layui-input-normal">--%>
                <%--<input type="text"  name="unitCode" maxlength="100"  value="${model.unitCode}" lay-verify="required" placeholder="请输入计量单位编码"  class="layui-input">--%>
            <%--</div>--%>
        <%--</div>--%>


<div class="layui-form-item">
    <label class="layui-form-label">计量单位<span class="span_must">*</span></label>
    <div cyType="selectTool" cyProps="url:'/meteringunit/getunit',search:'true',filter:'demo'"
         name="unitCode" value="1" class="layui-input-inline"></div>
</div>



              <div class="layui-form-item">
            <label class="layui-form-label">规格型号<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="spec" maxlength="100"  value="${model.spec}" lay-verify="required" placeholder="请输入规格型号"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备注<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="remark" maxlength="200"  value="${model.remark}" placeholder="请输入备注"  class="layui-input">
            </div>
        </div>
      