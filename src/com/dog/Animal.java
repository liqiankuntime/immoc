package com.dog;

/**
 * Created by Liqiankun on 2018/11/27
 * param:
 *
 */
public class Animal {
    public int age = 10;
    public String name;

    public void eat(){
        System.out.println("动物具有吃的能力");
    }

    public Animal() {
        System.out.println("Animal类构造方法执行类");
    }
}
