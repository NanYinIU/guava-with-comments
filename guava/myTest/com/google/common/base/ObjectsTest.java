package com.google.common.base;

import junit.framework.TestCase;

/**
 * 就像它的名字一样 大部分封装的是Jdk的Object类中的方法
 * Objects 的测试方法 看了看Objects类里面只有两个方法。。今天比较轻松。。
 */
public class ObjectsTest extends TestCase {

    public void testEquals(){
        String s = null;
        String s1 = "not null";
        Objects.equal(s,s1);//带来的好处就是不必探测两个值是否为null
    }

    public void testHashCode(){
        int hash = Objects.hashCode("not null"); //返回arrays.hashcode方法输出int类型
    }
}
