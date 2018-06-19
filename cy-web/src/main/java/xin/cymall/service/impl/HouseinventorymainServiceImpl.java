package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.HouseinventorymainDao;
import xin.cymall.entity.Houseinventorymain;
import xin.cymall.service.HouseinventorymainService;




@Service("houseinventorymainService")
@Transactional
public class HouseinventorymainServiceImpl implements HouseinventorymainService {
	@Autowired
	private HouseinventorymainDao houseinventorymainDao;
	
	@Override
	public Houseinventorymain get(String houseinvenmId){
		return houseinventorymainDao.get(houseinvenmId);
	}

	@Override
	public List<Houseinventorymain> getList(Map<String, Object> map){
		return houseinventorymainDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return houseinventorymainDao.getCount(map);
	}

	@Override
	public void save(Houseinventorymain houseinventorymain){
		houseinventorymainDao.save(houseinventorymain);
	}

	@Override
	public void update(Houseinventorymain houseinventorymain){
		houseinventorymainDao.update(houseinventorymain);
	}

	@Override
	public void delete(String houseinvenmId){
		houseinventorymainDao.delete(houseinvenmId);
	}

	@Override
	public void deleteBatch(String[] houseinvenmIds){
		houseinventorymainDao.deleteBatch(houseinvenmIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Houseinventorymain houseinventorymain=get(id);
			houseinventorymain.setState(stateValue);
            update(houseinventorymain);
        }
    }
	
}
