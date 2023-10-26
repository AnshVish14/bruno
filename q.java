//Q .16. Q.16 . Print the star patterns: part - 2 ;
class q{
    public static void main(String[] args){
        String a = "<|<|...HAR..HAR..MAHADEV..|>|>";
        System.out.println("" + a);
        
    int r = 5;
    for(int i=1;i<=r;i++){
        for(int j=i;j<=r-i;j++){
            System.out.print("");
        }
        for(int k=1;k<=2*i-2;k++){
            System.out.print("*");
        }
     System.out.println();
    }
  }
}