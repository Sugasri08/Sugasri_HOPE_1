package DAY_7.VsCode;
class Parent {
    void display(){
        System.out.println("This is the parent class.");
    }
}
class Child extends Parent{ 
    void show(){
        System.out.println("This is the child class.");
    }
}
public class SimpleInheritance{
    public static void main(String[] args){
        // Child child=new Child();
        // child.show();   // Own method
        // child.display(); // Inherited method
        Parent parent=new Parent();
        parent.display(); // Parent class method
        //parent.show(); This will cause a compile-time error since 'show()' is not defined in Parent class
        Parent p=new Child();
        //p.show();  This will cause a compile-time error since 'show()' is not defined in Parent class
    } 
}
//parent class will get compiled before the child class, so the child class can access the methods of the parent class. 
//Eventhough we are not using the child class, it will get compiled and the parent class will be compiled first.