package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 入库单明细表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public class Inputdetail implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String inputdetailId;
	/**主表id**/
	private String inputmainId;
	/**公司id**/
	private String companyId;
	/**商品id**/
	private String commodityId;
	/**入库数量**/
	private String inputnum;
	/**录单时间**/
	private Date inputDate;
	/**基本仓租类型**/
	private String basicrentId;
	/**加租仓租类型**/
	private String raiserentId;
	/**司机id**/
	private String driverId;
	/**车辆id**/
	private String carId;
	/**备注**/
	private String remark;

	/**
	 * 设置：主键ID
	 */
	public void setInputdetailId(String inputdetailId) {
		this.inputdetailId = inputdetailId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getInputdetailId() {
		return inputdetailId;
	}
	/**
	 * 设置：主表id
	 */
	public void setInputmainId(String inputmainId) {
		this.inputmainId = inputmainId;
	}
	/**
	 * 获取：主表id
	 */
	public String getInputmainId() {
		return inputmainId;
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
	 * 设置：录单时间
	 */
	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}
	/**
	 * 获取：录单时间
	 */
	public Date getInputDate() {
		return inputDate;
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
