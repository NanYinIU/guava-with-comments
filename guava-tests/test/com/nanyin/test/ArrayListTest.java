package com.nanyin.test;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayListTest {
    private int size ;
    @Test
    public void testArray(){
        List<Integer> list = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Map<String,Object> map = new HashMap<>();
        size ++ ;
        System.out.println(size);
        AtomicInteger integer = new AtomicInteger(1);
        for (int i = 0,length=10; i < length; i++) {

        }

        int[] x = new int[]{};
    }
    @Test
    public void testBitOperating(){
        System.out.println(5&6);
        // 0101
        // 0110
        // -----
        // 0100 结果是4
        System.out.println(5 | 6);
        // 0101
        // 0110
        // -----
        // 0111 结果是7
        System.out.println(5 ^ 6);
        // 0101
        // 0110
        // -----
        // 0011 结果是 3
        System.out.println(~5);
        // 0.... 0101
        //-----------
        // 0.... 0101 补码 = 正数的补码和源码相同 负数的补码等于源码取反后+1
        // 1.... 0110 源码 =  取反 后加一 -6
        System.out.println(~-6);
        // 1.....0110
        // 1.....1010  补码：负数的补码为反码+1
        // 0.....0101  源码等于补码取反 5
        System.out.println(8>>2);
    }

    int value;
    public boolean fakeCAS(int expect,int newValue){
        if(value == expect){
            value = newValue;
            return true;
        }else{
            return false;
        }
    }

}
