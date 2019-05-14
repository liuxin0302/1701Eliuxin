package com.liuxin.service;

import java.util.List;
import java.util.Map;

import com.liuxin.bean.Goods;
import com.liuxin.bean.Type;
import com.liuxin.bean.ZhongLei;

public interface GoodsService {

	List<Map<String, Object>> getList();

	List<Type> getType();

	List<ZhongLei> getZhongLei();

	int add(Goods goods);

	int del(int gid);

	List<Map<String, Object>> tochakan(int gid);


	

}
