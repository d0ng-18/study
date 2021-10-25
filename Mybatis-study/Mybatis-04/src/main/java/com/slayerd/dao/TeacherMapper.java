package com.slayerd.dao;

import com.slayerd.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {

    List<Teacher> getTeachers();

    List<Teacher> getTeachers2();
}
