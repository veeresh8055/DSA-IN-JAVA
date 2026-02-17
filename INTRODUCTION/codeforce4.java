import java.util.Scanner;

class codeforce4 {
    public static void main(String[] args) {

        int x = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.next();

            if (str[i].contains("-")) {
                x--;
            } else {
                x++;
            }
        }
        System.out.println(x);
        sc.close();

    }
}