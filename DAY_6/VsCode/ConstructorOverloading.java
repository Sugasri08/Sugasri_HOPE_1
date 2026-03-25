package DAY_6.VsCode;
//Run Time  Polymorphism
public class ConstructorOverloading {
    public static void main(String[] args){
        System.out.println("Constructor Overloading Examples");
        crOverloading cr=new crOverloading(5);
        crOverloading cr1=new crOverloading("Hope Batch 1");
    }
}
class crOverloading{
    crOverloading(){
        System.out.println("constructor with no parameter");
    }
    crOverloading(int x){
        System.out.println("Constructor with integer parameter"+x) ;
    }
    crOverloading(String s){
        System.out.println("Constructor with string "+s);
    }
}
