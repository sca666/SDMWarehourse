package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 车辆信息
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public class Carinfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String carId;
	/**车牌号**/
	private String carnum;
	/**所属单位**/
	private String unit;
	/**备注**/
	private String remark;

	/**
	 * 设置：主键ID
	 */
	public void setCarId(String carId) {
		this.carId = carId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getCarId() {
		return carId;
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
	 * 设置：所属单位
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * 获取：所属单位
	 */
	public String getUnit() {
		return unit;
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
