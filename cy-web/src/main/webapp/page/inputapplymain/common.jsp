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
                <input type="text"  name="inputapplymainId" maxlength="20"  value="${model.inputapplymainId}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">入库申请表单号<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="inputapplymainRef" maxlength="100"  value="${model.inputapplymainRef}" lay-verify="required" placeholder="请输入入库申请表单号"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">公司id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="companyId" maxlength="100"  value="${model.companyId}" lay-verify="required" placeholder="请输入公司id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">录单人id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="inputUserId" maxlength="11"  value="${model.inputUserId}" lay-verify="required" placeholder="请输入录单人id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">录单时间<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="inputDate" maxlength="20"  value="${model.inputDate}" lay-verify="required" placeholder="请输入录单时间"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">单据状态<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="billStatus" maxlength="11"  value="${model.billStatus}" lay-verify="required" placeholder="请输入单据状态"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">审核人id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="confirmUserId" maxlength="11"  value="${model.confirmUserId}" lay-verify="required" placeholder="请输入审核人id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">审核时间<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="confirmDate" maxlength="20"  value="${model.confirmDate}" lay-verify="required" placeholder="请输入审核时间"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备注<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="remark" maxlength="200"  value="${model.remark}" lay-verify="required" placeholder="请输入备注"  class="layui-input">
            </div>
        </div>
      