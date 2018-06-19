<!--
* 公用页面
* @author chenyi
* @email 228112142@qq.com
* @date 2018-06-12 20:54:04
*-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

                 <div class="layui-form-item">
            <label class="layui-form-label">主键ID<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="basicrentId" maxlength="11"  value="${model.basicrentId}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">基本仓租类型<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="basicrentname" maxlength="50"  value="${model.basicrentname}" lay-verify="required" placeholder="请输入基本仓租类型"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">仓租单价<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="basicrentprice" maxlength="10,3"  value="${model.basicrentprice}" lay-verify="required" placeholder="请输入仓租单价"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备注<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="remark" maxlength="200"  value="${model.remark}" lay-verify="required" placeholder="请输入备注"  class="layui-input">
            </div>
        </div>
      