import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void countingSort(int[] arr) {
        int n = arr.length;

        // Step 1: Find the maximum value in the array
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 2: Create and fill the count array
        int[] count = new int[max + 1]; // default all 0
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Step 3: Rebuild the array using the count array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }
}

