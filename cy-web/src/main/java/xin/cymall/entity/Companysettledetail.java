package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 客户结算明细表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public class Companysettledetail implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String comsetdetailId;
	/**公司id**/
	private String companyId;
	/**商品id**/
	private String commodityId;
	/**出库数量**/
	private String outputnum;
	/**未出库数量**/
	private String balancenum;
	/**入库申请单id**/
	private String inputapplyId;
	/**出库申请单id**/
	private String outputapplyId;
	/**入库时间**/
	private Date intputDate;
	/**出库时间**/
	private Date outputDate;
	/**存放天数**/
	private String depositDays;
	/**基本仓租类型**/
	private String basicrentId;
	/**加租仓租类型**/
	private String raiserentId;
	/**付款标记**/
	private String paymenttype;
	/**结算状态**/
	private String settlementStatus;
	/**单价**/
	private String price;
	/**应付金额**/
	private String totalMoney;
	/**装车费**/
	private String loadingcost;
	/**备注**/
	private String remark;

	/**
	 * 设置：主键ID
	 */
	public void setComsetdetailId(String comsetdetailId) {
		this.comsetdetailId = comsetdetailId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getComsetdetailId() {
		return comsetdetailId;
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
	 * 设置：商品id
	 */
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	/**
	 * 获取：商品id
	 */
	public String getCommodityId() {
		return commodityId;
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
	 * 设置：未出库数量
	 */
	public void setBalancenum(String balancenum) {
		this.balancenum = balancenum;
	}
	/**
	 * 获取：未出库数量
	 */
	public String getBalancenum() {
		return balancenum;
	}
	/**
	 * 设置：入库申请单id
	 */
	public void setInputapplyId(String inputapplyId) {
		this.inputapplyId = inputapplyId;
	}
	/**
	 * 获取：入库申请单id
	 */
	public String getInputapplyId() {
		return inputapplyId;
	}
	/**
	 * 设置：出库申请单id
	 */
	public void setOutputapplyId(String outputapplyId) {
		this.outputapplyId = outputapplyId;
	}
	/**
	 * 获取：出库申请单id
	 */
	public String getOutputapplyId() {
		return outputapplyId;
	}
	/**
	 * 设置：入库时间
	 */
	public void setIntputDate(Date intputDate) {
		this.intputDate = intputDate;
	}
	/**
	 * 获取：入库时间
	 */
	public Date getIntputDate() {
		return intputDate;
	}
	/**
	 * 设置：出库时间
	 */
	public void setOutputDate(Date outputDate) {
		this.outputDate = outputDate;
	}
	/**
	 * 获取：出库时间
	 */
	public Date getOutputDate() {
		return outputDate;
	}
	/**
	 * 设置：存放天数
	 */
	public void setDepositDays(String depositDays) {
		this.depositDays = depositDays;
	}
	/**
	 * 获取：存放天数
	 */
	public String getDepositDays() {
		return depositDays;
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
	 * 设置：加租仓租类型
	 */
	public void setRaiserentId(String raiserentId) {
		this.raiserentId = raiserentId;
	}
	/**
	 * 获取：加租仓租类型
	 */
	public String getRaiserentId() {
		return raiserentId;
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
	 * 设置：结算状态
	 */
	public void setSettlementStatus(String settlementStatus) {
		this.settlementStatus = settlementStatus;
	}
	/**
	 * 获取：结算状态
	 */
	public String getSettlementStatus() {
		return settlementStatus;
	}
	/**
	 * 设置：单价
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * 获取：单价
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * 设置：应付金额
	 */
	public void setTotalMoney(String totalMoney) {
		this.totalMoney = totalMoney;
	}
	/**
	 * 获取：应付金额
	 */
	public String getTotalMoney() {
		return totalMoney;
	}
	/**
	 * 设置：装车费
	 */
	public void setLoadingcost(String loadingcost) {
		this.loadingcost = loadingcost;
	}
	/**
	 * 获取：装车费
	 */
	public String getLoadingcost() {
		return loadingcost;
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
