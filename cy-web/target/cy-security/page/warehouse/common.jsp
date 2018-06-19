<!--
* 公用页面
* @author chenyi
* @email 228112142@qq.com
* @date 2018-06-12 20:54:02
*-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

                 <div class="layui-form-item">
            <label class="layui-form-label">主键ID<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="warehouseId" maxlength="11"  value="${model.warehouseId}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">仓库名称<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="warehousrname" maxlength="100"  value="${model.warehousrname}" lay-verify="required" placeholder="请输入仓库名称"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">仓库地址<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="address" maxlength="100"  value="${model.address}" lay-verify="required" placeholder="请输入仓库地址"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">联系电话<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="telephone" maxlength="11"  value="${model.telephone}" lay-verify="required" placeholder="请输入联系电话"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备注<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="remark" maxlength="200"  value="${model.remark}" lay-verify="required" placeholder="请输入备注"  class="layui-input">
            </div>
        </div>
      