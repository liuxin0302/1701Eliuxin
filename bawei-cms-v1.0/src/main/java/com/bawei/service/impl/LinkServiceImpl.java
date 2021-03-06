package com.bawei.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bawei.dao.LinkDao;
import com.bawei.entity.Link;
import com.bawei.service.LinkService;

/**
 * ��������Serviceʵ����
 * @author user
 *
 */
@Service("linkService")
public class LinkServiceImpl implements LinkService{

	@Resource
	private LinkDao linkDao;
	
	public List<Link> list(Map<String, Object> map) {
		return linkDao.list(map);
	}

	@Override
	public Long getToal(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return linkDao.getToal(map);
	}

	@Override
	public int add(Link link) {
		// TODO Auto-generated method stub
		return linkDao.add(link);
	}

	@Override
	public int update(Link link) {
		// TODO Auto-generated method stub
		return linkDao.update(link);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return linkDao.delete(id);
	}

}
