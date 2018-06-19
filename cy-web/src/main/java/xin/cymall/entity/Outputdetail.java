package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 出库单明细表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public class Outputdetail implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String outputdetailId;
	/**主表id**/
	private String outputmainId;
	/**公司id**/
	private String companyId;
	/**商品id**/
	private String commodityId;
	/**出库数量**/
	private String outputnum;
	/**录单时间**/
	private Date outputDate;
	/**司机id**/
	private String driverId;
	/**车辆id**/
	private String carId;
	/**付款标记**/
	private String paymenttype;
	/**基本仓租类型**/
	private String basicrentId;
	/**装车费**/
	private String loadingcost;
	/**备注**/
	private String remark;

	/**
	 * 设置：主键ID
	 */
	public void setOutputdetailId(String outputdetailId) {
		this.outputdetailId = outputdetailId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getOutputdetailId() {
		return outputdetailId;
	}
	/**
	 * 设置：主表id
	 */
	public void setOutputmainId(String outputmainId) {
		this.outputmainId = outputmainId;
	}
	/**
	 * 获取：主表id
	 */
	public String getOutputmainId() {
		return outputmainId;
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
	 * 设置：录单时间
	 */
	public void setOutputDate(Date outputDate) {
		this.outputDate = outputDate;
	}
	/**
	 * 获取：录单时间
	 */
	public Date getOutputDate() {
		return outputDate;
	}
	/**
	 * 设置：司机id
	 */
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}
	/**
	 * 获取：司机id
	 */
	public String getDriverId() {
		return driverId;
	}
	/**
	 * 设置：车辆id
	 */
	public void setCarId(String carId) {
		this.carId = carId;
	}
	/**
	 * 获取：车辆id
	 */
	public String getCarId() {
		return carId;
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
