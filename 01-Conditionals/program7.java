public class program7 {
    public static void main(String[] args) {
        // Given a character ch, determine whether it is:
        // Uppercase letter
        // Lowercase letter
        // Digit
        // Special character

        char ch = '6';

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        } else if (ch <= 'a' && ch >= 'z') {
            System.out.println("Lower Case");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }

    }
}
// output
// Digit
