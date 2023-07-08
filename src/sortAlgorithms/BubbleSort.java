package sortAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int swapCount = 0;
        int passCount = 0;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    swapCount++;
                }
            }

            if (!swapped)
                break;

            passCount++;
        }

        System.out.println("Total number of passes: " + passCount);
        System.out.println("Total number of swaps: " + swapCount);
    }

    public static void main(String[] args) {
        int[] arr = {16, 14, 5, 6, 8};

        System.out.println("Array before sorting:");
        System.out.print("[ ");
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.print("]");
        System.out.println();

        bubbleSort(arr);

        System.out.println("Array after sorting:");
        System.out.print("[ ");
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.print("]");
        System.out.println();
    }
}
