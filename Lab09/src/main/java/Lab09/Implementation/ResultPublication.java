package Lab09.Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ResultPublication {
    public List<Student> PrintList(List<Student> studentsPrint){
//        StudentEnrollment studentEnrollment = new StudentEnrollment();
//        List<Student> studentsPrint = new ArrayList<>();
//        studentsPrint = studentEnrollment.getAll();

        Collections.sort(studentsPrint, new SortById());
        return studentsPrint;
    }


}
