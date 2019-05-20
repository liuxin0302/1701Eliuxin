package com.bawei.mapper;

import java.util.List;
import java.util.Map;

import com.bawei.bean.Goods;

public interface GoodsMapperDao {
	
	List<Goods> findGoodsList();
	
	List<Goods> likeGoodsList(String gname);
	
	List<Goods> findByNameOrPrice(String gname,double price);
	
	List<Goods> findByNameOrPrice1(Map<String , Object> map);
	
}
