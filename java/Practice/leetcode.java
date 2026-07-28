import java.util.Scanner;

public class leetcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = digits(n);
        if (ans % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    static int digits(int n) {
        int count = 0;
        while (n > 0) {

            n = n / 10;
            count++;

        }
        return count;

    }
}
