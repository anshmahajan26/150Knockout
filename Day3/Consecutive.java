public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;      // To store the maximum consecutive 1s
        int currentCount = 0;  // To count the current streak of 1s

        for (int num : nums) {
            if (num == 1) {
                currentCount++;                 // Increment current streak
                maxCount = Math.max(maxCount, currentCount); // Update maxCount
            } else {
                currentCount = 0;               // Reset streak when 0 is encountered
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        int[] nums2 = {1, 0, 1, 1, 0, 1};

        System.out.println(findMaxConsecutiveOnes(nums1)); // Output: 3
        System.out.println(findMaxConsecutiveOnes(nums2)); // Output: 2
    }
}
