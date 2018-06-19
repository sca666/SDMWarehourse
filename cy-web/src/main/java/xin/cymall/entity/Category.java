package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 商品分类
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private Long categoryId;
	/**商品分类编码**/
	private String code;
	/**商品分类名称**/
	private String name;
	/**商品分类父类id**/
	private Long parentId;
	/**商品分类全名**/
	private String fullName;
	/**备注**/
	private String remark;

	/**
	 * ztree属性
	 */
	private Boolean open;

	public void  setOpen(Boolean open){
		this.open = open;
	}
	public  Boolean getOpen() {
		return this.open;
	}


	/**
	 *新增 父类名称
	 */
	private String parentName;
	public  String getParentName(){
		return this.parentName;
	}
	public  void  setParentName(String parentName) {
		this.parentName = parentName;
	}


	/**
	 * 设置：主键ID
	 */
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * 获取：主键ID
	 */
	public Long getCategoryId() {
		return categoryId;
	}
	/**
	 * 设置：商品分类编码
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 获取：商品分类编码
	 */
	public String getCode() {
		return code;
	}
	/**
	 * 设置：商品分类名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：商品分类名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：商品分类父类id
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：商品分类父类id
	 */
	public Long getParentId() {
		return parentId;
	}
	/**
	 * 设置：商品分类全名
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * 获取：商品分类全名
	 */
	public String getFullName() {
		return fullName;
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
