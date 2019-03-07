package com.immoc;

/**
 * Created by Liqiankun on 2018/11/26
 * param:
 */
public class Animal {
    public int age = 100;
    public String name;
    public void eat(){
        System.out.println("动物具有吃东西的基本技能");
    }
    public Animal(){
        System.out.println("Animal类的构造方法执行了");
        age = 300;
    }
}
