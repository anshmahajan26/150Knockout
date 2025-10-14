import java.util.Arrays;
public class MoveZeroEnd {
    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int j = 0; // next position for non-zero
        // Step 1: Move non-zero elements forward
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        // Step 2: Fill remaining positions with zeros
        for (int i = j; i < n; i++) {
            arr[i] = 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr)); // [1, 3, 12, 0, 0]
    }
}
