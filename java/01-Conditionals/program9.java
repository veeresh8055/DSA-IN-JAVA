public class program9 {
    public static void main(String[] args) {

        int unit = 800;
        int bill = 0;

        if (unit <= 100) {
            bill = unit * 1;
        } else if (unit <= 200) {
            bill = (100 * 1) + (unit - 100) * 2;
        } else {
            bill = (100 * 1) + (100 * 2) + (unit - 200) * 5;
        }

        System.out.println(bill + " rupees");
    }
}

// output : 
// 3300 rupees