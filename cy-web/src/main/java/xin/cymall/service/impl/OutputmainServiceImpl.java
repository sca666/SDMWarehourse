package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.OutputmainDao;
import xin.cymall.entity.Outputmain;
import xin.cymall.service.OutputmainService;




@Service("outputmainService")
@Transactional
public class OutputmainServiceImpl implements OutputmainService {
	@Autowired
	private OutputmainDao outputmainDao;
	
	@Override
	public Outputmain get(String outputmainId){
		return outputmainDao.get(outputmainId);
	}

	@Override
	public List<Outputmain> getList(Map<String, Object> map){
		return outputmainDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return outputmainDao.getCount(map);
	}

	@Override
	public void save(Outputmain outputmain){
		outputmainDao.save(outputmain);
	}

	@Override
	public void update(Outputmain outputmain){
		outputmainDao.update(outputmain);
	}

	@Override
	public void delete(String outputmainId){
		outputmainDao.delete(outputmainId);
	}

	@Override
	public void deleteBatch(String[] outputmainIds){
		outputmainDao.deleteBatch(outputmainIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Outputmain outputmain=get(id);
			outputmain.setState(stateValue);
            update(outputmain);
        }
    }
	
}
