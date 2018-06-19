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
                <input type="text"  name="id" maxlength="11"  value="${model.id}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">用户Id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="userId" maxlength="255"  value="${model.userId}" lay-verify="required" placeholder="请输入用户Id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">客户id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="customerId" maxlength="255"  value="${model.customerId}" lay-verify="required" placeholder="请输入客户id"  class="layui-input">
            </div>
        </div>
      