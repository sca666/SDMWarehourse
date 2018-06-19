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
                <input type="text"  name="housesetmaindetailId" maxlength="20"  value="${model.housesetmaindetailId}" lay-verify="required" placeholder="请输入主键ID"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">主表id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="housesetmainId" maxlength="20"  value="${model.housesetmainId}" lay-verify="required" placeholder="请输入主表id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">明细表id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="housesetdetailId" maxlength="20"  value="${model.housesetdetailId}" lay-verify="required" placeholder="请输入明细表id"  class="layui-input">
            </div>
        </div>
      