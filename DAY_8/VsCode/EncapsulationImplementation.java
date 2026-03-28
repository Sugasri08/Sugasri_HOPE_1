package DAY_8.VsCode;
class Encapsulation{
    int a;
    Encapsulation(int a){
        this.a=a;
    }
    void display(){
        System.out.println("The value is "+a);
    }
}
public class EncapsulationImplementation {
    public static void main(String[] args) {
        Encapsulation e=new Encapsulation(10);
        e.display();
    }
}
