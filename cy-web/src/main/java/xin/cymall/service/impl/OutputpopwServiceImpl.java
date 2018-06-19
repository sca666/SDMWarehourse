package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.OutputpopwDao;
import xin.cymall.entity.Outputpopw;
import xin.cymall.service.OutputpopwService;




@Service("outputpopwService")
@Transactional
public class OutputpopwServiceImpl implements OutputpopwService {
	@Autowired
	private OutputpopwDao outputpopwDao;
	
	@Override
	public Outputpopw get(String outputpopwId){
		return outputpopwDao.get(outputpopwId);
	}

	@Override
	public List<Outputpopw> getList(Map<String, Object> map){
		return outputpopwDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return outputpopwDao.getCount(map);
	}

	@Override
	public void save(Outputpopw outputpopw){
		outputpopwDao.save(outputpopw);
	}

	@Override
	public void update(Outputpopw outputpopw){
		outputpopwDao.update(outputpopw);
	}

	@Override
	public void delete(String outputpopwId){
		outputpopwDao.delete(outputpopwId);
	}

	@Override
	public void deleteBatch(String[] outputpopwIds){
		outputpopwDao.deleteBatch(outputpopwIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Outputpopw outputpopw=get(id);
			outputpopw.setState(stateValue);
            update(outputpopw);
        }
    }
	
}
