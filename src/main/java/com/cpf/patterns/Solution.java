package com.cpf.patterns;

import java.util.HashMap;
import java.util.Map;

/**
 * date 2020/8/4
 *
 * @author caopengflying
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(i, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (hashMap.containsValue(value)) {
                for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                    if (entry.getValue() == value && entry.getKey() != i) {
                        return new int[] {i,entry.getKey()};
                    }
                }
            }
        }
        throw new RuntimeException("不存在");
    }

    public static void main(String[] args) {
//        nums = [2, 7, 11, 15], target = 9
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Solution solution = new Solution();
        int[] ints = solution.twoSum(nums, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
