public class armstrong {
    public static void main(String[] args) {
        // approach
        // first take n
        // find number of digits present in n
        // find the every digit poweof digits present in a number
        // if original is equal to sum of that number then it is a armstrong number

        int n = 93084;
        if (isArmstrong(n)) {
            System.out.println(n + " is a Armstrong number ");
        } else {
            System.out.println(n + " is a Armstrong number ");

        }
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int digits = countDigit(n);
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + power(digit, digits);
            n = n / 10;
        }

        return sum == original;

    }

    static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }

        return count;
    }

    static int power(int a, int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= a;
        }
        return product;
    }
}

// output :
// 93084 is a Armstrong number