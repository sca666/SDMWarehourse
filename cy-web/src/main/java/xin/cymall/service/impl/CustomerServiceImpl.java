package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.CustomerDao;
import xin.cymall.entity.Customer;
import xin.cymall.service.CustomerService;




@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public Customer get(String id){
		return customerDao.get(id);
	}

	@Override
	public List<Customer> getList(Map<String, Object> map){
		return customerDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return customerDao.getCount(map);
	}

	@Override
	public void save(Customer customer){
		customerDao.save(customer);
	}

	@Override
	public void update(Customer customer){
		customerDao.update(customer);
	}

	@Override
	public void delete(String id){
		customerDao.delete(id);
	}

	@Override
	public void deleteBatch(String[] ids){
		customerDao.deleteBatch(ids);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Customer customer=get(id);
			customer.setState(stateValue);
            update(customer);
        }
    }
	
}
