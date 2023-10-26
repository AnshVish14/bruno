class room{
        int length;
        int breadth;
        room(int x , int y)
        {
            lenght = x ;
            breadth = y;
        }
        int getData(){
        return (length*breadth);
        }
    }
class bedroom extends room{
    int height;
    int getVolume()
    {
    int vol ;
    vol = lenght * breadth * height ;
    return vol;
    }
    bedroom(int x,int y,int z)
    {
        super(x,y);
        height =z;
    }
}
class myclass{
    public static void main(String[] args){
    room r1 = new room(20,30);

    room  r2 = new room (20,50);
    bedroom s1 = new bedroom(10,20,30);
    bedroom s2 = new bedroom(10,20,30);
   
    int a = r1.getData();
    System.out.println("Area of room_1 is " + a);   
    int b = r2.getData();
    System.out.println("area of room_2 is " + b);

    int c = s1.getVolume();
    System.out.println("the volume of bedroomm s1 is "+c);  
    int d = s2.getVolume();    System.out.println("The volume of bedroom  s2 is"+d);
    
}
}
