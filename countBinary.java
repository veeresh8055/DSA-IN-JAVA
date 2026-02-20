public class countBinary {

    // finding the lastmost bit of a number 
    static int binaryCount(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            System.out.println(n & 1);
            n = n >> 1;

        }
        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(binaryCount(n));
    }
}
