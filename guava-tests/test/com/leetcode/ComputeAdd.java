package com.leetcode;

import org.junit.Test;

import java.util.HashMap;

public class ComputeAdd {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] result = twoSum(nums,9);
        for (int re:result
             ) {
            System.out.println(result);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int[] result = new int[2];
        for(int i=0,length=nums.length;i<length;i++){

                int value = target - nums[i];
                if(hashmap.containsKey(value)){
                    result[1]=i;
                    result[0]=hashmap.get(value);
                }
                hashmap.put(nums[i],i);

        }
        return result;
    }

    @Test
    public void testx(){
        System.out.println((int)39/10);
    }
}
