public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int result = binarySearch(numbers, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
        System.out.println("Test Case 1 (target = 3): " + (binarySearch(numbers, 3) == 2 ? "Passed" : "Failed"));
        System.out.println("Test Case 2 (target = 11): " + (binarySearch(numbers, 11) == -1 ? "Passed" : "Failed"));
        System.out.println("Test Case 3 (target = 1): " + (binarySearch(numbers, 1) == 0 ? "Passed" : "Failed"));
    }
}