package com.bawei.dao;

import java.util.List;
import java.util.Map;

import com.bawei.entity.Link;

/**
 * ��������Dao�ӿ�
 * @author user
 *
 */
public interface LinkDao {

	/**
	 * ����������ҳ��ѯ�������Ӽ���
	 * @param map
	 * @return
	 */
	public List<Link> list(Map<String,Object> map);
	/**
	 *获取友情链接的总数量
	 * @param map
	 * @return
	 */
	public Long getToal(Map<String,Object> map);
	/**
	 * 添加链接
	 * @param map
	 * @return
	 */
	public int add(Link link);
	
	
	
	
}
