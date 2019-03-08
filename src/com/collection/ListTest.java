package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

/**
 * Created by Liqiankun on 2019/3/7
 * param:
 *
 * 存放待选课程的类
 */
public class ListTest {
    public List courseToSelect;//存放备选课程的数据格式

    public ListTest(){//在这个构造方法中初始化courseToSelect这个属性
        System.out.println("构造器内容！");
        this.courseToSelect = new ArrayList();//因为List是一个接口，不能直接实例化，而是通过ArrayList对courseToSelect进行实例化
    }

    //往courseToSelect这个容器里添加课程
    /**
     * 用于往courseToSelect里添加课程
     * */
    public void testAdd(){
        //1、创建课程对象对实例
        Course c1 = new Course("1", "数据结构");
        //2、通过List的实例的add()方法，把创建的课程对象对实例加到courseToSelect中
        courseToSelect.add(c1);
        Course tem = (Course)courseToSelect.get(0);//和数组类事都是按下表取值
        System.out.println("添加了课程："+ tem.id + ':' + tem.name);

        Course c2 = new Course("2", "C语言");
        courseToSelect.add(0, c2);//在指定的位置加入元素，这个位置的之前的元素被挤到下一个位置上了
        Course tem2 = (Course)courseToSelect.get(0);
        System.out.println("添加了课程：" + tem2.id+tem2.name);

        Course tem3 = (Course)courseToSelect.get(1);
        System.out.println("第二个元素："+ tem3.id+tem3.name);


//        Course c3 = new Course("3", "test");
//        courseToSelect.add(3, c3);//不能越界加入元素，此时courseToSelect有2个元素，最多从下表2开始加入，而不能从大于2的下表开始加入
//        Course temc3 = (Course)courseToSelect.get(3);
//        System.out.println("长度测试："+ temc3.id+temc3.name);

        //创建课程数组
        Course[] course = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
        courseToSelect.addAll(Arrays.asList(course));//Arrays.asList方法把course数组转为Collection的实例为List类型；

        Course tem4 = (Course)courseToSelect.get(2);
        Course tem5 = (Course)courseToSelect.get(3);
        System.out.println("添加了两个课程："+tem4.id+tem4.name+';'+ tem5.id+tem5.name);

        Course[] course2 = {new Course("5", "高端数学"), new Course("6", "大学英语")};
        courseToSelect.addAll(2, Arrays.asList(course2));
        Course tem6 = (Course)courseToSelect.get(2);
        System.out.println("新第二个元素："+ tem6.id+tem6.name);
    }


    /**
     * 取出List实例中的每一个元素
     *
     * */
    public void testGet(){
        System.out.println("有如下的课程：");
        int size = courseToSelect.size();
        for(int i=0; i<size; i++){
            Course cs = (Course)courseToSelect.get(i);
            System.out.println("课程："+cs.id+cs.name);
        }
    }

    /**
     * 通过迭代器遍历List中的元素
     * */
    public void testIterator(){
        System.out.println("Iterator课程：");
        Iterator it = courseToSelect.iterator();
        while (it.hasNext()){
            Course cr = (Course)it.next();
            System.out.println("课程："+ cr.id+cr.name);
        }

    }

    /**
     * for each方法访问集合的元素
     *
     * 就是Iterator的简便方式
     *
     * 对象存入集合都变成Object类型；取出时需要类型转换
     * */
    public void testForEach(){
        System.out.println("通过forEach来遍历课程：");
        for(Object obj: courseToSelect){
            //对取出来的进行强制转换：
            Course crr = (Course)obj;
            System.out.println("Foreach的课程："+ crr.id+ crr.name);
        }
    }


    /**
     * 4-7
     * 修改List的元素
     * */
    public void testModify(){
        courseToSelect.set( 4, new Course("7", "概论"));

    }

    /**
     * 4-8
     * 删除List的元素
     * */
    public void testRemove(){
        //删除指定的对象
//        Course cc = (Course) courseToSelect.get(4);
//        System.out.println(cc.id+cc.name+"即将被删除");
//        courseToSelect.remove(cc);

        //删除指定索引值的对象
//        System.out.println("即将删除4索引的数据");
//        courseToSelect.remove(1);
//        System.out.println("删除成功2！");

        //
        Course[] courseArr = {(Course) courseToSelect.get(3),(Course) courseToSelect.get(4)};
        courseToSelect.removeAll(Arrays.asList(courseArr));
        testForEach();
    }

    /**
     * 4-9泛型
     * 集合中的元素，可以是任意类型的对象(对象的引用)，如果把某个对象放入集合，则会忽略他的类型，而把他当作Object处理
     *
     * 泛型则是规定了某个集合只可以存放特定类型的对象，会在编译期间进行类型检查
     *
     * 见TestGeneric.java类的文件
     * */



    public static void main(String[] args){
        //1、创建ListTest的实例
        ListTest lT = new ListTest();//就创建了ListTest对象的实例lT，同时在ListTest构造器(ListTest)中把courseToSelect属性给初始化了
//        System.out.println("ListTest:"+ lT);
        lT.testAdd();

        lT.testGet();

        lT.testIterator();

        lT.testForEach();

        lT.testModify();

        lT.testForEach();

        lT.testRemove();

    }
}
