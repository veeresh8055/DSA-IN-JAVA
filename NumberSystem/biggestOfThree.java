package NumberSystem;

// program to find the biggest of three numbers a , b & c 
public class biggestOfThree {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println(max);
    }
}

// output:
// 30