package com.nanyin.test.arithmetic;

import java.util.Arrays;

public class Choose {
    public static void main(String[] args) {
        Integer[] sortArray = new Integer[]{1, 3, 2, 5, 4, 9, 7, 6, 8};
        for(int i=0;i < sortArray.length;i++){
            // 记录最小值和最小值的位置
            int min = sortArray[i];
            int pos = i ;
            for (int j = i+1 ; j < sortArray.length; j++) {
                //每次排序都需要找出最小的那个，和当前当前i位置上的元素调换位置
                if(sortArray[j] < min){
                    //如果当前元素的值小于min，那么当前元素替换min
                    min = sortArray[j];
                    pos = j;
                }
            }
            // 一次循环后把最小的值和当前值替换
            if(i != pos){
                sortArray[pos] = sortArray[i];
                sortArray[i] = min;
            }
        }
        //打印排好序的数组
        System.out.println(Arrays.toString(sortArray));
    }
}
