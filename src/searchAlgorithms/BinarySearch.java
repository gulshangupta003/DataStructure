package searchAlgorithms;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 11, 23, 45, 112, 134, 333, 435};
        int target = 45;
        int result = binarySearch(arr, target);
        if (result == -1)
            System.out.println("Target element not found");
        else System.out.println("Target element found at index: " + result);
    }
}
