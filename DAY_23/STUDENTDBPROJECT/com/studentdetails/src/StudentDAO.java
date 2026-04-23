import java.sql.*;
import java.util.*;
public class StudentDAO {
    public void addStudent(Student s)throws SQLException{
        String query="INSERT INTO student_details (name,marks) VALUES (?,?)";
        try{
            Connection connection=DBConnection.getConnection();
            PreparedStatement ps=connection.prepareStatement(query);
            
            ps.setString(1,s.getName());
            ps.setInt(2,s.getMarks());
            ps.executeUpdate();
            connection.close();
            System.out.println("Student Added Successfully");

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public List<Student> getAllStudents()throws SQLException{
        List<Student> students=new ArrayList<>();
        String query="SELECT * FROM student_details";
        try{
            Connection connection=DBConnection.getConnection();
            PreparedStatement stmt=connection.prepareStatement(query);
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                int id=rs.getInt("ID");
                String name=rs.getString("name");
                int marks=rs.getInt("marks");
                students.add(new Student(id,name,marks));
            }
            connection.close();
        }
        catch(Exception e){
            e.printStackTrace();

        }
        return students;
    }
    public void updateStudent(int id,int  newMarks)throws SQLException{
        String query="UPDATE student_details SET marks=? WHERE ID=?";
        try{
            Connection connection=DBConnection.getConnection();
            PreparedStatement stmt=connection.prepareStatement(query);
            stmt.setInt(1,newMarks);
            stmt.setInt(2,id);
            stmt.executeUpdate();
            connection.close();
            System.out.println("Student Marks Updated Successfully");
        }
        catch(Exception e){
            e.printStackTrace();

        }
        
    }
    public void deleteStudent(int id)throws SQLException{
        String query="DELETE FROM student_details WHERE ID=?";
        try{
            Connection connection=DBConnection.getConnection();
            PreparedStatement stmt=connection.prepareStatement(query);
            stmt.setInt(1,id);
            stmt.executeUpdate();
            connection.close();
            System.out.println("Student Deleted Successfully");
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}
