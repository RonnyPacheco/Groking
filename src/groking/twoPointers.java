package groking;

import java.util.Arrays;

public class twoPointers {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left = left + 1;
            right = right - 1;
        }
        return true;
    }
    public static boolean findSumOfThree(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return false; //edge case, need at least 3
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    return true;
                } else if (sum < target) {
                    left++;
                } else { // sum > target
                    right--;
                }
            }
        }
        return false;
    }

}
