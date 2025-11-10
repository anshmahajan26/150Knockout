import java.util.*;
public class Solution {
    public static List<Integer> findUnion(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        List<Integer> union = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            // Skip duplicates in nums1
            if (i > 0 && nums1[i] == nums1[i - 1]) {
                i++;
                continue;
            }
            // Skip duplicates in nums2
            if (j > 0 && nums2[j] == nums2[j - 1]) {
                j++;
                continue;
            }

            if (nums1[i] < nums2[j]) {
                union.add(nums1[i]);
                i++;
            } else if (nums1[i] > nums2[j]) {
                union.add(nums2[j]);
                j++;
            } else {
                // Equal elements → add once
                union.add(nums1[i]);
                i++;
                j++;
            }
        }
        // Add remaining elements (if any)
        while (i < nums1.length) {
            if (i == 0 || nums1[i] != nums1[i - 1])
                union.add(nums1[i]);
            i++;
        }
        while (j < nums2.length) {
            if (j == 0 || nums2[j] != nums2[j - 1])
                union.add(nums2[j]);
            j++;
        }
        return union;
    }
    public static void main(String[] args) {
        int[] nums1 = {3, 4, 6, 7, 9, 9};
        int[] nums2 = {1, 5, 7, 8, 8};
        System.out.println(findUnion(nums1, nums2));
    }
}
