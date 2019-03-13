package com.collection;

import java.lang.Override;
import java.util.Objects;

/**
 * Created by Liqiankun on 2019/3/7
 * param:
 *
 * 第三季: 4-3+ 学生选课
 *
 * 课程类
 */
public class Course {

    public String id;
    public String name;

    public Course(String id, String name){//为了方便使用加上这个含参构造器
//        System.out.println("这是Course的构造函数");
        this.id = id;
        this.name = name;
    }
    public Course(){
//        System.out.println("这是Course的构造函数2222");
    }


    //第三集 6-1： SetTest中testListContaines方法中
    @Override
    public boolean equals(Object obj){
        //思考 null能否调用equals方法
        if(this == obj) return true;
        if(obj == null) return false;
        if(!(obj instanceof Course)) return false;
        Course course = (Course) obj;
        if(this.name == null){
            if(course.name == null){
                return true;
            }else{
                return false;
            }
        }else{
            if(this.name.equals(course.name)){
               return true;
            }else{
                return false;
            }
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
