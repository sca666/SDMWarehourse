package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 客户分类表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-13 10:48:13
 */
public class CustomerCategory implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private Long id;
	/**分类编码**/
	private String code;
	/**分类名称**/
	private String name;
	/**上级ID**/
	private Long parentId;
	/**公司Id**/
	private String companyId;
	/**价格体系**/
	private String psId;


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
	 * 设置：主键ID
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：主键ID
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：分类编码
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 获取：分类编码
	 */
	public String getCode() {
		return code;
	}
	/**
	 * 设置：分类名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：分类名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：上级ID
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：上级ID
	 */
	public Long getParentId() {
		return parentId;
	}
	/**
	 * 设置：公司Id
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	/**
	 * 获取：公司Id
	 */
	public String getCompanyId() {
		return companyId;
	}
	/**
	 * 设置：价格体系
	 */
	public void setPsId(String psId) {
		this.psId = psId;
	}
	/**
	 * 获取：价格体系
	 */
	public String getPsId() {
		return psId;
	}

    public void setState(String stateValue) {
    }
}
