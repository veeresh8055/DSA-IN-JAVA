import java.util.Scanner;
public class codeforce5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int area = m * n ;
        int dominoArea = 2 * 1 ;

        int output = area / dominoArea;

        System.out.println(output);
        sc.close();
    }
}
