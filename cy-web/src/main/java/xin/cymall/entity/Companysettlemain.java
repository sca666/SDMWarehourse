package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 客户结算主表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public class Companysettlemain implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String comsetmainId;
	/**公司id**/
	private String companyId;
	/**应付金额**/
	private String totalMoney;
	/**已付金额**/
	private String paidMoney;
	/**未付金额**/
	private String unpidMoney;
	/**制表日期**/
	private Date settleDate;
	/**备注**/
	private String remark;

	/**
	 * 设置：主键ID
	 */
	public void setComsetmainId(String comsetmainId) {
		this.comsetmainId = comsetmainId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getComsetmainId() {
		return comsetmainId;
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
	 * 设置：已付金额
	 */
	public void setPaidMoney(String paidMoney) {
		this.paidMoney = paidMoney;
	}
	/**
	 * 获取：已付金额
	 */
	public String getPaidMoney() {
		return paidMoney;
	}
	/**
	 * 设置：未付金额
	 */
	public void setUnpidMoney(String unpidMoney) {
		this.unpidMoney = unpidMoney;
	}
	/**
	 * 获取：未付金额
	 */
	public String getUnpidMoney() {
		return unpidMoney;
	}
	/**
	 * 设置：制表日期
	 */
	public void setSettleDate(Date settleDate) {
		this.settleDate = settleDate;
	}
	/**
	 * 获取：制表日期
	 */
	public Date getSettleDate() {
		return settleDate;
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
