import java.util.Arrays;

public class RemoveDuplicate {
    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int j = 0; // pointer for next unique element

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        return j + 1; // length of array with unique elements
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};

        int newLength = removeDuplicates(arr);

        System.out.println("Length of unique array: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
