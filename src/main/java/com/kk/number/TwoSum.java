package com.kk.number;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Example 1:
 * <p>
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class TwoSum {

    public static void main(String[] args) {

        System.out.println(53 % 10);

        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(ints));

        int[] ints2 = twoSum2(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(ints2));
    }


    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int remainValue = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == remainValue) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remainValue = target - nums[i];
            if (map.containsKey(remainValue)) {
                return new int[]{map.get(remainValue), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}