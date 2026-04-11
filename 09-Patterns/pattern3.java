class pattern3
{
    public static void main(String[] args){
        for(int i =1;i<=4 ;i++){
            for(int j =1;j<=i;j++){
                System.out.print("* ");
            }
         System.out.println();
        }
        int sp = 3,st=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=st;k++){
                System.out.print("* ");
            }
            zz++;
            st--;
        }

    }
}