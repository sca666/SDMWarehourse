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
                <input type="text"  name="outputdetailId" maxlength="20"  value="${model.outputdetailId}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">主表id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="outputmainId" maxlength="20"  value="${model.outputmainId}" lay-verify="required" placeholder="请输入主表id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">公司id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="companyId" maxlength="11"  value="${model.companyId}" lay-verify="required" placeholder="请输入公司id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">商品id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="commodityId" maxlength="11"  value="${model.commodityId}" lay-verify="required" placeholder="请输入商品id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">出库数量<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="outputnum" maxlength="10,3"  value="${model.outputnum}" lay-verify="required" placeholder="请输入出库数量"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">录单时间<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="outputDate" maxlength="20"  value="${model.outputDate}" lay-verify="required" placeholder="请输入录单时间"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">司机id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="driverId" maxlength="11"  value="${model.driverId}" lay-verify="required" placeholder="请输入司机id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">车辆id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="carId" maxlength="11"  value="${model.carId}" lay-verify="required" placeholder="请输入车辆id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">付款标记<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="paymenttype" maxlength="11"  value="${model.paymenttype}" lay-verify="required" placeholder="请输入付款标记"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">基本仓租类型<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="basicrentId" maxlength="11"  value="${model.basicrentId}" lay-verify="required" placeholder="请输入基本仓租类型"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">装车费<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="loadingcost" maxlength="10,3"  value="${model.loadingcost}" lay-verify="required" placeholder="请输入装车费"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备注<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="remark" maxlength="200"  value="${model.remark}" lay-verify="required" placeholder="请输入备注"  class="layui-input">
            </div>
        </div>
      