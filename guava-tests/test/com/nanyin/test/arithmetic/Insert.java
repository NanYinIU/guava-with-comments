package com.nanyin.test.arithmetic;

import java.util.Arrays;

/**
 * 插入排序算法
 *
 * @Author nanyin
 * @Date 13:52 2019-06-02
 **/
public class Insert {
    public static void main(String[] args) {
        Integer[] sortArray = new Integer[]{1, 3, 2, 5, 4, 9, 7, 6, 8};
        // 排序后的数组
        Integer[] after = new Integer[sortArray.length];
        for (int i = 0; i < sortArray.length; i++) {
            after[i] = sortArray[i];
            // 对新数组内的比较大小，如果有比他大的，就直接插入在他前面
            for (int j = i-1; j > 0; j--) {
                if (sortArray[i] < after[j]) {
                    after[j+1] = after[j];
                    after[j] = sortArray[i];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(after));
    }
}
