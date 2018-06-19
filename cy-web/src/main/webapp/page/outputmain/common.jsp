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
                <input type="text"  name="outputmainId" maxlength="20"  value="${model.outputmainId}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">公司id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="companyId" maxlength="11"  value="${model.companyId}" lay-verify="required" placeholder="请输入公司id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">出库单号<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="outputmainRef" maxlength="100"  value="${model.outputmainRef}" lay-verify="required" placeholder="请输入出库单号"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">出库仓库id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="warehouseId" maxlength="11"  value="${model.warehouseId}" lay-verify="required" placeholder="请输入出库仓库id"  class="layui-input">
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
                <input type="text"  name="bill-status" maxlength="11"  value="${model.bill-status}" lay-verify="required" placeholder="请输入单据状态"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">业务员id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="userId" maxlength="11"  value="${model.userId}" lay-verify="required" placeholder="请输入业务员id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备注<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="remark" maxlength="200"  value="${model.remark}" lay-verify="required" placeholder="请输入备注"  class="layui-input">
            </div>
        </div>
      