public class aignostedSearch {
    public static void main(String[] args) {
        int[] arr = { -21, -20, 1, 3, 5, 9, 10, 21, 22 };
        int[] arr2 = {21,20,19,16,11,9,2,1,-1,0,-21};
        int target = 19;
        int target2 = 19;
        int index = search(arr, target);
        int index2 = search(arr2, target2);
        System.out.println("the index of ascending order array : "+index);
        System.out.println("the index of descending order array : "+index2);
    }

    static int search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAscend = (arr[start] < arr[end]);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isAscend) {
                if (target > arr[mid]) {
                    start = mid + 1;

                } else if (target < arr[mid]) {
                    end = mid - 1;

                } else {
                    return mid;
                }

            } else {
                if (target < arr[mid]) {
                    start = mid + 1;

                } else if (target > arr[mid]) {
                    end = mid + 1;

                } else {
                    return mid;
                }

            }

        }

        return -1;
    }
}
