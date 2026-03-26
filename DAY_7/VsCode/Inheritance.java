package DAY_7.VsCode;
class Animal{
    void display(){
        System.out.println("There are multiple animals choose 1 and mention it's sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.bark();
        System.out.println(d.hashCode());
    }
}
