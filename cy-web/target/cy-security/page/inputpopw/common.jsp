<!--
* 公用页面
* @author chenyi
* @email 228112142@qq.com
* @date 2018-06-12 20:54:03
*-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

                 <div class="layui-form-item">
            <label class="layui-form-label">主键ID<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="inputpopwId" maxlength="20"  value="${model.inputpopwId}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">入库申请表id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="inputapplyId" maxlength="20"  value="${model.inputapplyId}" lay-verify="required" placeholder="请输入入库申请表id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">入库表id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="inputId" maxlength="20"  value="${model.inputId}" lay-verify="required" placeholder="请输入入库表id"  class="layui-input">
            </div>
        </div>
      