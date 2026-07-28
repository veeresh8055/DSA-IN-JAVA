public class program10 {
    public static void main(String[] args) {
        int x = 5, y = 10, z = 15;
        if (x < y) {
            if (y < z) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        } else {
            System.out.println("C");
        }
    }
}

//output
// A