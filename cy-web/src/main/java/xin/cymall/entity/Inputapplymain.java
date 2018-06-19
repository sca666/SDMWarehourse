package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 入库申请主单
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public class Inputapplymain implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String inputapplymainId;
	/**入库申请表单号**/
	private String inputapplymainRef;
	/**公司id**/
	private String companyId;
	/**录单人id**/
	private String inputUserId;
	/**录单时间**/
	private Date inputDate;
	/**单据状态**/
	private String billStatus;
	/**审核人id**/
	private String confirmUserId;
	/**审核时间**/
	private Date confirmDate;
	/**备注**/
	private String remark;

	/**
	 * 设置：主键ID
	 */
	public void setInputapplymainId(String inputapplymainId) {
		this.inputapplymainId = inputapplymainId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getInputapplymainId() {
		return inputapplymainId;
	}
	/**
	 * 设置：入库申请表单号
	 */
	public void setInputapplymainRef(String inputapplymainRef) {
		this.inputapplymainRef = inputapplymainRef;
	}
	/**
	 * 获取：入库申请表单号
	 */
	public String getInputapplymainRef() {
		return inputapplymainRef;
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
	 * 设置：录单人id
	 */
	public void setInputUserId(String inputUserId) {
		this.inputUserId = inputUserId;
	}
	/**
	 * 获取：录单人id
	 */
	public String getInputUserId() {
		return inputUserId;
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
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}
	/**
	 * 获取：单据状态
	 */
	public String getBillStatus() {
		return billStatus;
	}
	/**
	 * 设置：审核人id
	 */
	public void setConfirmUserId(String confirmUserId) {
		this.confirmUserId = confirmUserId;
	}
	/**
	 * 获取：审核人id
	 */
	public String getConfirmUserId() {
		return confirmUserId;
	}
	/**
	 * 设置：审核时间
	 */
	public void setConfirmDate(Date confirmDate) {
		this.confirmDate = confirmDate;
	}
	/**
	 * 获取：审核时间
	 */
	public Date getConfirmDate() {
		return confirmDate;
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
