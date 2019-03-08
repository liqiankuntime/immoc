package com.collection;

import java.util.*;

/**
 * Created by Liqiankun on 2019/3/8
 * param:
 */
public class SetTest {

    public List<Course> courseToSelect;

    public SetTest(){
        courseToSelect = new ArrayList<Course>();//在构造函数里初始化courseToSelect属性
    }

    public void testAdd(){
        //1、创建课程对象对实例
        Course c1 = new Course("1", "数据结构");
        //2、通过List的实例的add()方法，把创建的课程对象对实例加到courseToSelect中
        courseToSelect.add(c1);

        Course c2 = new Course("2", "C语言");
        courseToSelect.add(c2);


        Course c3 = new Course("3", "JS语言");
        courseToSelect.add(c3);


        Course c4 = new Course("4", "JAVA语言");
        courseToSelect.add(c4);


        Course c5 = new Course("5", "Python语言");
        courseToSelect.add(c5);

        Course c6 = new ChildCourse();
        c6.id = "6";
        c6.name = "C++语言";
        courseToSelect.add(c6);


    }

    public void TestForEach(){
        for(Course course : courseToSelect){
            System.out.println("课程：："+ course.id+course.name);
        }
    }

    public void forEachForSet(Collection<Course> courseData, String param){
        System.out.println(param + courseData.size()+"门课程！");
        for(Course cs:courseData){
            System.out.println("选择了课程："+ cs.id+":"+cs.name);
        }
    }

    public static void main(String[] args){

        SetTest ST = new SetTest();
        ST.testAdd();
//        ST.TestForEach();
        ST.forEachForSet(ST.courseToSelect, "添加了：");
        //创建学生对象
        Student student = new Student("1", "小明");
        System.out.println("欢迎"+student.name+"选课！");

        //创建Scanner对象，用来接收从键盘输入的课程ID；
        Scanner console = new Scanner(System.in);
        for(int i=0; i<3; i++){
            System.out.println("请选择课程ID：");
            String input = console.next();
            for(Course cs : ST.courseToSelect){
                if(cs.id.equals(input)){
                    student.course.add(cs);
                }
            }
        }
        ST.forEachForSet(student.course, "选择了：");

    }
}
