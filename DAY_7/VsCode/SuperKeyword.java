package DAY_7.VsCode;
class SuperExample1{
    int marks=100;
    SuperExample1(){
        System.out.println("Called in SuperExample1 by super keyword");
    }
}
class SuperExample2 extends SuperExample1{
    int maxMarks=200; 
    SuperExample2(){
        System.out.println("Called in SuperExample2 marks: " + super.marks);
    }
}
public class SuperKeyword {
    public static void main(String[] args) { 
        SuperExample2 se1=new SuperExample2();
         
    }
}
