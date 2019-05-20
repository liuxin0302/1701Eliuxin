package com.bawei.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.bawei.bean.Goods;
import com.bawei.mapper.GoodsMapperDao;

public class Test1 {
	/*@Test
	public void getList() {
		
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		GoodsMapperDao goodsMapperDao = sqlSession.getMapper(GoodsMapperDao.class);
		
		List<Goods> findGoodsList = goodsMapperDao.findGoodsList();
		for (Goods goods : findGoodsList) {
			System.out.println(goods);
		}
		
		sqlSession.close();
	}
	
	@Test
	public void getLike() {
		
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		GoodsMapperDao goodsMapperDao = sqlSession.getMapper(GoodsMapperDao.class);
		
		List<Goods> likeGoodsList = goodsMapperDao.likeGoodsList("电");
		for (Goods goods : likeGoodsList) {
			System.out.println(goods);
		}
		
		sqlSession.close();
	}
	*/
	@Test
	public void getLikeByNameOrPrice() {
		
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		GoodsMapperDao goodsMapperDao = sqlSession.getMapper(GoodsMapperDao.class);
		
		List<Goods> findByNameOrPrice = goodsMapperDao.findByNameOrPrice("电", 10.2);
		for (Goods goods : findByNameOrPrice) {
			System.out.println(goods);
		}
		
		sqlSession.close();
	}
	
	@Test
	public void getLikeByNameOrPrice1() {
		
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		GoodsMapperDao goodsMapperDao = sqlSession.getMapper(GoodsMapperDao.class);
		Map<String , Object> map=new HashMap<>();
		map.put("gname", "电");
		map.put("num", 500.0);
	    List<Goods> findByNameOrPrice1 = goodsMapperDao.findByNameOrPrice1(map);
		for (Goods goods : findByNameOrPrice1) {
			System.out.println(goods);
		}
		
		sqlSession.close();
	}
}
