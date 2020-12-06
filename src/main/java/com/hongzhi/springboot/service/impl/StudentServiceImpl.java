package com.hongzhi.springboot.service.impl;

import com.hongzhi.springboot.mapper.StudentMapper;
import com.hongzhi.springboot.model.Student;
import com.hongzhi.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    //@Transactional //开启事务
    @Override
    public Student queryStudentById(Integer id) {

        return studentMapper.selectByPrimaryKey(id);
    }
}
