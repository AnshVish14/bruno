class myanimal{
    void eat(){
        System.out.println("eating..");
    }
}
class dog extends myanimal{
    void eat(){
        System.out.println("eating pedigreeee..");
    }
}
class lion extends  myanimal{
    void eat(){
        System.out.println("eating flesh");
    }
}
public class animal{
    public static void main(String[] args){
        myanimal d1,l1,a1;
        d1=new dog();
        l1=new lion();
        a1=new myanimal();
        String a = "<|<|...HAR...HAR...MAHADEV...|>|>";
        System.out.println(" " + a);
        d1.eat();
        l1.eat();
        a1.eat();
    }
}