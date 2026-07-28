package NumberSystem;
// find the small number among 4 numbers 

public class program1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }
        System.out.println(min);
    }

}

// output
// 10
