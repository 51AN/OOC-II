package Lab10;
import java.util.*;

@DevelopmentHistory(developer = "Sian Ashsad")
public class Faculty {
    public String name;
    public String designation;
    public int salary;

    public ArrayList<Course> courses;


    @DevelopmentHistoryWithReviewer(DevelopmentHistory = @DevelopmentHistory(developer = "Sian Ashsad"))
    public Faculty(String Name, String Designation, int Salary, ArrayList<Course> Courses)
    {
        this.name = Name;
        this.designation = Designation;
        this.salary = Salary;
        this.courses = Courses;
    }


    @DevelopmentHistoryWithReviewer(DevelopmentHistory = @DevelopmentHistory(developer = "Sian Ashsad"))
    public Faculty(String Name, String Designation, int Salary)
    {
        this.name = Name;
        this.designation = Designation;
        this.salary = Salary;
    }


    @DevelopmentHistoryWithReviewer(DevelopmentHistory = @DevelopmentHistory(developer = "Sian Ashsad"), reveiwers = {"Jubair","Faisal"})
    public void teach(Course course)
    {
        System.out.println("The course being taught now is "+course.CourseName+".\n");
    }


    @DevelopmentHistoryWithReviewer(DevelopmentHistory = @DevelopmentHistory(developer = "Sian Ashsad"))
    public void research(String topic)
    {
        System.out.println("Topic of research : " + topic+".\n");
    }
}
