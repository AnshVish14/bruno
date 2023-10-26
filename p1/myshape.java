package p1;
interface myshape{
    final static double pi=3.14;
}

   interface shape extends myshape{
    double getArea();
    double getPerimeter();
}
