package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.CompanysettledetailDao;
import xin.cymall.entity.Companysettledetail;
import xin.cymall.service.CompanysettledetailService;




@Service("companysettledetailService")
@Transactional
public class CompanysettledetailServiceImpl implements CompanysettledetailService {
	@Autowired
	private CompanysettledetailDao companysettledetailDao;
	
	@Override
	public Companysettledetail get(String comsetdetailId){
		return companysettledetailDao.get(comsetdetailId);
	}

	@Override
	public List<Companysettledetail> getList(Map<String, Object> map){
		return companysettledetailDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return companysettledetailDao.getCount(map);
	}

	@Override
	public void save(Companysettledetail companysettledetail){
		companysettledetailDao.save(companysettledetail);
	}

	@Override
	public void update(Companysettledetail companysettledetail){
		companysettledetailDao.update(companysettledetail);
	}

	@Override
	public void delete(String comsetdetailId){
		companysettledetailDao.delete(comsetdetailId);
	}

	@Override
	public void deleteBatch(String[] comsetdetailIds){
		companysettledetailDao.deleteBatch(comsetdetailIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Companysettledetail companysettledetail=get(id);
			companysettledetail.setState(stateValue);
            update(companysettledetail);
        }
    }
	
}
