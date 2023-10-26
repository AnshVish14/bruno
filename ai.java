// Q_10 .Take a number as input from the user and find its sqrt,abs,ceil,floor,log (math function).
import java.util.Scanner;

public class ai{
    public static void main(String[] args){
        String a = "<|<|...HAR...HAR...MAHADEV...|>|>";
        System.out.println("" + a);
        Scanner myu = new Scanner(System.in);
        System.out.println("pls enter the number :");

        int x = myu.nextInt();
        System.out.println("The sqrt of the given value is :" + Math.sqrt(x));
        System.out.println("The absolute value of the given value is :" + Math.abs(x));
        System.out.println("The ceil value of the given number is :" + Math.ceil(x));
        System.out.println("The floor value of the given number is :" + Math.floor(x));
        System.out.println("The logrithem value of the given number is :" + Math.log(x));
        
    }
}