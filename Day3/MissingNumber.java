class Solution {
    public int missingNumber(int[] nums) {
       int MAX = Integer.MIN_VALUE;  
        int MIN = Integer.MAX_VALUE;  

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > MAX) {
                MAX = nums[i];
            }
            if (nums[i] < MIN) {
                MIN = nums[i];
            }
        }

        for (int i = MIN; i <= MAX; i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return MAX + 1;
    }
}