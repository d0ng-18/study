//package com.slayerd.dao;
//
//import com.slayerd.pojo.User;
//import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Select;
//
//import java.util.List;
//
//public interface UserMapper {
//    //根据id查询用户
//    @Select("select * from user")
//    List<User> getUsers();
//
//    //
//    @Select("select * from user where id = #{id} AND user_name = #{name}")
//    User getUser(@Param("id") int id , @Param("name") String name);
//
//    @Insert("insert into user values(#{id},#{name},#{pwd})")
//    int insertUser(@Param("id") int id,@Param("name") String name,@Param("pwd") String pwd);
//}
