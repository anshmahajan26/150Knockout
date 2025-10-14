public class SecondLargest {
    public static int secondLargest(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            System.out.println("Array must have at least 2 elements");
            return -1;
        }
        // Step 1: Find largest
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // Step 2: Find element smaller than max but largest among rest
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        return (secondMax == Integer.MIN_VALUE) ? -1 : secondMax; 
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};
        System.out.println("Second Largest: " + secondLargest(arr)); // 45
    }
}
