package com.slayerd.dao;

import com.slayerd.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //查询学生的信息和对应的老师信息
    List<Student> getStudentAndTeacher();

    List<Student> getStudentAndTeacher2();
}
