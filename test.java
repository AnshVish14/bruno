class cycle{
    int gear;
    int speed;

cycle(int gear , int speed)
{   gear = gear;
    speed = speed;
}
 void applybreak(int decriment)
{
    speed -= decriment;
}
void speedup(int incriment)
{
    speed += incriment;
}
}
class mountainbike extends cycle{
    int seatheight;
    mountainbike(int gear, int speed , int seatheight){
        super(gear,speed);
        seatheight = seatheight;
    }
    void seatheight(int newValue){
        seatheight = seatheight;
    }
}
class test{
    public static void main(String[] args){
    mountainbike b = new b();
    System.out.println("the value is " + b);
      
    }
}


