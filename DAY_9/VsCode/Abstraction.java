package DAY_9.VsCode;

abstract class Animal{
    abstract void eat();
    void sound(){
        System.out.println("Animal makes a sound");
    }
    
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating");
    }
}
class Cat extends Dog{
    void eat(){
        System.out.println("Cat is eating");
        super.eat();
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Animal a=new Cat();
    
        a.eat();
    }
}
