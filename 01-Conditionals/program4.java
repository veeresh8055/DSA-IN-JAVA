public class program4 {
    public static void main(String[] args) {

        // Given three integers a, b, c, find the largest

        int a = 100;
        int b = 20;
        int c = 30;

        if (a > b && a > c) {
            System.out.println(" a is greater ");
        } else if (b > c && b > a) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }

    }
}
// output
// a is greater