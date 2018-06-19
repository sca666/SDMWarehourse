package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 客户与登录用户对应表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-13 10:48:13
 */
public class CustomerUser implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String id;
	/**用户Id**/
	private String userId;
	/**客户id**/
	private String customerId;

	/**
	 * 设置：主键ID
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：主键ID
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：用户Id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户Id
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置：客户id
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	/**
	 * 获取：客户id
	 */
	public String getCustomerId() {
		return customerId;
	}

    public void setState(String stateValue) {
    }
}
