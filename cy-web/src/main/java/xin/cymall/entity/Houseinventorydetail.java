package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 仓库的库存明细表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public class Houseinventorydetail implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String houseinvendId;
	/**主表id**/
	private String houseinvenmId;
	/**商品id**/
	private String commodity;
	/**基本仓租类型**/
	private String basicrentId;
	/**付款标记**/
	private String paymenttype;
	/**仓库id**/
	private String warehouseId;
	/**入库单id**/
	private String intputId;
	/**出库单id**/
	private String outtputId;
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
	public void setHouseinvendId(String houseinvendId) {
		this.houseinvendId = houseinvendId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getHouseinvendId() {
		return houseinvendId;
	}
	/**
	 * 设置：主表id
	 */
	public void setHouseinvenmId(String houseinvenmId) {
		this.houseinvenmId = houseinvenmId;
	}
	/**
	 * 获取：主表id
	 */
	public String getHouseinvenmId() {
		return houseinvenmId;
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
	 * 设置：仓库id
	 */
	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}
	/**
	 * 获取：仓库id
	 */
	public String getWarehouseId() {
		return warehouseId;
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
	public void setOuttputId(String outtputId) {
		this.outtputId = outtputId;
	}
	/**
	 * 获取：出库单id
	 */
	public String getOuttputId() {
		return outtputId;
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
