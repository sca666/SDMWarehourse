package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.HouseinventorydetailDao;
import xin.cymall.entity.Houseinventorydetail;
import xin.cymall.service.HouseinventorydetailService;




@Service("houseinventorydetailService")
@Transactional
public class HouseinventorydetailServiceImpl implements HouseinventorydetailService {
	@Autowired
	private HouseinventorydetailDao houseinventorydetailDao;
	
	@Override
	public Houseinventorydetail get(String houseinvendId){
		return houseinventorydetailDao.get(houseinvendId);
	}

	@Override
	public List<Houseinventorydetail> getList(Map<String, Object> map){
		return houseinventorydetailDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return houseinventorydetailDao.getCount(map);
	}

	@Override
	public void save(Houseinventorydetail houseinventorydetail){
		houseinventorydetailDao.save(houseinventorydetail);
	}

	@Override
	public void update(Houseinventorydetail houseinventorydetail){
		houseinventorydetailDao.update(houseinventorydetail);
	}

	@Override
	public void delete(String houseinvendId){
		houseinventorydetailDao.delete(houseinvendId);
	}

	@Override
	public void deleteBatch(String[] houseinvendIds){
		houseinventorydetailDao.deleteBatch(houseinvendIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Houseinventorydetail houseinventorydetail=get(id);
			houseinventorydetail.setState(stateValue);
            update(houseinventorydetail);
        }
    }
	
}
