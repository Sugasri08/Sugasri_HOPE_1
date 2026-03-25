package DAY_6.VsCode;

public class defaultConstructor {
     
    public static void main(String[] args) {
        System.out.println("I am on my way");
        dConstructor dc=new dConstructor(); //creating an object of the class defaultConstructor which will call the default constructor
        System.out.println(dc);
        System.out.println(dc.x);
    }
}
class dConstructor{
    public dConstructor(){ //default constructor
        System.out.println("I am inside the default constructor");
    }
    int x=10; //instance variable
    dConstructor(int x){ //parameterized constructor
        this.x=x; //this keyword is used to refer to the current object
    }
}

