package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 出库申请单与出库单对应表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public class Outputpopw implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String outputpopwId;
	/**出库申请表id**/
	private String outputapplyId;
	/**出库表id**/
	private String outputId;

	/**
	 * 设置：主键ID
	 */
	public void setOutputpopwId(String outputpopwId) {
		this.outputpopwId = outputpopwId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getOutputpopwId() {
		return outputpopwId;
	}
	/**
	 * 设置：出库申请表id
	 */
	public void setOutputapplyId(String outputapplyId) {
		this.outputapplyId = outputapplyId;
	}
	/**
	 * 获取：出库申请表id
	 */
	public String getOutputapplyId() {
		return outputapplyId;
	}
	/**
	 * 设置：出库表id
	 */
	public void setOutputId(String outputId) {
		this.outputId = outputId;
	}
	/**
	 * 获取：出库表id
	 */
	public String getOutputId() {
		return outputId;
	}

    public void setState(String stateValue) {
    }
}
