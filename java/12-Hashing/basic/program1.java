// checks the duplicate 

import java.util.*;

public class program1 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };

        if (checkDuplicate(arr))
            System.out.println("contains duplicate");
        else
            System.out.println("no duplicate");

    }

    public static boolean checkDuplicate(int[] arr) {

        // create a HashSet to store only uniques elements 
        HashSet<Integer> set = new HashSet<>();


        // iterate through all array elements add if the element not contains in set 
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            }

            set.add(arr[i]);
        }

        // if no duplicate return false; 
        return false;
    }

}