package xin.cymall.dao;

import xin.cymall.entity.Commodity;

import java.util.List;

/**
 * 商品
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public interface CommodityDao extends BaseDao<Commodity> {

    List<Commodity> getcodenum(Commodity commodity);
}
