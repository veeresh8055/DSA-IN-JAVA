// CRUD Operation in array 
package ArrayArrayList;

import java.util.Arrays;

public class program1 {

    public static void main(String[] arg) {
        // creating an array using array dimension
        // int[] arr1 = new int[5];

        // creating an array using array literals
        int[] arr = { 1, 2, 3, 4, 5 };

        // printing array
        System.out.println(arr);// [I@78047b92
        System.out.println(Arrays.toString(arr));// [1,2,3,4,5]

        // accessing
        System.out.println(arr[0]);// 1
        System.out.println(arr[2]);// 2

        // traversing using forLOOP
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // 1,2 ,3 ,4 ,5
        }

        // upadate values
        arr[1] = 200;
        System.out.println(arr[1]);// 200

        System.out.println(Arrays.toString(arr));// 1,200,3,4,5

        // accessing out of array
        // System.out.println(arr[6]);// ArrayIndexOutOfBounds

        // we cannot directly delete the array elements for that using ArrayList is best

        int index = 2;

        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        System.out.println("Original array before deleteing ");
        System.out.println(Arrays.toString(arr));

        System.out.println("New array after deleteing 3rd element ");
        System.out.println(Arrays.toString(newArr));

    }

}