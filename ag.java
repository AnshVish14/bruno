//Q_8 . Find the output of y=y*y++; 
import java.util.Scanner;

public class ag{
    public static void main(String[] args){
      String a = "<|<|...HAR...HAR...MAHADEV...|>|>";
      System.out.println("" + a);
    Scanner myu = new Scanner(System.in);
    System.out.println("Pls enter the number :");
    int y = myu.nextInt();
    y=y*y++;
    System.out.println("The Output is :" + y);
  }
}