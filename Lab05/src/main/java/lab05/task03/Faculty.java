package lab05.task03;

public class Faculty extends Person{

    public String designation = "";

    public Faculty(String Name, String Add, Integer Age, String Designation){
        super(Name, Add, Age);
        this.designation = Designation;
    }

    @Override
    public String toString() {
        return name + ", " +address + ", " + age + ", " + designation;
    }
}
