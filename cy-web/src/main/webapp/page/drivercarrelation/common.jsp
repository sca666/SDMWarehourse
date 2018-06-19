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
                <input type="text"  name="id" maxlength="11"  value="${model.id}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">司机信息表ID<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="dirverinfoId" maxlength="11"  value="${model.dirverinfoId}" lay-verify="required" placeholder="请输入司机信息表ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">车辆信息表ID<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="carinfoId" maxlength="11"  value="${model.carinfoId}" lay-verify="required" placeholder="请输入车辆信息表ID"  class="layui-input">
            </div>
        </div>
      