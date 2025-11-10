import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int longest = 1, current = 1;

        for (int i = 1; i < nums.length; i++) {
            // Skip duplicates
            if (nums[i] == nums[i - 1]) continue;

            if (nums[i] == nums[i - 1] + 1) {
                current++;
            } else {
                longest = Math.max(longest, current);
                current = 1;
            }
        }

        return Math.max(longest, current);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(s.longestConsecutive(nums)); // Output: 4
    }
}

