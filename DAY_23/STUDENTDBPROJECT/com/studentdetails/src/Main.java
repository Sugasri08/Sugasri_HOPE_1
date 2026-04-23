import java.sql.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws SQLException {
        StudentDAO dao=new StudentDAO();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Name:");
        String name=sc.nextLine();
        System.out.println("Enter Student Marks:");
        int marks=sc.nextInt();
        dao.addStudent(new Student(0,name,marks));
        List<Student> students=dao.getAllStudents();
        dao.updateStudent(1, 95);
        dao.deleteStudent(3);
        students=dao.getAllStudents();
        for(Student s:students){
            System.out.printf("ID: %d Name: %s Marks: %d%n", s.getID(), s.getName(), s.getMarks());
        }
    }
}
