import java.util.Arrays;

public class LeftRotatebyOne {
    public static void leftRotateByOne(int[] arr) {
        int n = arr.length;
        if (n == 0) return;

        int first = arr[0]; // store first element

        // Shift elements left by one
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = first; // put first element at last
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        leftRotateByOne(arr);

        System.out.println("Array after left rotation: " + Arrays.toString(arr));
        // Output: [2, 3, 4, 5, 1]
    }
}
