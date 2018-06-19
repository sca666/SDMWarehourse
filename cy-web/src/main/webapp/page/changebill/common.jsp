<!--
* 公用页面
* @author chenyi
* @email 228112142@qq.com
* @date 2018-06-12 20:54:02
*-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

                 <div class="layui-form-item">
            <label class="layui-form-label">主键ID<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="changebillId" maxlength="20"  value="${model.changebillId}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">调入公司id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="inputcompanyId" maxlength="11"  value="${model.inputcompanyId}" lay-verify="required" placeholder="请输入调入公司id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">调出公司id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="outputcompanyId" maxlength="11"  value="${model.outputcompanyId}" lay-verify="required" placeholder="请输入调出公司id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">商品id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="commodityId" maxlength="11"  value="${model.commodityId}" lay-verify="required" placeholder="请输入商品id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">调单的入库单id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="intputId" maxlength="11"  value="${model.intputId}" lay-verify="required" placeholder="请输入调单的入库单id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">调单的出库单id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="outputId" maxlength="11"  value="${model.outputId}" lay-verify="required" placeholder="请输入调单的出库单id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">调单数量<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="changenum" maxlength="10,3"  value="${model.changenum}" lay-verify="required" placeholder="请输入调单数量"  class="layui-input">
            </div>
        </div>
      