import java.util.*;
import java.awt.*;

class Bt extends Frame{
Button red,blue,green ;
Button(){
    red = new BUtton("red");
    blue = new Button("blue");
    green = new Button("green");
    
    setLayout(new FlowLayout());
    
    add(red);
    add(blue);
    add(green);
  }
  public static void main(String[] args){
 
    Button A = new BUtton();
    A.setTitle("Button");
    A.setSize(300,400);
    A.setVisible(true);

  } 

}