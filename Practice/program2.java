import java.util.ArrayList;

public class program2 {
    public static void main(String[] args) {

        // two dimesonal list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        System.out.println(list);

        list.remove(0);
        System.out.println(list.hashCode());

    }
}
