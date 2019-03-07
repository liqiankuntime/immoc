package com.immoc;

import jdk.internal.org.objectweb.asm.tree.analysis.Analyzer;

/**
 * Created by Liqiankun on 2018/11/26
 * param:
 */
public class Dog extends Animal {
    public void eat(){
        System.out.println("狗吃骨头");
    }
    public Dog(){
        System.out.println("狗的构造方法执行了");
    }
    public void method(){
        System.out.println("super的用法" + super.age);
    }
}
