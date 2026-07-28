public class program6 {
    public static void main(String[] args) {
        // Grade Calculator

        int marks = 65;

        if (marks >= 90 && marks <= 100) {
            System.out.println("A grade");
        } else if (marks >= 75 && marks <= 89) {
            System.out.println("B grade ");
        } else if (marks <= 74 && marks >= 60) {
            System.out.println("C grade ");
        } else {
            System.out.println(" Not Applicable");
        }

    }
}

// output
// C grade 