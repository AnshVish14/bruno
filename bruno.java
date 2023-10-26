interface shape{
    double getArea();
    double getPerimeter();
}
class rectangle implements shape{
    double length;
    double breadth;
    rectangle(double l,double b)
    {
        length = l;
        breadth = b;
    }
    public double getArea(){
        return(length*breadth);
    }
    public double getPerimeter(){
        return 2*(length+breadth);
    }
}
class circle implements shape{
     double radius;

    public double getArea(){
        return(3.14*(radius*radius));
    }
    public double getPerimeter(){
        return(2*(3.14*radius));
    }
    circle(double r){
        radius = r;
    }
}
class triangle implements shape{
    private float aa,bb,cc;
    triangle(float aa,float bb,float cc){
        aa=aa;
        bb=bb;
        cc=cc;
    }
    public double getArea(){
        return 1/2*aa*bb;
    }
    public double getPerimeter(){
        return aa+bb+cc;
    }
}
public class bruno{
    public static void main(String[] args){
        rectangle rect = new rectangle(12,34);
        circle c = new circle(10);
        triangle tri = new triangle(3,5,4);
        String a = "<|<|..HAR...HAR...MAHADEV...|>|>";
        System.out.println(" \n\n" + a);
        System.out.printf(" 1..The area of rectangle is :" +  rect.getArea() + "The perimeter of rectangle is :\n\n" + rect.getPerimeter());
        System.out.printf("2..The area f circle is : " + c.getArea() + "The perimetre of circle is :\n\n" + c.getPerimeter());
        System.out.printf("3..Ther area of triangle is : " + tri.getArea() + "The Perimeter of rectangle is :\n\n" + tri.getPerimeter());
    }

}


