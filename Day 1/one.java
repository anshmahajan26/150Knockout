public class one {
    public static boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,2,5,2,2,6};
        System.out.println(hasDuplicate(nums));
    }
}