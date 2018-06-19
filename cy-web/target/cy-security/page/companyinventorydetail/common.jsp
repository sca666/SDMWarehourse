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
                <input type="text"  name="cominvendId" maxlength="20"  value="${model.cominvendId}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">主表id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="cominvenmId" maxlength="20"  value="${model.cominvenmId}" lay-verify="required" placeholder="请输入主表id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">商品id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="commodity" maxlength="11"  value="${model.commodity}" lay-verify="required" placeholder="请输入商品id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">公司id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="companyId" maxlength="11"  value="${model.companyId}" lay-verify="required" placeholder="请输入公司id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">入库单id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="intputId" maxlength="20"  value="${model.intputId}" lay-verify="required" placeholder="请输入入库单id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">出库单id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="outputId" maxlength="20"  value="${model.outputId}" lay-verify="required" placeholder="请输入出库单id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">基本仓租类型<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="basicrentId" maxlength="11"  value="${model.basicrentId}" lay-verify="required" placeholder="请输入基本仓租类型"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">付款标记<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="paymenttype" maxlength="11"  value="${model.paymenttype}" lay-verify="required" placeholder="请输入付款标记"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">入库数量<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="inputnum" maxlength="10,3"  value="${model.inputnum}" lay-verify="required" placeholder="请输入入库数量"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">出库数量<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="outputnum" maxlength="10,3"  value="${model.outputnum}" lay-verify="required" placeholder="请输入出库数量"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">商品结余数量<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="balancenum" maxlength="10,3"  value="${model.balancenum}" lay-verify="required" placeholder="请输入商品结余数量"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">录入时间<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="inputDate" maxlength="20"  value="${model.inputDate}" lay-verify="required" placeholder="请输入录入时间"  class="layui-input">
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
      