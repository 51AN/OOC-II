package lab05.task03;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
public class TestPrinter {

    @Test
    public void TestPerson(){
        String expected = "Sian, Uttara, 21";
        Person person = new Person("Sian", "Uttara", 21);
        assertEquals(expected, person.toString());
    }

    @Test
    public void TestStudent(){
        String expected = "Sian, Uttara, 21, 200042151";
        Student student = new Student("Sian", "Uttara", 21, 200042151);
        assertEquals(expected, student.toString());
    }

    @Test
    public void TestFaculty(){
        String expected = "Sian, Uttara, 21, Lecturer";
        Faculty faculty = new Faculty("Sian", "Uttara", 21, "Lecturer");
        assertEquals(expected, faculty.toString());
    }

    @Test
    public void TestPrinterPerson(){
        String expected = "[Sian, Uttara, 21, Daiyan, CTG, 21, Wasif, Dhaka, 21]";

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Sian","Uttara", 21));
        people.add(new Person("Daiyan","CTG", 21));
        people.add(new Person("Wasif","Dhaka", 21));

        Printer<Person> personPrinter = new Printer<>();

        assertEquals(expected, personPrinter.printList(people));


    }

    @Test
    public void TestPrinterStudent(){
        String expected = "[Sian, Uttara, 21, 200042151, Daiyan, CTG, 21, 200042105, Wasif, Dhaka, 21, 200042129]";

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Sian","Uttara", 21, 200042151));
        students.add(new Student("Daiyan","CTG", 21, 200042105));
        students.add(new Student("Wasif","Dhaka", 21, 200042129));

        Printer<Person> studentPrinter = new Printer<>();

        assertEquals(expected, studentPrinter.printList(students));


    }

    @Test
    public void TestPrinterFaculty(){
        String expected = "[Sian, Uttara, 21, Lecturer, Daiyan, CTG, 21, Chancelor, Wasif, Dhaka, 21, As.Proffesor]";

        ArrayList<Faculty> faculties = new ArrayList<>();
        faculties.add(new Faculty("Sian","Uttara", 21, "Lecturer"));
        faculties.add(new Faculty("Daiyan","CTG", 21, "Chancelor"));
        faculties.add(new Faculty("Wasif","Dhaka", 21, "As.Proffesor"));

        Printer<Person> facultyPrinter = new Printer<>();

        assertEquals(expected, facultyPrinter.printList(faculties));


    }








}
