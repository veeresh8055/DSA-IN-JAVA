package ArrayArrayList;

import java.util.ArrayList;

public class program3 {
    // important methods in ArrayList
    // list.add(10); // add element
    // list.remove(0); // remove by index
    // list.get(0); // access element
    // list.set(0,50); // update
    // list.size(); // size
    public static void main(String[] arg) {
        // ArrayList
        // Collection framework
        ArrayList<Integer> arr = new ArrayList<>();
        // methods
        // Adding elements to the arrayList
        arr.add(1);
        arr.add(2);
        arr.add(3);

        // update elements
        arr.set(1, 200);// [1, 200, 3]

        System.out.println(arr);// [1, 200, 3]

        // remove
        arr.remove(1);

        // get element
        arr.get(0);

        System.out.println(arr.size());// size of the list 2
        // here arrayList internally call arr.toString() method thats why we get an
        // object not an object reference
        System.out.println(arr);// [1,3]
    }
}
