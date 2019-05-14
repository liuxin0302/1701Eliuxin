package com.liuxin.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuxin.bean.Goods;
import com.liuxin.bean.Type;
import com.liuxin.bean.ZhongLei;
import com.liuxin.mapper.GoodsMapperDao;
@Service
public class GoodsServiceImpl implements GoodsService{
	
	@Autowired
	private GoodsMapperDao goodsMapperDao;
	
	@Override
	public List<Map<String, Object>> getList() {
		// TODO Auto-generated method stub
		return goodsMapperDao.getList();
	}

	@Override
	public List<Type> getType() {
		// TODO Auto-generated method stub
		return goodsMapperDao.getType();
	}

	@Override
	public List<ZhongLei> getZhongLei() {
		// TODO Auto-generated method stub
		return goodsMapperDao.getZhongLei();
	}

	@Override
	public int add(Goods goods) {
		// TODO Auto-generated method stub
		return goodsMapperDao.add(goods);
	}

	@Override
	public int del(int gid) {
		// TODO Auto-generated method stub
		return goodsMapperDao.del(gid);
	}

	@Override
	public List<Map<String, Object>> tochakan(int gid) {
		// TODO Auto-generated method stub
		return goodsMapperDao.tochakan(gid);
	}

}
