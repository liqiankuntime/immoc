package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class MapTest {
    /**
     * 用来放学生类型的对象 第三集 第五章
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

    /**
     * 删除Map中的映射
     * */
    public void testRemove(){
        while (true){
            System.out.println("请输入删除学生的ID：");
            Scanner console = new Scanner(System.in);
            String ID = console.next();
            Student st = students.get(ID);
            if(st == null){
                System.out.println("没有此学生！");
                continue;
            }
            students.remove(ID);
            return;
        }
    }

    /**
     * 通过entrySet方法来遍历Map
     * */
    public void testEntrySet(){
        //通过entrySet方法，返回Map中的所有键值对
        Set<Entry<String, Student>> entryset = students.entrySet();
        for(Entry<String, Student> entry: entryset){
            System.out.println("取得值："+entry.getKey());
            System.out.println("对应的值："+ entry.getValue().name);
        }
    }

    /**
     * 利用put方法修改Map中的已有的映射  第三季：5-4：
     * */
    public void testModify(){
        while (true){
            System.out.println("亲输入修改学生ID：");
            Scanner console = new Scanner(System.in);
            String stuId = console.next();
            Student stu = students.get(stuId);
            if(stu == null){
                System.out.println("没有此ID的学生，请从新输入");
                continue;
            }
            System.out.println("输入ID所对应的学生是："+stu.name);
            System.out.println("请输入新的名字");
            String newName = console.next();
            Student newStu = new Student(stuId, newName);
            students.put(stuId, newStu);
            return;
        }
    }


    public static void main(String[] args){
        MapTest MT = new MapTest();
        MT.testPut();
        MT.testKeySet();

//        MT.testRemove();
//        MT.testEntrySet();

        MT.testModify();
        MT.testEntrySet();
    }
}










































































