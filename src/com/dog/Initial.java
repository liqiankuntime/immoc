package com.dog;

/**
 * Created by Liqiankun on 2018/11/27
 * param:
 */
public class Initial {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.age = 10;
        Dog dog2 = new Dog();
        dog2.age = 30;
        if(dog.equals(dog2)){
            System.out.println("俩对象是相同的");
        }else{
            System.out.println("俩对象是不相同的");
        }


//        dog.eat();
    }
}
