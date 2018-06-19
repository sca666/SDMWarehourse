package xin.cymall.dao;

import xin.cymall.entity.CustomerCategory;

import java.util.List;

/**
 * 客户分类表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-13 10:48:13
 */
public interface CustomerCategoryDao extends BaseDao<CustomerCategory> {

    List<CustomerCategory> getCustomerCategpryList();
}
