import java.util.HashSet;

public class program2 {

    // Count unique elements in an array.
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 9, 10 };

        int count = countUniqueElements(arr);

        System.out.println(count);
    }

    public static int countUniqueElements(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        // set contain unique value
        for (int i : arr) {
            set.add(i);
        }

        // return the size of set
        return set.size();
    }

}
