package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 仓库主表与明细表对应表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:02
 */
public class Housesetmaindetail implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String housesetmaindetailId;
	/**主表id**/
	private String housesetmainId;
	/**明细表id**/
	private String housesetdetailId;

	/**
	 * 设置：主键ID
	 */
	public void setHousesetmaindetailId(String housesetmaindetailId) {
		this.housesetmaindetailId = housesetmaindetailId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getHousesetmaindetailId() {
		return housesetmaindetailId;
	}
	/**
	 * 设置：主表id
	 */
	public void setHousesetmainId(String housesetmainId) {
		this.housesetmainId = housesetmainId;
	}
	/**
	 * 获取：主表id
	 */
	public String getHousesetmainId() {
		return housesetmainId;
	}
	/**
	 * 设置：明细表id
	 */
	public void setHousesetdetailId(String housesetdetailId) {
		this.housesetdetailId = housesetdetailId;
	}
	/**
	 * 获取：明细表id
	 */
	public String getHousesetdetailId() {
		return housesetdetailId;
	}

    public void setState(String stateValue) {
    }
}
