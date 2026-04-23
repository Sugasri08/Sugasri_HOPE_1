public class Student {
    private  int  ID;
    private String name;
    private int marks;
    // Constructor
    public Student(int ID,String name,int marks){
        this.ID=ID;
        this.name=name;
        this.marks=marks;
    }
    //getter
    public int getID(){
        return ID;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
    //setter
    public void setID(int ID){
        this.ID=ID;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
}
