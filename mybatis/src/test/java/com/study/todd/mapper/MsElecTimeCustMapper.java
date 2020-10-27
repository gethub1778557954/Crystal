package com.study.todd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.study.todd.model.MsElecTimeCustModel;

public interface MsElecTimeCustMapper {
	MsElecTimeCustModel getOne(@Param("id") String id);

	MsElecTimeCustModel getOneAsResultMap(@Param("id") String id);
	String toString();

//	List<MsElecTimeCustModel> getList();
}
