import java.util.*;

public class Five {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequency
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        // Step 2: Put map entries into a list
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freqMap.entrySet());
        // Step 3: Sort by frequency (descending)
        list.sort((a, b) -> b.getValue() - a.getValue());
        // Step 4: Pick top k elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(sol.topKFrequent(nums, k))); // [1, 2]
    }
}
