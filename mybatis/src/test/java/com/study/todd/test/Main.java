package com.study.todd.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

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
			if (bean != null) {
				System.out.println(bean.toString());
			} else {
				System.out.println("bean is null");
			}

			MsElecTimeCustModel resultMapBean = mapper.getOneAsResultMap("1");
			if (resultMapBean != null) {
				System.out.println(resultMapBean.toString());
			} else {
				System.out.println("resultMapBean is null");
			}

			sqlSession.close();
		} catch (Exception e) {
			sqlSession.close();
			throw e;
		} finally {
			sqlSession.close();
		}

	}

}
