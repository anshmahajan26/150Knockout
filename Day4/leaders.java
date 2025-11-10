import java.util.*;
class Solution {
    public List<Integer> findLeaders(int[] nums) {
        List<Integer> leaders = new ArrayList<>();
        int n = nums.length;

        // Step 1: For each element, check elements to its right
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;

            // Step 2: Compare nums[i] with all elements to its right
            for (int j = i + 1; j < n; j++) {
                if (nums[j] >= nums[i]) {
                    isLeader = false;
                    break; // no need to check further
                }
            }

            // Step 3: If leader, add to the result list
            if (isLeader) {
                leaders.add(nums[i]);
            }
        }

        return leaders;
    }
}
