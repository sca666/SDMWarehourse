package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 加租类型
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public class Raiserenttype implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String raiserentId;
	/**加租类型名称**/
	private String raiserentname;
	/**单价**/
	private String rasierentprice;
	/**备注**/
	private String remark;

	/**
	 * 设置：主键ID
	 */
	public void setRaiserentId(String raiserentId) {
		this.raiserentId = raiserentId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getRaiserentId() {
		return raiserentId;
	}
	/**
	 * 设置：加租类型名称
	 */
	public void setRaiserentname(String raiserentname) {
		this.raiserentname = raiserentname;
	}
	/**
	 * 获取：加租类型名称
	 */
	public String getRaiserentname() {
		return raiserentname;
	}
	/**
	 * 设置：单价
	 */
	public void setRasierentprice(String rasierentprice) {
		this.rasierentprice = rasierentprice;
	}
	/**
	 * 获取：单价
	 */
	public String getRasierentprice() {
		return rasierentprice;
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
