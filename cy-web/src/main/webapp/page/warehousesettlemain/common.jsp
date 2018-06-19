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
                <input type="text"  name="housesetmainId" maxlength="20"  value="${model.housesetmainId}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">仓库id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="warehouseId" maxlength="11"  value="${model.warehouseId}" lay-verify="required" placeholder="请输入仓库id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">应付金额<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="totalMoney" maxlength="10,3"  value="${model.totalMoney}" lay-verify="required" placeholder="请输入应付金额"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">已付金额<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="paidMoney" maxlength="10,3"  value="${model.paidMoney}" lay-verify="required" placeholder="请输入已付金额"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">未付金额<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="unpidMoney" maxlength="10,3"  value="${model.unpidMoney}" lay-verify="required" placeholder="请输入未付金额"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">制表日期<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="settleDate" maxlength="20"  value="${model.settleDate}" lay-verify="required" placeholder="请输入制表日期"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备注<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="remark" maxlength="200"  value="${model.remark}" lay-verify="required" placeholder="请输入备注"  class="layui-input">
            </div>
        </div>
      