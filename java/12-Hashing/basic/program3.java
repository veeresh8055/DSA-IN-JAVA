
import java.util.*;

public class program3 {

    // Find common elements.
    public static void main(String[] arg) {

        int[] num1 = { 1, 2, 2, 1 };
        int[] num2 = { 1, 2 };

        // return the common elements in num1 and num2
        ArrayList<Integer> communElement = checkCommon(num1, num2);

        System.out.println((communElement));

    }

    public static ArrayList<Integer> checkCommon(int[] num1, int[] num2) {

        HashSet<Integer> set = new HashSet<>();

        // common elements store
        ArrayList<Integer> commonElements = new ArrayList<>();

        for (int i : num1) {
            set.add(i);
        }

        for (int i : num2) {
            if (set.contains(i)) {
                if (!commonElements.contains(i))
                    commonElements.add(i);

            }
        }

        return commonElements;
    }
}
