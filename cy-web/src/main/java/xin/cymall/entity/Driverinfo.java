package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 司机信息
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public class Driverinfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String dirverinfoId;
	/**司机名字**/
	private String drivername;
	/**司机联系电话**/
	private String driverphone;
	/**车牌号**/
	private String carnum;
	/**备注**/
	private String remark;

	/**
	 * 设置：主键ID
	 */
	public void setDirverinfoId(String dirverinfoId) {
		this.dirverinfoId = dirverinfoId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getDirverinfoId() {
		return dirverinfoId;
	}
	/**
	 * 设置：司机名字
	 */
	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}
	/**
	 * 获取：司机名字
	 */
	public String getDrivername() {
		return drivername;
	}
	/**
	 * 设置：司机联系电话
	 */
	public void setDriverphone(String driverphone) {
		this.driverphone = driverphone;
	}
	/**
	 * 获取：司机联系电话
	 */
	public String getDriverphone() {
		return driverphone;
	}
	/**
	 * 设置：车牌号
	 */
	public void setCarnum(String carnum) {
		this.carnum = carnum;
	}
	/**
	 * 获取：车牌号
	 */
	public String getCarnum() {
		return carnum;
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
