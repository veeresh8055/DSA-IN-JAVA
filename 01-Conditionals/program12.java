public class program12 {
    public static void main(String[] args) {
        //  Salary Tax Calculator (Slab + Edge Cases)
        int salary = 2500000;
        int tax = 0;
        if (salary <= 250000) {
            System.out.println("No Tax");
        } else if (salary <= 500000 ) {
            tax = (salary * 5) / 100;
            System.out.println(tax);
        } else if (salary <= 1000000) {
            tax = (salary * 20) / 100;
            System.out.println(tax);
        } else {
            tax = (salary * 30) / 100;
            System.out.println(tax);
        }
    }
}
