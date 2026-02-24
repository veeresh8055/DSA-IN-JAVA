package NumberSystem;
// sum of all odd number present bt 1 to 50
public class program7 {
    public static void main(String[] args) {
        int sum =0;
        for(int i =0;i<50;i++){
            if(i%2 != 0)
                sum += i;
        }
        System.out.println("The sum is " +sum);
    }
}

// output:
// The sum is 625