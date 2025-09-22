import java.util.HashMap;
public class Solution {
    public static boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();;
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true; // found duplicate
            }
            map.put(num, 1); // mark number as seen
        };
        return false; // no duplicates
    };
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 2};
        System.out.println(hasDuplicate(nums)); // true
    }
}
