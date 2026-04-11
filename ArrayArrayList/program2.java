package ArrayArrayList;

import java.util.Arrays;

public class program2 {

    public static void main(String[] arg) {

        // Array using ArrayDimension
        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        for(int elem:(arr)){
            System.out.println(elem);
        }
        System.out.println(Arrays.toString(arr));

    }
}
