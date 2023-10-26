//Q_7 . Find the output of  x+=x++*x++*x++; .
import java.util.Scanner;

public class af{
    public static void main(String[] args){
        String a = "<|<|...HAR...HAR...MAHADEV...|>|>";
        System.out.println("" + a);
        Scanner myu = new Scanner(System.in);
        System.out.println("pls enter the number :");
        int x =  myu.nextInt();
        x += x++*x++ *x++;
        System.out.printf("THE output is %d :" , x );
    }

}