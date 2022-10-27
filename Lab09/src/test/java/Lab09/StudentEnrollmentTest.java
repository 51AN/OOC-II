package Lab09;
import Lab09.Implementation.Exporter;
import Lab09.Implementation.ResultPublication;
import Lab09.Implementation.Student;
import Lab09.Implementation.StudentEnrollment;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
public class StudentEnrollmentTest {

    @Test
    public void StudentEnrollmentTest01(){

        Student student = new Student("200042151", "Sian", (float) 3.93, Student.Program.SWE);

        StudentEnrollment studentEnrollment = new StudentEnrollment();

        studentEnrollment.add(student);

//        assertInstanceOf(, studentEnrollment.get("200042151"));

        assertTrue(studentEnrollment.get("200042151") instanceof Student);

    }

    @Test
    public void StudentEnrollmentTest02(){

        Student student = new Student("200042151", "Sian", (float) 3.93, Student.Program.SWE);
        Student student2 = new Student("200042149", "Dihan", (float) 3.65, Student.Program.SWE);

        StudentEnrollment studentEnrollment = new StudentEnrollment();

        studentEnrollment.add(student);
        studentEnrollment.add(student2);

        List<Student> list1 = new ArrayList<>();
        List<Student> list2;

        list1.add(student);
        list1.add(student2);

        list2 = studentEnrollment.getAll();


        assertEquals(list1, list2);

    }
    @Test
    public void StudentEnrollmentTest03(){

        Student student = new Student("200042151", "Sian", (float) 3.93, Student.Program.SWE);

        StudentEnrollment studentEnrollment = new StudentEnrollment();

        studentEnrollment.add(student);

        String line = studentEnrollment.Print();

        String test = "200042151 Sian 3.93 SWE";

        assertEquals(test, line);

    }

    @Test
    public void ResultPublication(){

        Student student = new Student("200042151", "Sian", (float) 3.93, Student.Program.SWE);
        Student student2 = new Student("200042149", "Dihan", (float) 3.65, Student.Program.SWE);

        StudentEnrollment studentEnrollment = new StudentEnrollment();

        studentEnrollment.add(student);
        studentEnrollment.add(student2);

        List<Student> list1 = new ArrayList<>();
        List<Student> list2;

        list1.add(student2);
        list1.add(student);

        list2 = studentEnrollment.getAll();



        ResultPublication resultPublication = new ResultPublication();
        List<Student> list3 = resultPublication.PrintList(list2);

        assertEquals(list1, list3);

    }


    @Test
    public void ExporterTest() throws IOException {

        Student student = new Student("200042151", "Sian", (float) 3.93, Student.Program.SWE);
        Student student2 = new Student("200042149", "Dihan", (float) 3.65, Student.Program.SWE);

        StudentEnrollment studentEnrollment = new StudentEnrollment();

        studentEnrollment.add(student);
        studentEnrollment.add(student2);


        List<Student> list1 = studentEnrollment.getAll();

        Exporter exporter = new Exporter();

        exporter.writeCSV(list1);

    }



}
