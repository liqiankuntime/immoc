package com.dog;

import java.util.Objects;

/**
 * Created by Liqiankun on 2018/11/27
 * param:
 */
public class Dog extends Animal {
    public int age = 20;
    public void eat(){
        System.out.println("dog eat loon");
    }

    public void dogWatch(){
        System.out.println("狗具有看门的本领");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return age == dog.age;
    }

    @Override
    public int hashCode() {

        return Objects.hash(age);
    }

    public Dog(){
        System.out.println("Dog类构造方法执行了》》》》》》" + this);
    }

}
