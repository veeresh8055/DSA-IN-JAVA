import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();

        boolean ans = findPrime(n);
        System.out.println("The given number " + ans + " prime number ");

       

    }

    static boolean findPrime(int n) {

        int c = 2;
        if (n % 2 == 0) {
            return false;
        }

        while (c <= n / 2) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
