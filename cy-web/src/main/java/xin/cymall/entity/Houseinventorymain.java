package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 仓库的库存主表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public class Houseinventorymain implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String houseinvenmId;
	/**商品id**/
	private String commodity;
	/**仓库id**/
	private String warehouseId;
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
	public void setHouseinvenmId(String houseinvenmId) {
		this.houseinvenmId = houseinvenmId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getHouseinvenmId() {
		return houseinvenmId;
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
	 * 设置：仓库id
	 */
	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}
	/**
	 * 获取：仓库id
	 */
	public String getWarehouseId() {
		return warehouseId;
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
