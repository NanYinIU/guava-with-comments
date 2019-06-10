package com.nanyin.test.arithmetic;

import java.util.Arrays;

public class Shell {
    public static void main(String[] args) {
        Integer[] sortArray = new Integer[]{1, 3, 2, 5, 4, 9, 7, 6, 8, 11, 13, 12, 10, 16, 15, 18, 19, 20};
        int gap = sortArray.length;
        while (gap > 0) {
            // 对间隔为gap的元素进行选择排序
            for (int i = gap; i < sortArray.length; i = i + 1) {
                // 对筛选出的组   进行排序
                for (int j = i ; j < sortArray.length / gap; j = j + gap) {
                    if (sortArray[j-gap] > sortArray[j]) {
                        Integer temp = sortArray[j-gap];
                        sortArray[j-gap] = sortArray[j];
                        sortArray[j] = temp;
                    }
                }
            }
            gap = gap / 2;
        }
        System.out.println(Arrays.toString(sortArray));
    }
}
