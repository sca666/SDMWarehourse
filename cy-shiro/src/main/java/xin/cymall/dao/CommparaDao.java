package xin.cymall.dao;

import xin.cymall.entity.Commpara;
import xin.cymall.entity.SysCode;

import java.util.List;
import java.util.Map;

/**
 * 字典管理
 * 
 * @author chenyi
 * @email qq228112142@qq.com
 * @date 2017-11-06 14:49:28
 */
public interface CommparaDao extends BaseDao<Commpara> {

    List<SysCode> getCodeValues(Map<String, Object> params);

    List<Commpara> findByVerify(Commpara commpara);
}
