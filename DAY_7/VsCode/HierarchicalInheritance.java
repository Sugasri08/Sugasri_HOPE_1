package DAY_7.VsCode;

class Father{
    void display(){
        System.out.println("This is the father, I have a son and a Daughter");
    }
}
class Son extends Father{
    void job(){
        System.out.println(
            "Since I already have a job give the business to the sister"
        );
    }
}
class Daughter extends Father{
    void notAccepting(){
        System.out.println("I already have a business so give this to bro as his job is temporary");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Daughter d=new Daughter();
        d.display();
        Son s=new Son();
        s.job();
        d.notAccepting();
    }
}
