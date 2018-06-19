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
                <input type="text"  name="inputapplydetailId" maxlength="20"  value="${model.inputapplydetailId}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">主表id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="intputapplymainId" maxlength="20"  value="${model.intputapplymainId}" lay-verify="required" placeholder="请输入主表id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">商品id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="commodityId" maxlength="11"  value="${model.commodityId}" lay-verify="required" placeholder="请输入商品id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">计划入库数量<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="planinputnum" maxlength="10,3"  value="${model.planinputnum}" lay-verify="required" placeholder="请输入计划入库数量"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">实际已入库数量<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="actualinputnum`actualinputnum" maxlength="10,3"  value="${model.actualinputnum`actualinputnum}" lay-verify="required" placeholder="请输入实际已入库数量"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">调单入库数量<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="allocainputnum" maxlength="10,3"  value="${model.allocainputnum}" lay-verify="required" placeholder="请输入调单入库数量"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">调单入库数量<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="notinputnum" maxlength="10,3"  value="${model.notinputnum}" lay-verify="required" placeholder="请输入调单入库数量"  class="layui-input">
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
                <input type="text"  name="inputDate" maxlength="20"  value="${model.inputDate}" lay-verify="required" placeholder="请输入录单时间"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备注<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="remark" maxlength="200"  value="${model.remark}" lay-verify="required" placeholder="请输入备注"  class="layui-input">
            </div>
        </div>
      