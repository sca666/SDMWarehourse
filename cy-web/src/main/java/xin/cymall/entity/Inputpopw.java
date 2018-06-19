package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 入库申请单与入库单对应表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public class Inputpopw implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String inputpopwId;
	/**入库申请表id**/
	private String inputapplyId;
	/**入库表id**/
	private String inputId;

	/**
	 * 设置：主键ID
	 */
	public void setInputpopwId(String inputpopwId) {
		this.inputpopwId = inputpopwId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getInputpopwId() {
		return inputpopwId;
	}
	/**
	 * 设置：入库申请表id
	 */
	public void setInputapplyId(String inputapplyId) {
		this.inputapplyId = inputapplyId;
	}
	/**
	 * 获取：入库申请表id
	 */
	public String getInputapplyId() {
		return inputapplyId;
	}
	/**
	 * 设置：入库表id
	 */
	public void setInputId(String inputId) {
		this.inputId = inputId;
	}
	/**
	 * 获取：入库表id
	 */
	public String getInputId() {
		return inputId;
	}

    public void setState(String stateValue) {
    }
}
