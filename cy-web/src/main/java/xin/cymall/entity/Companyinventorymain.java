package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 客户的库存主表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public class Companyinventorymain implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String cominvenmId;
	/**商品id**/
	private String commodity;
	/**公司id**/
	private String companyId;
	/**入库数量**/
	private String inputnum;
	/**出库数量**/
	private String outputnum;
	/**商品结余数量**/
	private String balancenum;
	/**备注**/
	private String remark;

	/**
	 * 设置：主键ID
	 */
	public void setCominvenmId(String cominvenmId) {
		this.cominvenmId = cominvenmId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getCominvenmId() {
		return cominvenmId;
	}
	/**
	 * 设置：商品id
	 */
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	/**
	 * 获取：商品id
	 */
	public String getCommodity() {
		return commodity;
	}
	/**
	 * 设置：公司id
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	/**
	 * 获取：公司id
	 */
	public String getCompanyId() {
		return companyId;
	}
	/**
	 * 设置：入库数量
	 */
	public void setInputnum(String inputnum) {
		this.inputnum = inputnum;
	}
	/**
	 * 获取：入库数量
	 */
	public String getInputnum() {
		return inputnum;
	}
	/**
	 * 设置：出库数量
	 */
	public void setOutputnum(String outputnum) {
		this.outputnum = outputnum;
	}
	/**
	 * 获取：出库数量
	 */
	public String getOutputnum() {
		return outputnum;
	}
	/**
	 * 设置：商品结余数量
	 */
	public void setBalancenum(String balancenum) {
		this.balancenum = balancenum;
	}
	/**
	 * 获取：商品结余数量
	 */
	public String getBalancenum() {
		return balancenum;
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
