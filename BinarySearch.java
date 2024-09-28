public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid + 1; // return the position (1-indexed)
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;

        int position = binarySearch(arr, target);

        if (position != -1) {
            System.out.println("Target found at position " + position);
        } else {
            System.out.println("Target not found");
        }
    }
}