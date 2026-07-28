public class program11 {
    public static void main(String[] args) {
        // 1️⃣ Admission Eligibility (Nested + AND/OR)
        int age = 20;
        int maths = 66;
        int science = 61;

        if (age >= 18) {
            if (maths >= 60 || science >= 65) {

                System.out.println("Eligible");
            } else {
                System.out.println("Not Eligible");
            }
        } else {
            System.out.println("Not Eligible");
        }
    }
}

// output
// Eligible
