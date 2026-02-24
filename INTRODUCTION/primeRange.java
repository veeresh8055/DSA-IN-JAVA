public class primeRange {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        System.out.print(count);
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}

// output:
// 169
