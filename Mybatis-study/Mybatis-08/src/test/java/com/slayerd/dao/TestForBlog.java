package com.slayerd.dao;

import com.slayerd.pojo.Blog;
import com.slayerd.utils.IdUtil;
import com.slayerd.utils.SqlFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class TestForBlog {
    @Test
    public void testInsertBlog(){
        SqlSession sqlSession = SqlFactoryUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Date date = new Date();
        int i = mapper.insertBlog(IdUtil.getId(), "第四篇文章", "slayerd", date, 111);
        if(i>0){
            System.out.println("成功");
        }
        sqlSession.close();
    }

    @Test
    public void testGetBlogs(){
        SqlSession sqlSession = SqlFactoryUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title","第二篇文章");
        map.put("author","slayerd");
        map.put("views",11);
        List<Blog> blogs = mapper.getBlogs(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void testUpdateBlog(){
        SqlSession sqlSession = SqlFactoryUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title","第二篇文章");
        map.put("author","slayerd");
        map.put("views",12);
        int blogs = mapper.updateBlog(map);
        if(blogs != 0 ){
            System.out.println("成功");
        }
        sqlSession.close();
    }

    @Test
    public void testGetBlogsForeach(){
        SqlSession sqlSession = SqlFactoryUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        map.put("ids",arrayList);
        List<Blog> blogs = mapper.getBlogForeach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
