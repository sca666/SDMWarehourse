package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.OutputapplymainDao;
import xin.cymall.entity.Outputapplymain;
import xin.cymall.service.OutputapplymainService;




@Service("outputapplymainService")
@Transactional
public class OutputapplymainServiceImpl implements OutputapplymainService {
	@Autowired
	private OutputapplymainDao outputapplymainDao;
	
	@Override
	public Outputapplymain get(String outputapplymainId){
		return outputapplymainDao.get(outputapplymainId);
	}

	@Override
	public List<Outputapplymain> getList(Map<String, Object> map){
		return outputapplymainDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return outputapplymainDao.getCount(map);
	}

	@Override
	public void save(Outputapplymain outputapplymain){
		outputapplymainDao.save(outputapplymain);
	}

	@Override
	public void update(Outputapplymain outputapplymain){
		outputapplymainDao.update(outputapplymain);
	}

	@Override
	public void delete(String outputapplymainId){
		outputapplymainDao.delete(outputapplymainId);
	}

	@Override
	public void deleteBatch(String[] outputapplymainIds){
		outputapplymainDao.deleteBatch(outputapplymainIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Outputapplymain outputapplymain=get(id);
			outputapplymain.setState(stateValue);
            update(outputapplymain);
        }
    }
	
}
