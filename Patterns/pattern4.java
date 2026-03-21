public class pattern4 {
    public static void main(String[] args) {
        int n = 4;
        int sp = (n*2)-3;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int k = 1; k <= sp; k++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                if (i == n && j == n) {

                    System.out.print("");
                } else {

                    System.out.print("* ");
                }

            }
            sp -= 2;
            System.out.println();

        }
    }
}
