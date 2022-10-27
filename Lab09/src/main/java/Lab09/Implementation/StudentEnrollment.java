package Lab09.Implementation;
import java.util.*;

public class StudentEnrollment {

    List<Student> students = new ArrayList<>();


    public void Remove(String id){
        for(Student student : students)
        {
            if(student.ID == id){
                students.remove(student);
            }
        }
    }

    public Student get(String id){
        for(Student student : students)
        {
            if(student.ID == id){
                return student;
            }
        }

        return null;
    }

    public List<Student> getAll(){
        return students;
    }

    public void add(Student studentObject){
        students.add(studentObject);
    }

    public void remove(Student studentObject){
        for(Student student : students)
        {
            if(student.ID == studentObject.ID){
                students.remove(student);
            }
        }
    }

    public Student get(Student studentObject){
        for(Student student : students)
        {
            if(student.ID == studentObject.ID){
                return student;
            }
        }

        return null;
    }

    public String Print(){
        String str = "";
        Iterator<Student> it = students.iterator();

        while(it.hasNext()){
            Student student = it.next();
            str += student.ID + " " + student.name + " " + student.CGPA + " " + student.program.toString();
        }

        return str;
    }

    

}
