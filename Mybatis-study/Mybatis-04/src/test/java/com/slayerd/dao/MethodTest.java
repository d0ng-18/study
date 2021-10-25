package com.slayerd.dao;

import com.slayerd.pojo.Student;
import com.slayerd.pojo.Teacher;
import com.slayerd.utils.SqlFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MethodTest {
    @Test
    public void testGetTeachers(){
        SqlSession sqlSession = SqlFactoryUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = mapper.getTeachers();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }
    @Test
    public void testGetTeachers2(){
        SqlSession sqlSession = SqlFactoryUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = mapper.getTeachers2();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }
    @Test
    public void testGetStudentAndTeacher(){
        SqlSession sqlSession = SqlFactoryUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentAndTeacher = mapper.getStudentAndTeacher2();
        for (Student student : studentAndTeacher) {
            Teacher teacher = new Teacher();
            teacher = student.getTeacher();
            System.out.println(student+"-->"+teacher);
        }
        sqlSession.close();
    }
}
