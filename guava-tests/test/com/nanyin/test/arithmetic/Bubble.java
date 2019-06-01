package com.nanyin.test.arithmetic;

public class Bubble {
    public static void main(String[] args) {
        Integer[] sortArray = new Integer[]{1, 3, 2, 5, 4, 9, 7, 6, 8};
        for (int i = sortArray.length; i > 0; i--) {
            for (int j = sortArray.length; j > i + 1; j--)
                swap(sortArray, j - 1, j - 2);
        }
        for (Integer i : sortArray
        ) {
            System.out.println("current value:" + i);
        }
        ;
    }

    static void swap(Integer[] arr, Integer f1, Integer f2) {
        if (arr[f1] < arr[f2]) {
            Integer org = arr[f1];
            arr[f1] = arr[f2];
            arr[f2] = org;
        }
    }

}
