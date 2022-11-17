package Lab11;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.nio.file.*;
import java.util.stream.Collectors;

public class EmployeeDB {

    ArrayList<Employee> ListOfEmployees = new ArrayList<>();
    public void save ( Employee employee ) {
        FileWriter fw = null ;
        try {
            fw = new FileWriter ("D:\\Java Projects\\OOC-II\\Lab11\\lab11.txt", true ) ;
            fw . write ( employee . toString () + "\n") ;
        }
        catch ( IOException e ) {
            e . printStackTrace () ;
        }
        finally {
            try {
                fw . close () ;
            }
            catch ( IOException e ) {
                e . printStackTrace () ;
            }
        }
    }

    // this code will give error if there is no file
    public void anotherSave () {
        try {
            Files . write ( Paths . get (" myfile . txt ") , " the text ". getBytes () ,
                    StandardOpenOption . APPEND ) ;
        } catch ( IOException e ) {
            e . printStackTrace () ;
        }
    }


    //Task01
    public ArrayList<Employee> employeeList(){

        File file = new File("D:\\Java Projects\\OOC-II\\Lab11\\lab11.txt");
        Scanner scanner = null;

        try{
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        ArrayList<Employee> employees = new ArrayList<>();

        String [] token = new String[4];

        while(scanner.hasNextLine()){
            token = scanner.nextLine().split(",");
            String ID = token[0];
            String Name = token[1];
            String Experience = token[2];
            String Salary = token[3];
            String Age = token[4];

            Employee employee = new Employee(Name);
            employee.setID(Integer.valueOf(ID));
            employee.setExperience(Integer.valueOf(Experience));
            employee.setSalary(Integer.valueOf(Salary));
            employee.setAge(Integer.valueOf(Age));
            employees.add(employee);
        }


        return employees;
    }


    //Task02
    //This is a pure function
    public void addEmployee (Employee employee ) {

        ListOfEmployees.add(employee);

    }

    //Task03
    //This is an impure function as it modifies one of its own arguments
    public List < Employee > add ( List < Employee > employees , Employee employee ) {
        employees . add ( employee ) ;
        return employees ;
    }

    //Task05
    public List<Employee> ageFilter(int age){
        //ArrayList<Employee> filterEmployee = new ArrayList<>();
        return  ListOfEmployees.stream()
                .filter(e -> e.getAge() == age)
                .collect(Collectors.toList());
    }

    public List<Employee> salaryFilter(int minSalary){
        return ListOfEmployees.stream()
                .filter(e -> e.getSalary() > minSalary)
                .collect((Collectors.toList()));
    }





}
