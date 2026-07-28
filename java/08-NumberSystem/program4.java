package NumberSystem;

// find using switch even or odd
public class program4 {
    public static void main(String[] args) {
        int a = 20;

        switch (a % 2) {
            case 0:
                System.out.println("Even ");

                break;
            case 1:
                System.out.println("Odd ");

                break;

            default:
                break;
        }
    }
}

// output:
// Even