//Q_5 .Find wheather the given number is even or odd using Scanner.
import java.util.Scanner;

public class ad{
    public static void main(String[] args){
        String a = "<|<|...HAR...HAR...MAHADEV...|>|>";
        System.out.println("" + a);
        Scanner myu = new Scanner(System.in);
       
        System.out.println("Pls enter the value in numbers :");
        int Value = myu.nextInt();

        if (Value%2==0){
            System.out.println("the value is even ..");
}else{
    System.out.println("The value is odd.");
}
   myu.close();
 }
}