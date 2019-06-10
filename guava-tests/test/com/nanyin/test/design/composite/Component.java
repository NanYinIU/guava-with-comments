package com.nanyin.test.design.composite;

import java.util.LinkedList;
import java.util.List;

public abstract class Component {
    String name;
    Integer areaLevel;

    public Component(String name, Integer areaLevel) {
        this.name = name;
        this.areaLevel = areaLevel;
    }

    // 整体和部分都要继承这个组件
    public void printName(){
        System.out.println("Name : "+name);
    };

    public void printLevel(){
        System.out.println("Area Level :" + areaLevel);
    };

    public abstract void printAll();

}
