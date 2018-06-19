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
                <input type="text"  name="dirverinfoId" maxlength="11"  value="${model.dirverinfoId}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">司机名字<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="drivername" maxlength="100"  value="${model.drivername}" lay-verify="required" placeholder="请输入司机名字"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">司机联系电话<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="driverphone" maxlength="20"  value="${model.driverphone}" lay-verify="required" placeholder="请输入司机联系电话"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">车牌号<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="carnum" maxlength="100"  value="${model.carnum}" lay-verify="required" placeholder="请输入车牌号"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备注<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="remark" maxlength="200"  value="${model.remark}" lay-verify="required" placeholder="请输入备注"  class="layui-input">
            </div>
        </div>
      