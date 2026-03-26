package DAY_7.VsCode;
class College{
    void display(){
        System.out.println("There are multiple departments in the college");
    }
}
class Department extends College{
    void dept(){
        System.out.println("There are multiple sections in the department");
    }
}
class Section extends Department{
    void sec(){
        System.out.println("There are multiple students in the section");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Department s=new Section();
        s.display();
        s.dept();
        s.sec();
        System.out.println(s.hashCode());
    }
}
