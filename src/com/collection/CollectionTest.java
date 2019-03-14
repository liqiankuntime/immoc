package com.collection;

import java.util.*;

/**
 * Created by Liqiankun on 2019/3/14
 * param:
 * 第三季：6-5
 * 1、通过Collections.sort()方法，对Integer泛型的List进行排序
 * 2、对String泛型的List进行排序
 * 3、对其他类型对泛型的List进行排序，以Student为例
 */
public class CollectionTest {
    /**
     * 1、通过Collections.sort()方法，对Integer泛型的List进行排序
     * 创建一个Integer泛型的List，插入10个100内的不重复数据
     * 调用Collection.sort()对其进行排序
     */
    public void testIntegerSort(){
        //创建一个Integer泛型的List，不能使用基本类型作为泛型，若必须使用的话得使用其包装类
        List<Integer> integerList = new ArrayList<Integer>();
        //插入10个100内的不重复数据
        Random random = new Random();
        Integer k;
        for(int i=0; i<10; i++){
            do{
                k = random.nextInt(100);
            }while(integerList.contains(k));//如果已经包含了就重新生成
            integerList.add(k);
        }
        System.out.println("----------排序前---------");
        for(Integer inter: integerList){
            System.out.println("排序前元素："+inter);
        }
        Collections.sort(integerList);
        System.out.println("-----------排序后----------");
        for(Integer integer: integerList){
            System.out.println("排序后："+integer);
        }
    }

    /**
     * 2、对String泛型的List进行排序
     * */
    public void testStringSort(){
        List<String> stringList = new ArrayList<String>();
        stringList.add("5");
        stringList.add("15");
        stringList.add("25");
        System.out.println("-------排序前-------");
        for(String string: stringList){
            System.out.println("元素："+string);
        }
        Collections.sort(stringList);
        System.out.println("--------排序后---------");
        for(String string:stringList){
            System.out.println("元素："+string);
        }
    }

    public static void main(String[] args){
        CollectionTest CT = new CollectionTest();
//        CT.testIntegerSort();
        CT.testStringSort();
    }
}
