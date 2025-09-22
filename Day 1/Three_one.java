//using hashmap
import java.util.*;
public class Solution {
    public static boolean hasPairWithSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                return true; // Found pair
            }
            map.put(num, 1); // store the number
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(hasPairWithSum(nums, target)); // true (2+7=9)
    }
}
