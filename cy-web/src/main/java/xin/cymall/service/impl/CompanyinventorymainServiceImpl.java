package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.CompanyinventorymainDao;
import xin.cymall.entity.Companyinventorymain;
import xin.cymall.service.CompanyinventorymainService;




@Service("companyinventorymainService")
@Transactional
public class CompanyinventorymainServiceImpl implements CompanyinventorymainService {
	@Autowired
	private CompanyinventorymainDao companyinventorymainDao;
	
	@Override
	public Companyinventorymain get(String cominvenmId){
		return companyinventorymainDao.get(cominvenmId);
	}

	@Override
	public List<Companyinventorymain> getList(Map<String, Object> map){
		return companyinventorymainDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return companyinventorymainDao.getCount(map);
	}

	@Override
	public void save(Companyinventorymain companyinventorymain){
		companyinventorymainDao.save(companyinventorymain);
	}

	@Override
	public void update(Companyinventorymain companyinventorymain){
		companyinventorymainDao.update(companyinventorymain);
	}

	@Override
	public void delete(String cominvenmId){
		companyinventorymainDao.delete(cominvenmId);
	}

	@Override
	public void deleteBatch(String[] cominvenmIds){
		companyinventorymainDao.deleteBatch(cominvenmIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Companyinventorymain companyinventorymain=get(id);
			companyinventorymain.setState(stateValue);
            update(companyinventorymain);
        }
    }
	
}
