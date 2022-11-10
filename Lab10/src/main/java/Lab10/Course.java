package Lab10;

public class Course {
    private String CourseCode;
    private String CourseName;
    private Float Credit;
    private Type type;

    public Course(String code, String name, Float credit, Type type1){
        this.CourseCode = code;
        this.CourseName = name;
        this.Credit = credit;
        this.type = type1;
    }
}
