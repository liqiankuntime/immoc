package com.collection;

import java.util.HashSet;
import java.util.Set;
/**
 * Created by Liqiankun on 2019/3/7
 * param:
 */
public class Student {
    public String name;
    public String id;

    public Set course;//用Set数据格式存放学生选择的课程

    public Student(String id, String name){
        this.id = id;
        this.name = name;

        //不能直接实例化一个Set，应为Set是一个接口，通过hashSet对course进行实例化
        this.course = new HashSet();
    }

}
