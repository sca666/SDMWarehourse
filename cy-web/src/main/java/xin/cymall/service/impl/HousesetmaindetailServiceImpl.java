package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.HousesetmaindetailDao;
import xin.cymall.entity.Housesetmaindetail;
import xin.cymall.service.HousesetmaindetailService;




@Service("housesetmaindetailService")
@Transactional
public class HousesetmaindetailServiceImpl implements HousesetmaindetailService {
	@Autowired
	private HousesetmaindetailDao housesetmaindetailDao;
	
	@Override
	public Housesetmaindetail get(String housesetmaindetailId){
		return housesetmaindetailDao.get(housesetmaindetailId);
	}

	@Override
	public List<Housesetmaindetail> getList(Map<String, Object> map){
		return housesetmaindetailDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return housesetmaindetailDao.getCount(map);
	}

	@Override
	public void save(Housesetmaindetail housesetmaindetail){
		housesetmaindetailDao.save(housesetmaindetail);
	}

	@Override
	public void update(Housesetmaindetail housesetmaindetail){
		housesetmaindetailDao.update(housesetmaindetail);
	}

	@Override
	public void delete(String housesetmaindetailId){
		housesetmaindetailDao.delete(housesetmaindetailId);
	}

	@Override
	public void deleteBatch(String[] housesetmaindetailIds){
		housesetmaindetailDao.deleteBatch(housesetmaindetailIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Housesetmaindetail housesetmaindetail=get(id);
			housesetmaindetail.setState(stateValue);
            update(housesetmaindetail);
        }
    }
	
}
