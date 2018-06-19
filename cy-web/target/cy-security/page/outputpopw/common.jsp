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
                <input type="text"  name="outputpopwId" maxlength="20"  value="${model.outputpopwId}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">出库申请表id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="outputapplyId" maxlength="20"  value="${model.outputapplyId}" lay-verify="required" placeholder="请输入出库申请表id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">出库表id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="outputId" maxlength="20"  value="${model.outputId}" lay-verify="required" placeholder="请输入出库表id"  class="layui-input">
            </div>
        </div>
      