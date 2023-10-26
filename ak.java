//Q_12 .Write a java program by switch statement(weather forecast).
import java.util.Scanner;
public class ak{
    public static void main(String[] args){
        String a = "<|<|...HAR...HAR...MAHADEV...|>|>";
        System.out.println("" + a);

        Scanner myu = new Scanner(System.in);
        System.out.println("pls enter the condition \n 1 - Cloudy \n 2 - Rainy \n 3 - Thunder \n 4 -Sunny");
        int x =  myu.nextInt();

        switch(x){
            case 1: 
            System.out.println("Today's weather is sunny&cloudy");
            break;
            case 2:
            System.out.println("Today's weather is rainy");
            break;
            case 3:
            System.out.println("Today's weather is rainy and thunderstrome");
            break;
            case 4:
            System.out.println("Today's weather is sunny");
            break;
            case 5:
            System.out.println("Today's weather is clear");
            break;
            default :
            System.out.println("<|<|...HAR...HAR...MAHADEV..|>|>..");
        }
        
    }
}