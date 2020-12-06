package com.hongzhi.springboot.mapper;

import com.hongzhi.springboot.model.Student;
import org.apache.ibatis.annotations.Mapper;

//@Mapper //扫描Dao接口到Spring容器中
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}