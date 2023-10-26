class room{
  int length;
  int breadth;
  room(int x , int y){
    length = x;
    breadth = y;
  }
   int getArea(){
    return(length * breadth);
   }
}
class bedroom extends room{
  int height;
  
}
