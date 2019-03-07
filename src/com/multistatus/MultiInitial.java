package com.multistatus;

import com.immoc.Animal;

/**
 * Created by Liqiankun on 2018/11/27
 * param:
 * java入门第二季：4-1 java的多态
 */
public class MultiInitial {
    public static void main(String[] args){
//        AnimalMulti dog = new AnimalMulti();
//        AnimalMulti dog2 = new MultiDog();
//        MultiDog dog1 = new MultiDog();
//
//        dog.eat();
//        dog2.eat();
//        //dog2.watchDoor()//不能从父类的引用调用子类独有的方法
//        dog1.watchDoor();//子类的引用可以调用子类的独有方法



        MultiDog dog = new MultiDog();
        AnimalMulti animal = dog;

        MultiDog dog2 = (MultiDog) animal;

//        MultiCat cat = (MultiCat) animal;
        System.out.println(animal instanceof MultiCat);
        System.out.println(animal instanceof MultiDog);

    }
}
