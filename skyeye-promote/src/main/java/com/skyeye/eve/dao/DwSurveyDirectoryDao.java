package com.skyeye.eve.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;

@Repository
@Mapper
public interface DwSurveyDirectoryDao {

	public List<Map<String, Object>> queryDwSurveyDirectoryList(Map<String, Object> map, PageBounds pageBounds) throws Exception;

	public int insertDwSurveyDirectoryMation(Map<String, Object> map) throws Exception;

}
