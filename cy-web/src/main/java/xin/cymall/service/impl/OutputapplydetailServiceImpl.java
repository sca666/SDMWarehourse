package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.OutputapplydetailDao;
import xin.cymall.entity.Outputapplydetail;
import xin.cymall.service.OutputapplydetailService;




@Service("outputapplydetailService")
@Transactional
public class OutputapplydetailServiceImpl implements OutputapplydetailService {
	@Autowired
	private OutputapplydetailDao outputapplydetailDao;
	
	@Override
	public Outputapplydetail get(String outputapplydetailId){
		return outputapplydetailDao.get(outputapplydetailId);
	}

	@Override
	public List<Outputapplydetail> getList(Map<String, Object> map){
		return outputapplydetailDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return outputapplydetailDao.getCount(map);
	}

	@Override
	public void save(Outputapplydetail outputapplydetail){
		outputapplydetailDao.save(outputapplydetail);
	}

	@Override
	public void update(Outputapplydetail outputapplydetail){
		outputapplydetailDao.update(outputapplydetail);
	}

	@Override
	public void delete(String outputapplydetailId){
		outputapplydetailDao.delete(outputapplydetailId);
	}

	@Override
	public void deleteBatch(String[] outputapplydetailIds){
		outputapplydetailDao.deleteBatch(outputapplydetailIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Outputapplydetail outputapplydetail=get(id);
			outputapplydetail.setState(stateValue);
            update(outputapplydetail);
        }
    }
	
}
