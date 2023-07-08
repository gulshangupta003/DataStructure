package sortAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4,3, 2, 1, 5, 6, 7, 11, 4, 33, 23, 5};

        System.out.println("Array before sorting:");
        System.out.print("[ ");
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.println("]");

        insertionSort(arr);

        System.out.println("Array after sorting:");
        System.out.print("[ ");
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.println("]");
    }
}
