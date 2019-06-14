package com.nanyin.test.arithmetic;

import java.util.Arrays;

/**
 * 快速排序问题，设置左边为高位high，右边为低位low
 * ----------------------------->
 * ^                        ^
 * 此处为高位                此处为低位
 *
 * @Author nanyin
 * @Date 13:26 2019-06-14
 **/
public class Quick {
    public static void main(String[] args) {
        int[] sortArray = new int[]{9,1, 3, 2, 5, 4,0};
        quick_sort(sortArray, 0, sortArray.length -1 );
        System.out.println(Arrays.toString(sortArray));
    }

    public static void quick_sort(int[] arr, int left, int right) {
        int high = left;//左侧设置为高位
        int low = right; //右侧设置为低位
        int standard_number = arr[low];//低位为标准数
        if (low < high) {
            return;
        }
        while (low - high > 0) {
            // 左右两侧向中间逼近
            //1.从左向右移动，直到有元素大于标准值
            while (low - high > 0 && arr[high] < standard_number)
                high++;
            //运行到这一步说明找到元素大于标准值了，替换低位值,并且低位向高位移动一格
            if (low - high > 0) {
                arr[low--] = arr[high];
            }
            //2.从右向左移动，直到元素小于标准值
            while (low > high && arr[low] > standard_number)
                low--;
            if (low - high > 0) {
                arr[high++] = arr[low];
            }
        }
        // 最后将两个指针重叠的位置上替换为standard_num
        arr[high] = standard_number;

        //重复比较 左侧和右侧
        if(high > 1){
            quick_sort(arr, left, high - 1);
        }
        if (high != arr.length - 1){
            quick_sort(arr, high + 1, right);
        }
    }

}
