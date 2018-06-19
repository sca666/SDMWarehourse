package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.CompanyinventorydetailDao;
import xin.cymall.entity.Companyinventorydetail;
import xin.cymall.service.CompanyinventorydetailService;




@Service("companyinventorydetailService")
@Transactional
public class CompanyinventorydetailServiceImpl implements CompanyinventorydetailService {
	@Autowired
	private CompanyinventorydetailDao companyinventorydetailDao;
	
	@Override
	public Companyinventorydetail get(String cominvendId){
		return companyinventorydetailDao.get(cominvendId);
	}

	@Override
	public List<Companyinventorydetail> getList(Map<String, Object> map){
		return companyinventorydetailDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return companyinventorydetailDao.getCount(map);
	}

	@Override
	public void save(Companyinventorydetail companyinventorydetail){
		companyinventorydetailDao.save(companyinventorydetail);
	}

	@Override
	public void update(Companyinventorydetail companyinventorydetail){
		companyinventorydetailDao.update(companyinventorydetail);
	}

	@Override
	public void delete(String cominvendId){
		companyinventorydetailDao.delete(cominvendId);
	}

	@Override
	public void deleteBatch(String[] cominvendIds){
		companyinventorydetailDao.deleteBatch(cominvendIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Companyinventorydetail companyinventorydetail=get(id);
			companyinventorydetail.setState(stateValue);
            update(companyinventorydetail);
        }
    }
	
}
