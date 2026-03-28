package DAY_8.VsCode;

public class Overloading {
    static void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }
    static void add(double a,double b) {
        System.out.println("Sum of two doubles: "+(a+b));
    }
    static void add(int a,int b,int c){
        System.out.println("Sum of three integers: " + (a + b + c));
    }
    public static void main(String[] args) {
        System.out.println("Method overloading example:");
        add(5, 10);
        add(5.5, 10.5);
        add(5, 10, 15);
    }
}
