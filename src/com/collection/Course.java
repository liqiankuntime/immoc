package com.collection;

/**
 * Created by Liqiankun on 2019/3/7
 * param:
 *
 * 第四季: 4-3+ 学生选课
 *
 * 课程类
 */
public class Course {

    public String id;
    public String name;

    public Course(String id, String name){//为了方便使用加上这个含参构造器
        System.out.println("这是Course的构造函数");
        this.id = id;
        this.name = name;
    }
    public Course(){

    }

}
