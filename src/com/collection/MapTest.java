package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
    /**
     * 用来放学生类型的对象
     * 泛型： key：id(String), value: Student
     * */
    public Map<String, Student> students;

    /**
     * 创建构造方法，并初始化students属性
     * */
    public MapTest(){
        this.students = new HashMap<String, Student>();
    }

    /**
     * 测试添加：输入ID判断这个ID是否被占用
     * */
    public void testPut(){
        //创建Scanner对象
        Scanner console = new Scanner(System.in);
        int i = 0;
        while (i<3){
            System.out.println("请输入学生ID：");
            String ID = console.next();
            Student stu = students.get(ID);
            if(stu == null){
                //提示输入学生姓名
                System.out.println("请输入学生姓名");
                String name = console.next();
                Student newStu = new Student(ID, name);
                students.put(ID, newStu);
                System.out.println("成功加入学生："+ newStu.name);
                i++;
            }else{
                System.out.println("此学生ID已被占用");
                continue;
            }
        }
    }

    /**
     * 遍历students中对象
     * */
    public void testKeySet(){
        //Map的keySet方法返回所有键的Set集合
        System.out.println("共有学生："+students.size());
        Set<String> keySet = students.keySet();
        for(String stuId: keySet){
            Student st = students.get(stuId);
            if(st != null){
                System.out.println("学生："+st.name);
            }
        }
    }

    public static void main(String[] args){
        MapTest MT = new MapTest();
        MT.testPut();
        MT.testKeySet();
    }
}










































































