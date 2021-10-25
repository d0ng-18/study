package com.slayerd.dao;

import com.slayerd.pojo.Blog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //@Insert("insert into blog values(#{id},#{title},#{author},#{creatTime},#{views})")
    int insertBlog(@Param("id") String id, @Param("title") String title, @Param("author") String author, @Param("createTime")Date creatTime,@Param("views") int views);

    List<Blog> getBlogs(Map map);

    int updateBlog(Map map);

    //查询第一二三记录的博客
    List<Blog> getBlogForeach(Map map);
}
