package com.collection;

/**
 * Created by Liqiankun on 2019/3/8
 * param:
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 4-9泛型
 * 集合中的元素，可以是任意类型的对象(对象的引用)，如果把某个对象放入集合，则会忽略他的类型，而把他当作Object处理
 *
 * 泛型则是规定了某个集合只可以存放特定类型的对象，会在编译期间进行类型检查
 *
 * 见ListTest.java类的文件
 * */

public class TestGeneric {

    //带有泛型---Course,的List类型属性的定义
    public List<Course> courses;//创建带有泛型的List的属性courses，<>里面写的是List能装那种类型的数据

    //创建构造器，在构造器中初始化courses属性
    public TestGeneric(){
        System.out.println("这是TestGeneric的构造函数！");
        this.courses = new ArrayList<Course>();
    }

    /**
     * 测试增加
     *
     * */
    public void testAdd(){
        Course c1 = new Course("11", "JS");//创建Course实例时就是运行Course类的构造函数
        courses.add(c1);

        //泛型集合中不能加入泛型规定的类型及其子类型以外的对象，否则报错
//        courses.add("我是一个字符串");
    }

    /**
     * for each 循环
     * 和ListTest.java里的for each 循环对比下
     * */

    public void TestForEach(){
        for(Course course : courses){
            System.out.println("课程：："+ course.id+course.name);
        }
    }

    /**
     * 4-10
     * 泛型集合可以添加泛型的子类型的对象实例
     * */
    public void childTest(){
        ChildCourse child = new ChildCourse();
        //对比testAdd()中创建实例和之前ChildCourse继承Course时报错，必须得在Course类中加入 public Course(){}
        child.id = "13";
        child.name = "TS";
        courses.add(child);
//        System.out.println("子级课程："+ child.id+child.name);
    }


    /**
     * 4-10
     * 泛型不能是基本类型
     * */
    public void testBasicType(){
//        List<int> ab = new ArrayList<int>();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
//        list.add(new Course("11", "课程")); 这就会报错了

        System.out.println("Int::"+ list.get(0));
    }



    public static void main(String[] args){
        TestGeneric TT = new TestGeneric();

        TT.testAdd();

        TT.childTest();

        TT.TestForEach();

        TT.testBasicType();
    }
}
