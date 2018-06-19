<!--
* 公用页面
* @author chenyi
* @email 228112142@qq.com
* @date 2018-06-12 20:54:04
*-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

                 <div class="layui-form-item">
            <label class="layui-form-label">主键<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="id" maxlength="11"  value="${model.id}" lay-verify="required" placeholder="请输入主键"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">客户分类id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="categoryId" maxlength="255"  value="${model.categoryId}" lay-verify="required" placeholder="请输入客户分类id"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">客户编码<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="code" maxlength="255"  value="${model.code}" lay-verify="required" placeholder="请输入客户编码"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">客户名称<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="name" maxlength="255"  value="${model.name}" lay-verify="required" placeholder="请输入客户名称"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">联系人<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="contact01" maxlength="255"  value="${model.contact01}" lay-verify="required" placeholder="请输入联系人"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">联系QQ<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="qq01" maxlength="255"  value="${model.qq01}" lay-verify="required" placeholder="请输入联系QQ"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">联系固话<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="tel01" maxlength="255"  value="${model.tel01}" lay-verify="required" placeholder="请输入联系固话"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">联系人手机<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="mobile01" maxlength="255"  value="${model.mobile01}" lay-verify="required" placeholder="请输入联系人手机"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备用联系人<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="contact02" maxlength="255"  value="${model.contact02}" lay-verify="required" placeholder="请输入备用联系人"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备用联系人QQ<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="qq02" maxlength="255"  value="${model.qq02}" lay-verify="required" placeholder="请输入备用联系人QQ"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备用联系人固话<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="tel02" maxlength="255"  value="${model.tel02}" lay-verify="required" placeholder="请输入备用联系人固话"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备用联系人手机<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="mobile02" maxlength="255"  value="${model.mobile02}" lay-verify="required" placeholder="请输入备用联系人手机"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">地址<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="address" maxlength="255"  value="${model.address}" lay-verify="required" placeholder="请输入地址"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">发货地址<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="addressShipping" maxlength="255"  value="${model.addressShipping}" lay-verify="required" placeholder="请输入发货地址"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">收货地址<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="addressReceipt" maxlength="255"  value="${model.addressReceipt}" lay-verify="required" placeholder="请输入收货地址"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">客户名称拼音<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="py" maxlength="255"  value="${model.py}" lay-verify="required" placeholder="请输入客户名称拼音"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">开户行<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="bankName" maxlength="255"  value="${model.bankName}" lay-verify="required" placeholder="请输入开户行"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">开户行账号<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="bankAccount" maxlength="255"  value="${model.bankAccount}" lay-verify="required" placeholder="请输入开户行账号"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">税号<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="taxNumber" maxlength="255"  value="${model.taxNumber}" lay-verify="required" placeholder="请输入税号"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">传真<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="fax" maxlength="255"  value="${model.fax}" lay-verify="required" placeholder="请输入传真"  class="layui-input">
            </div>
        </div>
              <div class="layui-form-item">
            <label class="layui-form-label">备注<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="note" maxlength="255"  value="${model.note}" lay-verify="required" placeholder="请输入备注"  class="layui-input">
            </div>
        </div>
      