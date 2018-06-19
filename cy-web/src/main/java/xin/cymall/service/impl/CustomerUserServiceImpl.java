package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.CustomerUserDao;
import xin.cymall.entity.CustomerUser;
import xin.cymall.service.CustomerUserService;




@Service("customerUserService")
@Transactional
public class CustomerUserServiceImpl implements CustomerUserService {
	@Autowired
	private CustomerUserDao customerUserDao;
	
	@Override
	public CustomerUser get(String id){
		return customerUserDao.get(id);
	}

	@Override
	public List<CustomerUser> getList(Map<String, Object> map){
		return customerUserDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return customerUserDao.getCount(map);
	}

	@Override
	public void save(CustomerUser customerUser){
		customerUserDao.save(customerUser);
	}

	@Override
	public void update(CustomerUser customerUser){
		customerUserDao.update(customerUser);
	}

	@Override
	public void delete(String id){
		customerUserDao.delete(id);
	}

	@Override
	public void deleteBatch(String[] ids){
		customerUserDao.deleteBatch(ids);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			CustomerUser customerUser=get(id);
			customerUser.setState(stateValue);
            update(customerUser);
        }
    }
	
}
