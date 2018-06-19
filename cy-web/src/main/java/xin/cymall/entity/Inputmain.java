package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 入库单主表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public class Inputmain implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String inputmainId;
	/**公司id**/
	private String companyId;
	/**入库单号**/
	private String inputmainRef;
	/**入库仓库id**/
	private String warehouseId;
	/**录单时间**/
	private Date inputDate;
	/**单据状态**/
	private String bill_status;
	/**业务员id**/
	private String userId;
	/**备注**/
	private String remark;

	/**
	 * 设置：主键ID
	 */
	public void setInputmainId(String inputmainId) {
		this.inputmainId = inputmainId;
	}
	/**
	 * 获取：主键ID
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
	 * 设置：入库单号
	 */
	public void setInputmainRef(String inputmainRef) {
		this.inputmainRef = inputmainRef;
	}
	/**
	 * 获取：入库单号
	 */
	public String getInputmainRef() {
		return inputmainRef;
	}
	/**
	 * 设置：入库仓库id
	 */
	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}
	/**
	 * 获取：入库仓库id
	 */
	public String getWarehouseId() {
		return warehouseId;
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
	 * 设置：单据状态
	 */
	public void setBill_status(String bill_status) {
		this.bill_status = bill_status;
	}
	/**
	 * 获取：单据状态
	 */
	public String getBill_status() {
		return bill_status;
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
