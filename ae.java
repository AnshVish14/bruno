//Q_6 . Print area of circle ,radius  given by the user using Scanner.
import java.util.Scanner;

public class ae{
    public static void main(String[] args){
        String a = "<|<|...HAR...HAR...MAHADEV...|>|>";
        System.out.println("" + a);
        Scanner myu = new Scanner(System.in);
        System.out.println("pls Enter the radius of the circle :");
        float radius = myu.nextFloat();
        double area = Math.PI * radius * radius ;
        System.out.println("The area of circle is  : " + area);
        
    }
}