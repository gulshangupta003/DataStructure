package sortAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum value in the unsorted portion of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }

            if (minIndex != i) {
                // Swap the minimum value with the first unsorted element
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 5, 6, 7, 11, 4, 33, 23, 5};

        System.out.println("Array before sorting:");
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.println();

        selectionSort(arr);

        System.out.println("Array after sorting:");
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    }
}