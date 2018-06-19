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
                <input type="text"  name="outputapplydetailId" maxlength="20"  value="${model.outputapplydetailId}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">主表id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="outputapplymainId" maxlength="20"  value="${model.outputapplymainId}" lay-verify="required" placeholder="请输入主表id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">商品id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="commodityId" maxlength="11"  value="${model.commodityId}" lay-verify="required" placeholder="请输入商品id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">计划出库数量<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="planoutputnum" maxlength="10,3"  value="${model.planoutputnum}" lay-verify="required" placeholder="请输入计划出库数量"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">实际已出库数量<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="actualoutputnum`actualinputnum" maxlength="10,3"  value="${model.actualoutputnum`actualinputnum}" lay-verify="required" placeholder="请输入实际已出库数量"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">调单出库数量<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="allocaoutputnum" maxlength="10,3"  value="${model.allocaoutputnum}" lay-verify="required" placeholder="请输入调单出库数量"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">调单出库数量<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="notoutputnum" maxlength="10,3"  value="${model.notoutputnum}" lay-verify="required" placeholder="请输入调单出库数量"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">计量单位id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="unitId" maxlength="11"  value="${model.unitId}" lay-verify="required" placeholder="请输入计量单位id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">录单时间<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="outputDate" maxlength="20"  value="${model.outputDate}" lay-verify="required" placeholder="请输入录单时间"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备注<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="remark" maxlength="200"  value="${model.remark}" lay-verify="required" placeholder="请输入备注"  class="layui-input">
            </div>
        </div>
      