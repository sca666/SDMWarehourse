package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 仓库表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:02
 */
public class Warehouse implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String warehouseId;
	/**仓库名称**/
	private String warehousrname;
	/**仓库地址**/
	private String address;
	/**联系电话**/
	private String telephone;
	/**备注**/
	private String remark;

	/**
	 * 设置：主键ID
	 */
	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getWarehouseId() {
		return warehouseId;
	}
	/**
	 * 设置：仓库名称
	 */
	public void setWarehousrname(String warehousrname) {
		this.warehousrname = warehousrname;
	}
	/**
	 * 获取：仓库名称
	 */
	public String getWarehousrname() {
		return warehousrname;
	}
	/**
	 * 设置：仓库地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：仓库地址
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：联系电话
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * 获取：联系电话
	 */
	public String getTelephone() {
		return telephone;
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
