package com.slayerd09.diy;

public class PointCut {
    public void beforeMethod(){
        System.out.println("方法执行之前打印日志");
    }
    public void afterMethod(){
        System.out.println("方法执行之后打印日志");
    }
}
