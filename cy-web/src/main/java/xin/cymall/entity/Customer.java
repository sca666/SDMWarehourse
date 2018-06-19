package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 客户表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键**/
	private String id;
	/**客户分类id**/
	private String categoryId;
	/**客户编码**/
	private String code;
	/**客户名称**/
	private String name;
	/**联系人**/
	private String contact01;
	/**联系QQ**/
	private String qq01;
	/**联系固话**/
	private String tel01;
	/**联系人手机**/
	private String mobile01;
	/**备用联系人**/
	private String contact02;
	/**备用联系人QQ**/
	private String qq02;
	/**备用联系人固话**/
	private String tel02;
	/**备用联系人手机**/
	private String mobile02;
	/**地址**/
	private String address;
	/**发货地址**/
	private String addressShipping;
	/**收货地址**/
	private String addressReceipt;
	/**客户名称拼音**/
	private String py;
	/**开户行**/
	private String bankName;
	/**开户行账号**/
	private String bankAccount;
	/**税号**/
	private String taxNumber;
	/**传真**/
	private String fax;
	/**备注**/
	private String note;

	/**
	 * 设置：主键
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：主键
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：客户分类id
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * 获取：客户分类id
	 */
	public String getCategoryId() {
		return categoryId;
	}
	/**
	 * 设置：客户编码
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 获取：客户编码
	 */
	public String getCode() {
		return code;
	}
	/**
	 * 设置：客户名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：客户名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：联系人
	 */
	public void setContact01(String contact01) {
		this.contact01 = contact01;
	}
	/**
	 * 获取：联系人
	 */
	public String getContact01() {
		return contact01;
	}
	/**
	 * 设置：联系QQ
	 */
	public void setQq01(String qq01) {
		this.qq01 = qq01;
	}
	/**
	 * 获取：联系QQ
	 */
	public String getQq01() {
		return qq01;
	}
	/**
	 * 设置：联系固话
	 */
	public void setTel01(String tel01) {
		this.tel01 = tel01;
	}
	/**
	 * 获取：联系固话
	 */
	public String getTel01() {
		return tel01;
	}
	/**
	 * 设置：联系人手机
	 */
	public void setMobile01(String mobile01) {
		this.mobile01 = mobile01;
	}
	/**
	 * 获取：联系人手机
	 */
	public String getMobile01() {
		return mobile01;
	}
	/**
	 * 设置：备用联系人
	 */
	public void setContact02(String contact02) {
		this.contact02 = contact02;
	}
	/**
	 * 获取：备用联系人
	 */
	public String getContact02() {
		return contact02;
	}
	/**
	 * 设置：备用联系人QQ
	 */
	public void setQq02(String qq02) {
		this.qq02 = qq02;
	}
	/**
	 * 获取：备用联系人QQ
	 */
	public String getQq02() {
		return qq02;
	}
	/**
	 * 设置：备用联系人固话
	 */
	public void setTel02(String tel02) {
		this.tel02 = tel02;
	}
	/**
	 * 获取：备用联系人固话
	 */
	public String getTel02() {
		return tel02;
	}
	/**
	 * 设置：备用联系人手机
	 */
	public void setMobile02(String mobile02) {
		this.mobile02 = mobile02;
	}
	/**
	 * 获取：备用联系人手机
	 */
	public String getMobile02() {
		return mobile02;
	}
	/**
	 * 设置：地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：地址
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：发货地址
	 */
	public void setAddressShipping(String addressShipping) {
		this.addressShipping = addressShipping;
	}
	/**
	 * 获取：发货地址
	 */
	public String getAddressShipping() {
		return addressShipping;
	}
	/**
	 * 设置：收货地址
	 */
	public void setAddressReceipt(String addressReceipt) {
		this.addressReceipt = addressReceipt;
	}
	/**
	 * 获取：收货地址
	 */
	public String getAddressReceipt() {
		return addressReceipt;
	}
	/**
	 * 设置：客户名称拼音
	 */
	public void setPy(String py) {
		this.py = py;
	}
	/**
	 * 获取：客户名称拼音
	 */
	public String getPy() {
		return py;
	}
	/**
	 * 设置：开户行
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	/**
	 * 获取：开户行
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * 设置：开户行账号
	 */
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	/**
	 * 获取：开户行账号
	 */
	public String getBankAccount() {
		return bankAccount;
	}
	/**
	 * 设置：税号
	 */
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	/**
	 * 获取：税号
	 */
	public String getTaxNumber() {
		return taxNumber;
	}
	/**
	 * 设置：传真
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}
	/**
	 * 获取：传真
	 */
	public String getFax() {
		return fax;
	}
	/**
	 * 设置：备注
	 */
	public void setNote(String note) {
		this.note = note;
	}
	/**
	 * 获取：备注
	 */
	public String getNote() {
		return note;
	}

    public void setState(String stateValue) {
    }
}
