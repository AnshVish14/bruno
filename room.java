class room{
    int lenght;
    int breadth;
{
   area = lenght * breadth;
    return area;
  }
}
class bedroom extends room{
    int height;
    int getVolume(){
    int Volume;
    Volume = lenght * breadth * height ;
    return Volume;
  }
  bedroom(int x, int y ,int z){
    super(x,y);
    height = z;
  }
}
class myu{
    public static void main(String[] args){

        room r1 = new room(20,30);
        room r2 = new room(20,30);
        bedroom b1 = new bedroom(20,30,40);
        bedroom b2 = new bedroom(20,30,50);
        
        int a = r1.getArea();
        System.out.println("the area is :" + a);

        int b = r2.getArea();
        System.out.println("the area is :" + b);

        int c = b1.getVolume();
        System.out.println("the volume is :" + c);

        int d = b2.getVolume();
        System.out.println("the volume is :" + d);
    }
}