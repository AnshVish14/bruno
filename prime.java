import java.util.Scanner;
class prime{
    public static void main(String[] args){
    
        System.out.println("pls enter the number :");
        Scanner myu = new Scanner(System.in);
        int a = myu.nextInt();
        int x;
        if(num%a==0){
            System.out.println("the number is prime :..");
        }
        else{
            System.out.println("the number is not prime :..");
        }
    
    }
}