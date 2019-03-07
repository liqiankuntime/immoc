package com.immoc;

/**
 * Created by Liqiankun on 2018/11/26
 * param:
 */
public class InitalAnimal {
    public static void main(String[] args){
        Animal animal = new Animal();
        System.out.println("animal age is" + animal.age);
        Dog dog = new Dog();
        System.out.println("age is: " + dog.age);
        dog.eat();
        dog.method();
    }
}
