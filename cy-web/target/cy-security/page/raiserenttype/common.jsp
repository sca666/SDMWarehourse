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
                <input type="text"  name="raiserentId" maxlength="11"  value="${model.raiserentId}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">加租类型名称<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="raiserentname" maxlength="50"  value="${model.raiserentname}" lay-verify="required" placeholder="请输入加租类型名称"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">单价<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="rasierentprice" maxlength="10,3"  value="${model.rasierentprice}" lay-verify="required" placeholder="请输入单价"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备注<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="remark" maxlength="200"  value="${model.remark}" lay-verify="required" placeholder="请输入备注"  class="layui-input">
            </div>
        </div>
      