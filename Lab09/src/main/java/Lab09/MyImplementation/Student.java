package Lab09.MyImplementation;

public class Student {


    public Student(String id, String name, float CGPA, Program program1){
        this.ID = id;
        this.name = name;
        this.CGPA = CGPA;
        this.program = program1;
    }
    public String ID = "";
    public String name = "";
    public enum Program{
        CSE, SWE, IT
    }

    public Program program;
    public float CGPA;

    public void setID(String id)throws InvalidStudentIDException {

        if(id.length() != 9){
            throw new InvalidStudentIDException("ID format is incorrect, Length should be 9");
        }
        else {
            this.ID = id;
        }
    }


    public void Study(){
        System.out.println(name + " is currently studying");
    }
    public void Play(){
        System.out.println(name + " is currently playing");
    }

    public String print(){
        String str = "";
        str = ID + " " + " " + name + " " + CGPA + " " + program.toString();
        return str;
    }

}
