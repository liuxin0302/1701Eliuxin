package com.bawei.service;

import java.util.List;
import java.util.Map;

import com.bawei.entity.Link;

/**
 * ��������Service�ӿ�
 * @author user
 *
 */
public interface LinkService {

	/**
	 * ����������ҳ��ѯ�������Ӽ���
	 * @param map
	 * @return
	 */
	public List<Link> list(Map<String,Object> map);
	
	public Long getToal(Map<String,Object> map);
	
	public int add(Link link);
	public int update(Link link);
	public int delete(int id);
}
