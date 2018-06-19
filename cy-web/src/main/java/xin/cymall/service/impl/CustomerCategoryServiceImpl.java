package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.CustomerCategoryDao;
import xin.cymall.entity.CustomerCategory;
import xin.cymall.service.CustomerCategoryService;




@Service("customerCategoryService")
@Transactional
public class CustomerCategoryServiceImpl implements CustomerCategoryService {
	@Autowired
	private CustomerCategoryDao customerCategoryDao;
	
	@Override
	public CustomerCategory get(String id){
		return customerCategoryDao.get(id);
	}

	@Override
	public List<CustomerCategory> getList(Map<String, Object> map){
		return customerCategoryDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return customerCategoryDao.getCount(map);
	}

	@Override
	public void save(CustomerCategory customerCategory){
		customerCategoryDao.save(customerCategory);
	}

	@Override
	public void update(CustomerCategory customerCategory){
		customerCategoryDao.update(customerCategory);
	}

	@Override
	public void delete(String id){
		customerCategoryDao.delete(id);
	}

	@Override
	public void deleteBatch(String[] ids){
		customerCategoryDao.deleteBatch(ids);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			CustomerCategory customerCategory=get(id);
			customerCategory.setState(stateValue);
            update(customerCategory);
        }
    }

	@Override
	public List<CustomerCategory> getCustomerCategpryList() {
		return customerCategoryDao.getCustomerCategpryList();
	}

}
