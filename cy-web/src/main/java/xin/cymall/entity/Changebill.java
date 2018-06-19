package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 调单表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:02
 */
public class Changebill implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String changebillId;
	/**调入公司id**/
	private String inputcompanyId;
	/**调出公司id**/
	private String outputcompanyId;
	/**商品id**/
	private String commodityId;
	/**调单的入库单id**/
	private String intputId;
	/**调单的出库单id**/
	private String outputId;
	/**调单数量**/
	private String changenum;

	/**
	 * 设置：主键ID
	 */
	public void setChangebillId(String changebillId) {
		this.changebillId = changebillId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getChangebillId() {
		return changebillId;
	}
	/**
	 * 设置：调入公司id
	 */
	public void setInputcompanyId(String inputcompanyId) {
		this.inputcompanyId = inputcompanyId;
	}
	/**
	 * 获取：调入公司id
	 */
	public String getInputcompanyId() {
		return inputcompanyId;
	}
	/**
	 * 设置：调出公司id
	 */
	public void setOutputcompanyId(String outputcompanyId) {
		this.outputcompanyId = outputcompanyId;
	}
	/**
	 * 获取：调出公司id
	 */
	public String getOutputcompanyId() {
		return outputcompanyId;
	}
	/**
	 * 设置：商品id
	 */
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	/**
	 * 获取：商品id
	 */
	public String getCommodityId() {
		return commodityId;
	}
	/**
	 * 设置：调单的入库单id
	 */
	public void setIntputId(String intputId) {
		this.intputId = intputId;
	}
	/**
	 * 获取：调单的入库单id
	 */
	public String getIntputId() {
		return intputId;
	}
	/**
	 * 设置：调单的出库单id
	 */
	public void setOutputId(String outputId) {
		this.outputId = outputId;
	}
	/**
	 * 获取：调单的出库单id
	 */
	public String getOutputId() {
		return outputId;
	}
	/**
	 * 设置：调单数量
	 */
	public void setChangenum(String changenum) {
		this.changenum = changenum;
	}
	/**
	 * 获取：调单数量
	 */
	public String getChangenum() {
		return changenum;
	}

    public void setState(String stateValue) {
    }
}
