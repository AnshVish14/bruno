/*Declare a class room  containing length and breadth as its varaibles  and methods  and get_area ,gat_data and get_perimeters. */
//Create 4 objects of the room class initialize instance varaibles using get_data method and find area and perimeters of all the four  rooms.

class room{
    int length;
    int breadth;
    room (int x , int y)
    {
        length=x;
        breadth=y;
    }
    int getArea()
    {
    return( x * y);
   }
}
    
class yoo{
    public static void main(String[] args){
    
    room r1 = new room(21,34);
    room r2 = new room(24,35);
    room r3 = new room(20,34);
    room r4 = new room(25,45);
    
    int a = r1.getArea();
    System.out.println("the data is " + a);

    int b = r2.getArea();
    System.out.println("the data is " + b);

    int c = r3.getArea();
    System.out.println("the data is " + c);

    int d = r4.getArea();
    System.out.println("the data is " + d);

    System.out.println("THe area of  r1 and r2 is : " + a  + "is" + b);
    System.out.print("HAR HAR MAHADEV");

}
}
