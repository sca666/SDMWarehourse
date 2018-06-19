package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 计量单位
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public class Meteringunit implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String unitId;
	/**单位编码**/
	private String unitcode;
	/**单位名称**/
	private String unitname;
	/**备注**/
	private String remark;

	/**
	 * 设置：主键ID
	 */
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getUnitId() {
		return unitId;
	}
	/**
	 * 设置：单位编码
	 */
	public void setUnitcode(String unitcode) {
		this.unitcode = unitcode;
	}
	/**
	 * 获取：单位编码
	 */
	public String getUnitcode() {
		return unitcode;
	}
	/**
	 * 设置：单位名称
	 */
	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}
	/**
	 * 获取：单位名称
	 */
	public String getUnitname() {
		return unitname;
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
