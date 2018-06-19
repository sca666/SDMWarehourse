package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 出库申请单明细表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public class Outputapplydetail implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String outputapplydetailId;
	/**主表id**/
	private String outputapplymainId;
	/**商品id**/
	private String commodityId;
	/**计划出库数量**/
	private String planoutputnum;
	/**实际已出库数量**/
	private String actualoutputnum;
	/**调单出库数量**/
	private String allocaoutputnum;
	/**调单出库数量**/
	private String notoutputnum;
	/**计量单位id**/
	private String unitId;
	/**录单时间**/
	private Date outputDate;
	/**备注**/
	private String remark;

	/**
	 * 设置：主键ID
	 */
	public void setOutputapplydetailId(String outputapplydetailId) {
		this.outputapplydetailId = outputapplydetailId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getOutputapplydetailId() {
		return outputapplydetailId;
	}
	/**
	 * 设置：主表id
	 */
	public void setOutputapplymainId(String outputapplymainId) {
		this.outputapplymainId = outputapplymainId;
	}
	/**
	 * 获取：主表id
	 */
	public String getOutputapplymainId() {
		return outputapplymainId;
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
	 * 设置：计划出库数量
	 */
	public void setPlanoutputnum(String planoutputnum) {
		this.planoutputnum = planoutputnum;
	}
	/**
	 * 获取：计划出库数量
	 */
	public String getPlanoutputnum() {
		return planoutputnum;
	}
	/**
	 * 设置：实际已出库数量
	 */
	public void setActualoutputnum(String actualoutputnum) {
		this.actualoutputnum = actualoutputnum;
	}
	/**
	 * 获取：实际已出库数量
	 */
	public String getActualoutputnum() {
		return actualoutputnum;
	}
	/**
	 * 设置：调单出库数量
	 */
	public void setAllocaoutputnum(String allocaoutputnum) {
		this.allocaoutputnum = allocaoutputnum;
	}
	/**
	 * 获取：调单出库数量
	 */
	public String getAllocaoutputnum() {
		return allocaoutputnum;
	}
	/**
	 * 设置：调单出库数量
	 */
	public void setNotoutputnum(String notoutputnum) {
		this.notoutputnum = notoutputnum;
	}
	/**
	 * 获取：调单出库数量
	 */
	public String getNotoutputnum() {
		return notoutputnum;
	}
	/**
	 * 设置：计量单位id
	 */
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}
	/**
	 * 获取：计量单位id
	 */
	public String getUnitId() {
		return unitId;
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
