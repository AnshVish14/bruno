//Q_3 . Take tempreature from user in celsius and convert it to farhenhite.
import java.util.Scanner;

public class ac{
    public static void main(String[] args){    
         String a = "<|<|...HAR...HAR...MAHADEV...|>|>";
        System.out.println("" + a);


        Scanner myu = new Scanner(System.in);

        System.out.println("pls enter the tempreature in celsius :");
         int celsius = myu.nextInt();

        float farhenhite = (celsius * 9/5)+32;

        System.out.println("Tempreature in farhenhite :" + farhenhite );

        myu.close();
    }
}