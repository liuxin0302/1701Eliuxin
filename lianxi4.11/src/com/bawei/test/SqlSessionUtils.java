package com.bawei.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtils {

	public static SqlSession getSqlSession() {
		SqlSession sqlSession = null;
		try {
			//1.�����������ļ�
			String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			//2.�����Ự����
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			//3.�����Ự(�ṩ����ɾ�Ĳ�Ľӿ�)
			sqlSession = sqlSessionFactory.openSession();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return sqlSession;
	}

}
