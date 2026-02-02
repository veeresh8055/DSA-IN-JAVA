  class MaxElementArray {
    public static void main(String[] args) {
        // max element in an array
        int[] arr = { 99, 11, 3, 4, 35, 6, 7, 8, 9 };
        max(arr);
        maxRange(arr, 2, 7);
    }

    static void max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.print(max);
    }

    static void maxRange(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(max);
    }

}
