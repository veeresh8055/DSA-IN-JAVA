public class  binarysearch {
    public static void main(String[] args) {

        int[] arr = { -21, -10, -2, -1, 0, 1, 20, 33, 44, 54, 59, 88, 91, 92, 99 };

        int target = -1;
        int index = findValue(arr, target);

        System.out.println("The target value is at index: " + index);
    }

    static int findValue(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid; // found
            }
        }
        return -1; // not found
    }
}
