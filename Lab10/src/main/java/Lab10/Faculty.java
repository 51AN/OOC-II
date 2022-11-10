package Lab10;
import java.util.*;

public class Faculty {
    public String name;
    public String designation;
    public int salary;

    public ArrayList<Course> courses;

    
    public Faculty(String Name, String Designation, int Salary, ArrayList<Course> Courses)
    {
        this.name = Name;
        this.designation = Designation;
        this.salary = Salary;
        this.courses = Courses;
    }

}
