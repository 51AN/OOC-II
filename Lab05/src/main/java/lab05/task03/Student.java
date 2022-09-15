package lab05.task03;

public class Student extends Person{
    public int studentID;

    public Student(String Name, String Add, Integer Age, Integer StuID){
        super(Name, Add, Age);
        this.studentID = StuID;
    }

    @Override
    public String toString() {
        return name + ", " +address + ", " + age + ", " + studentID;
    }
}
