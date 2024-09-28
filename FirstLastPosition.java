public class FirstLastPosition {

        public static int[] searchRange(int[] nums, int target) {
            int[] result = new int[2];
            result[0] = findFirst(nums, target);
            result[1] = findLast(nums, target);
            return result;
        }
        private static int findFirst(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            int mid;

            while (left <= right) {
                mid = (left + right) / 2;
                if (nums[mid] < target) {
                    left = mid + 1;

                } else {
                    right = mid - 1;
                }
            }
            if (left < nums.length && nums[left] == target) {
                return left;
            } else {
                return -1;
            }
        }
        private static int findLast(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            int mid;

            while (left <= right) {
                mid = (left + right) / 2;

                if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (right >= 0 && nums[right] == target) {
                return right;
            } else {
                return -1;
            }
        }
        public static void main(String[] args) {
            int[] nums = {5, 7, 7, 8, 8, 10};
            int target = 8;

            int[] result = searchRange(nums , target);
            System.out.println("[" + result[0] + "," + result[1] + "]");
        }
}
