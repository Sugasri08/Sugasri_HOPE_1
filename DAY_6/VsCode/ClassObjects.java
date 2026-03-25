package DAY_6.VsCode;
public class ClassObjects{
    public static void main(String[] args){
        System.out.println("I am inside class objects"); //static refers to the class object
        Apartment ap=new Apartment(); //creating an object of the class apartment
        ap.display();//calling the method display of the class apartment using the object ap
    }
}
class Apartment{
    public void display(){
        System.out.println("I am inside apartment class");
    }
}
