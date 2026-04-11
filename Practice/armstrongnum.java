import java.util.Scanner;

public class armstrongnum {
    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //    System.out.println("Enter a number ");
    //     int n = sc.nextInt();
    //     boolean ans = armOrNot(n);
    //     System.out.println(ans);

     for (int i = 0; i < 1000; i++) {
            if (armOrNot(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean armOrNot(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;

        }
        // if (sum == original){
        // return true ;
        // }
        // return false;

        return sum == original;
    }
}
