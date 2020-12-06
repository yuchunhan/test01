package com.hongzhi.springboot.service;

import com.hongzhi.springboot.model.Student;

public interface StudentService {
    //根据学生id查询详情
    Student queryStudentById(Integer id);
}
