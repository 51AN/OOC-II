import Lab11.Employee;
import Lab11.EmployeeDB;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
public class TestEmployee {

    @Test
    public void TestWriteFile(){
        Employee employee = new Employee("Dihan");
        employee.setID(42149);
        employee.setExperience(999);
        employee.setSalary(0);
        employee.setAge(21);

        EmployeeDB DB = new EmployeeDB();
        DB.save(employee);

        employee = new Employee("Sian");
        employee.setID(42151);
        employee.setExperience(0);
        employee.setSalary(6969696);
        employee.setAge(21);
        DB.save(employee);

        System.out.println(DB.getEmployeeList());
    }

    @Test
    public void TestEmployeeList(){
        ArrayList<Employee> employees = new ArrayList<>();
        EmployeeDB DB = new EmployeeDB();
        employees = DB.employeeList();
        System.out.println(employees);
    }

    @Test
    public void TestAgefilter(){
        Employee employee = new Employee("Dihan");
        employee.setID(42149);
        employee.setExperience(999);
        employee.setSalary(0);
        employee.setAge(20);

        EmployeeDB DB = new EmployeeDB();
        DB.addEmployee(employee);

        employee = new Employee("Sian");
        employee.setID(42151);
        employee.setExperience(0);
        employee.setSalary(6969696);
        employee.setAge(21);

        DB.addEmployee(employee);

        System.out.println(DB.ageFilter(21));

    }
    @Test
    public void TestSalaryfilter(){
        Employee employee = new Employee("Dihan");
        employee.setID(42149);
        employee.setExperience(999);
        employee.setSalary(0);
        employee.setAge(20);

        EmployeeDB DB = new EmployeeDB();
        DB.addEmployee(employee);

        employee = new Employee("Sian");
        employee.setID(42151);
        employee.setExperience(0);
        employee.setSalary(6969696);
        employee.setAge(21);

        DB.addEmployee(employee);

        System.out.println(DB.salaryFilter(1000));

    }
    @Test
    public void TestSalaryIncrementFilter(){
        Employee employee = new Employee("Dihan");
        employee.setID(42149);
        employee.setExperience(999);
        employee.setSalary(1);
        employee.setAge(20);

        EmployeeDB DB = new EmployeeDB();
        DB.addEmployee(employee);

        employee = new Employee("Sian");
        employee.setID(42151);
        employee.setExperience(0);
        employee.setSalary(6969696);
        employee.setAge(21);

        DB.addEmployee(employee);

        System.out.println(DB.incrementMapper(2));

    }

    @Test
    public void TestTotalSalaryFilter(){
        Employee employee = new Employee("Dihan");
        employee.setID(42149);
        employee.setExperience(999);
        employee.setSalary(1);
        employee.setAge(20);

        EmployeeDB DB = new EmployeeDB();
        DB.addEmployee(employee);

        employee = new Employee("Sian");
        employee.setID(42151);
        employee.setExperience(0);
        employee.setSalary(6969696);
        employee.setAge(21);

        DB.addEmployee(employee);

        System.out.println(DB.totalSalaryOfFilteredEmployee(2));

    }








}
