public class scelingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 10, 12, 15, 19 };
        int target = 16;
        int ans = celingNum(arr, target);
        System.out.println(ans);
    }

    static int celingNum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;

            } else {
                return arr[mid];
            }
        }

        return arr[start];
    }
}
