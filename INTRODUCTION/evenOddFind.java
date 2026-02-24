public class evenOddFind {
    public static void main(String[] args) {
        int n = 60; 
        if(findEvenOdd(n)){
            System.out.println("The number is even ");
        }else{
            System.out.println("The Number is Odd");
        }

    }
   static boolean findEvenOdd(int n ){
      
      return (n & 1) == 0 ? true : false ;
   }
}

// output:
// The number is even 
