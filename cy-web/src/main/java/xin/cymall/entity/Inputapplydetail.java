package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 入库申请明细单
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public class Inputapplydetail implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String inputapplydetailId;
	/**主表id**/
	private String intputapplymainId;
	/**商品id**/
	private String commodityId;
	/**计划入库数量**/
	private String planinputnum;
	/**实际已入库数量**/
	private String actualinputnum;
	/**调单入库数量**/
	private String allocainputnum;
	/**调单入库数量**/
	private String notinputnum;
	/**计量单位id**/
	private String unitId;
	/**录单时间**/
	private Date inputDate;
	/**备注**/
	private String remark;

	/**
	 * 设置：主键ID
	 */
	public void setInputapplydetailId(String inputapplydetailId) {
		this.inputapplydetailId = inputapplydetailId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getInputapplydetailId() {
		return inputapplydetailId;
	}
	/**
	 * 设置：主表id
	 */
	public void setIntputapplymainId(String intputapplymainId) {
		this.intputapplymainId = intputapplymainId;
	}
	/**
	 * 获取：主表id
	 */
	public String getIntputapplymainId() {
		return intputapplymainId;
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
	 * 设置：计划入库数量
	 */
	public void setPlaninputnum(String planinputnum) {
		this.planinputnum = planinputnum;
	}
	/**
	 * 获取：计划入库数量
	 */
	public String getPlaninputnum() {
		return planinputnum;
	}
	/**
	 * 设置：实际已入库数量
	 */
	public void setActualinputnum(String actualinputnum) {
		this.actualinputnum = actualinputnum;
	}
	/**
	 * 获取：实际已入库数量
	 */
	public String getActualinputnum() {
		return actualinputnum;
	}
	/**
	 * 设置：调单入库数量
	 */
	public void setAllocainputnum(String allocainputnum) {
		this.allocainputnum = allocainputnum;
	}
	/**
	 * 获取：调单入库数量
	 */
	public String getAllocainputnum() {
		return allocainputnum;
	}
	/**
	 * 设置：调单入库数量
	 */
	public void setNotinputnum(String notinputnum) {
		this.notinputnum = notinputnum;
	}
	/**
	 * 获取：调单入库数量
	 */
	public String getNotinputnum() {
		return notinputnum;
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
