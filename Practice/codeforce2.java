import java.util.Scanner;

public class codeforce2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of words

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int length = str.length();

            if (length > 10) {
                char firstletter = str.charAt(0);
                char lastletter = str.charAt(length - 1);
                int middlecount = length - 2;

                System.out.println(firstletter + "" + middlecount + "" + lastletter);
            } else {
                System.out.println(str);
            }
        }
    }
}
