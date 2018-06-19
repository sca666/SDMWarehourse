package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 车辆与司机关联表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public class Drivercarrelation implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String id;
	/**司机信息表ID**/
	private String dirverinfoId;
	/**车辆信息表ID**/
	private String carinfoId;

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
	 * 设置：司机信息表ID
	 */
	public void setDirverinfoId(String dirverinfoId) {
		this.dirverinfoId = dirverinfoId;
	}
	/**
	 * 获取：司机信息表ID
	 */
	public String getDirverinfoId() {
		return dirverinfoId;
	}
	/**
	 * 设置：车辆信息表ID
	 */
	public void setCarinfoId(String carinfoId) {
		this.carinfoId = carinfoId;
	}
	/**
	 * 获取：车辆信息表ID
	 */
	public String getCarinfoId() {
		return carinfoId;
	}

    public void setState(String stateValue) {
    }
}
