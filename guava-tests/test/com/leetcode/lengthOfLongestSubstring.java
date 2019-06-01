package com.leetcode;

import org.junit.Test;

import java.util.HashMap;

public class lengthOfLongestSubstring {
    // s = "abcabcdd"

    @Test
    public void testxx(){
        test("abcabccc");
    }

    public int test(String s){
        int n = s.length(),ans=0;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int j=0,i=0;j<n;j++){
            if(hashMap.containsKey(s.charAt(j))){ //包含字符
                i = Math.max(hashMap.get(s.charAt(j)),i);
            }
            ans = Math.max(ans, j - i + 1);
            hashMap.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}
