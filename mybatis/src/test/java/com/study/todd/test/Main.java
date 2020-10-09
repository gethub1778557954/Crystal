package com.study.todd.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.velocity.runtime.resource.Resource;

import com.study.todd.mapper.MsElecTimeCustMapper;
import com.study.todd.model.MsElecTimeCustModel;

public class Main {
	public static void main(String[] args) {
		String resource = "resources/mybatis-config.xml";

		InputStream inpurtStream = null;
		try {
			inpurtStream = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}

		SqlSessionFactory sqlSessionFactory = null;

		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inpurtStream);

		SqlSession sqlSession = null;

		try {
			sqlSession = sqlSessionFactory.openSession();
			MsElecTimeCustMapper mapper = sqlSession.getMapper(MsElecTimeCustMapper.class);
			MsElecTimeCustModel bean = mapper.getOne("1");
			System.out.println(bean.toString());

			MsElecTimeCustModel oneAsResultBean = mapper.getOneAsResultMap("1");
			System.out.println(oneAsResultBean.toString());

			sqlSession.close();
		}catch (Exception e) {
			sqlSession.close();
			throw e;
		}finally {
			sqlSession.close();
		}

	}

}
