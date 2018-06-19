package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 对客户的库存明细表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public class Companyinventorydetail implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String cominvendId;
	/**主表id**/
	private String cominvenmId;
	/**商品id**/
	private String commodity;
	/**公司id**/
	private String companyId;
	/**入库单id**/
	private String intputId;
	/**出库单id**/
	private String outputId;
	/**基本仓租类型**/
	private String basicrentId;
	/**付款标记**/
	private String paymenttype;
	/**入库数量**/
	private String inputnum;
	/**出库数量**/
	private String outputnum;
	/**商品结余数量**/
	private String balancenum;
	/**录入时间**/
	private Date inputDate;
	/**业务员id**/
	private String userId;
	/**备注**/
	private String remark;

	/**
	 * 设置：主键ID
	 */
	public void setCominvendId(String cominvendId) {
		this.cominvendId = cominvendId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getCominvendId() {
		return cominvendId;
	}
	/**
	 * 设置：主表id
	 */
	public void setCominvenmId(String cominvenmId) {
		this.cominvenmId = cominvenmId;
	}
	/**
	 * 获取：主表id
	 */
	public String getCominvenmId() {
		return cominvenmId;
	}
	/**
	 * 设置：商品id
	 */
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	/**
	 * 获取：商品id
	 */
	public String getCommodity() {
		return commodity;
	}
	/**
	 * 设置：公司id
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	/**
	 * 获取：公司id
	 */
	public String getCompanyId() {
		return companyId;
	}
	/**
	 * 设置：入库单id
	 */
	public void setIntputId(String intputId) {
		this.intputId = intputId;
	}
	/**
	 * 获取：入库单id
	 */
	public String getIntputId() {
		return intputId;
	}
	/**
	 * 设置：出库单id
	 */
	public void setOutputId(String outputId) {
		this.outputId = outputId;
	}
	/**
	 * 获取：出库单id
	 */
	public String getOutputId() {
		return outputId;
	}
	/**
	 * 设置：基本仓租类型
	 */
	public void setBasicrentId(String basicrentId) {
		this.basicrentId = basicrentId;
	}
	/**
	 * 获取：基本仓租类型
	 */
	public String getBasicrentId() {
		return basicrentId;
	}
	/**
	 * 设置：付款标记
	 */
	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}
	/**
	 * 获取：付款标记
	 */
	public String getPaymenttype() {
		return paymenttype;
	}
	/**
	 * 设置：入库数量
	 */
	public void setInputnum(String inputnum) {
		this.inputnum = inputnum;
	}
	/**
	 * 获取：入库数量
	 */
	public String getInputnum() {
		return inputnum;
	}
	/**
	 * 设置：出库数量
	 */
	public void setOutputnum(String outputnum) {
		this.outputnum = outputnum;
	}
	/**
	 * 获取：出库数量
	 */
	public String getOutputnum() {
		return outputnum;
	}
	/**
	 * 设置：商品结余数量
	 */
	public void setBalancenum(String balancenum) {
		this.balancenum = balancenum;
	}
	/**
	 * 获取：商品结余数量
	 */
	public String getBalancenum() {
		return balancenum;
	}
	/**
	 * 设置：录入时间
	 */
	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}
	/**
	 * 获取：录入时间
	 */
	public Date getInputDate() {
		return inputDate;
	}
	/**
	 * 设置：业务员id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：业务员id
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}

    public void setState(String stateValue) {
    }
}
