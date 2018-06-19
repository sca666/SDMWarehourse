package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 基本仓租类型
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public class Basicrenttype implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String basicrentId;
	/**基本仓租类型**/
	private String basicrentname;
	/**仓租单价**/
	private String basicrentprice;
	/**备注**/
	private String remark;

	/**
	 * 设置：主键ID
	 */
	public void setBasicrentId(String basicrentId) {
		this.basicrentId = basicrentId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getBasicrentId() {
		return basicrentId;
	}
	/**
	 * 设置：基本仓租类型
	 */
	public void setBasicrentname(String basicrentname) {
		this.basicrentname = basicrentname;
	}
	/**
	 * 获取：基本仓租类型
	 */
	public String getBasicrentname() {
		return basicrentname;
	}
	/**
	 * 设置：仓租单价
	 */
	public void setBasicrentprice(String basicrentprice) {
		this.basicrentprice = basicrentprice;
	}
	/**
	 * 获取：仓租单价
	 */
	public String getBasicrentprice() {
		return basicrentprice;
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
