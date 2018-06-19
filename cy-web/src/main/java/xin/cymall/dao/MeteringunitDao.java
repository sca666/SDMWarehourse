package xin.cymall.dao;

import xin.cymall.entity.Meteringunit;

import java.util.List;

/**
 * 计量单位
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public interface MeteringunitDao extends BaseDao<Meteringunit> {

    List<Meteringunit> getMeteringUnit();

}
