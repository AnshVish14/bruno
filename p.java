//Q.16 . Print the star patterns: part - 1 ;
class p{
      public static void main(String args[]){
        String a = "<|<|...HAR..HAR..MAHADEV..|>|>";
        System.out.println("" + a);
        for(int i=1;i<=4;i++){
            for(int k=5;k<=2-i;k++){
                System.out.print("");
            }
            for(int j=1; j<=i*2-1;j++){
               System.out.print("*");
        }
        System.out.println();
      }
    }
  }