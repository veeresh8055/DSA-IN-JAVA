public class program8 {
    public static void main(String[] args) {
        // Given three sides a, b, c, check whether a triangle can be formed.
        // Condition:
        // Sum of any two sides must be greater than the third

        int a = 1;
        int b = 1;
        int c = 2;

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Yes");
        } else {
            System.out.println("Not possible");
        }

    }
}
