package com.collection;

import java.util.*;

/**
 * Created by Liqiankun on 2019/3/8
 * param:
 */
public class SetTest {
    public List<Course> courseToSelect;
    private Scanner console = new Scanner(System.in);

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

   /**
    * List中contains的方法 第三季 6-1
    * */
   public void testListContaines(){
        Course cour = courseToSelect.get(0);
        System.out.println("课程："+cour.id+ cour.name+ "在List中吗？"+ courseToSelect.contains(cour));
        //创建一个新的课程，ID和名称与cour对象完全一样,但是判断是不存在的
       //contains的原理是对List进行遍历，每个对象调用equals方法进行比较，由此可以在课程类中重写equals方法
//       Course cour2 = new Course("1","数据结构");
//       System.out.println("新添加了课程："+ cour2.id+cour2.name);
//       System.out.println("此课程在List中吗？" + courseToSelect.contains(cour2));

        System.out.println("请输入课程名称：");
       Course cour2 = new Course();
        String name = console.next();
        cour2.name = name;
        System.out.println("输入课程名为"+ name + "，在List中吗："+ courseToSelect.contains(cour2));

        //第三季：6-3通过indexOf()获取元素在List中的索引值
       if(courseToSelect.contains(cour2)){
           System.out.println("课程："+ cour2.name+"的索引值为"+courseToSelect.indexOf(cour2));
       }
   }

   public static void main(String[] args){

        SetTest ST = new SetTest();
        ST.testAdd();
        ST.TestForEach();
        ST.forEachForSet(ST.courseToSelect, "添加了：");
//        //创建学生对象
//        Student student = new Student("1", "小明");
//        System.out.println("欢迎"+student.name+"选课！");
//
//        //创建Scanner对象，用来接收从键盘输入的课程ID；
//        Scanner console = new Scanner(System.in);
//        for(int i=0; i<3; i++){
//            System.out.println("请选择课程ID：");
//            String input = console.next();
//            for(Course cs : ST.courseToSelect){
//                if(cs.id.equals(input)){
//                    student.course.add(cs);
//                }
//            }
//        }
//        ST.forEachForSet(student.course, "选择了：");
          ST.testListContaines();
    }
}
