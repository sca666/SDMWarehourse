package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 客户主表与明细表对应表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public class Comsetmaindetail implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String comsetmaindetailId;
	/**主表id**/
	private String comsetmainId;
	/**明细表id**/
	private String comsetdetailId;

	/**
	 * 设置：主键ID
	 */
	public void setComsetmaindetailId(String comsetmaindetailId) {
		this.comsetmaindetailId = comsetmaindetailId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getComsetmaindetailId() {
		return comsetmaindetailId;
	}
	/**
	 * 设置：主表id
	 */
	public void setComsetmainId(String comsetmainId) {
		this.comsetmainId = comsetmainId;
	}
	/**
	 * 获取：主表id
	 */
	public String getComsetmainId() {
		return comsetmainId;
	}
	/**
	 * 设置：明细表id
	 */
	public void setComsetdetailId(String comsetdetailId) {
		this.comsetdetailId = comsetdetailId;
	}
	/**
	 * 获取：明细表id
	 */
	public String getComsetdetailId() {
		return comsetdetailId;
	}

    public void setState(String stateValue) {
    }
}
