//Q_9 . Take input of two numbers,says x and y, from user and find max and min , x raise to power y using Math function.
import java.util.Scanner;

public class ah{
    public static void main(String[] args){
        String a = "<|<|...HAR...HAR...MAHADEV...|>|>";
        System.out.println("" + a);

        Scanner myu = new Scanner(System.in);

        System.out.println("pls enter the number of x :");
        double x = myu.nextDouble();

        Scanner myo = new Scanner(System.in);

        System.out.println("pls enter the number of y :");
        double y = myo.nextDouble();

        double max=Math.max(x,y);
        double min=Math.min(x,y);

        double power = Math.pow(x,y);

        System.out.println("MAX value of x :" + max);
        System.out.println("MIN value of y :" + min);
        System.out.println(x + " raised to power" + y + "is" + power);
    }
} 