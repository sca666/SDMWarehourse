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
                <%--<input type="text"  name="unitId" maxlength="11"  value="${model.unitId}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">--%>
            <%--</div>--%>
        <%--</div>--%>
              <div class="layui-form-item">
            <label class="layui-form-label">单位编码<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="unitcode" maxlength="10"  value="${model.unitcode}" placeholder="请输入单位编码"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">单位名称<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="unitname" maxlength="10"  value="${model.unitname}" lay-verify="required" placeholder="请输入单位名称"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备注<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="remark" maxlength="200"  value="${model.remark}" lay-verify="required" placeholder="请输入备注"  class="layui-input">
            </div>
        </div>
      