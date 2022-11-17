package Lab11;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Employee {
    private int ID;
    private String name;
    private int experience;
    //Task04
    private int age;
    //Task04
    private int salary;

    public Employee(String name) {
        this.name = name;
    }
    public void setID (int newID ) {
        this . ID = (int ) ( Math . random () * newID ) ;
    }
    public void setExperience ( Date joining ) {
        Calendar calendar = Calendar . getInstance ( Locale. US ) ;
        calendar . setTime ( joining ) ;
        LocalDateTime now = LocalDateTime . now () ;
        int years = now . getYear () - calendar . get ( Calendar . YEAR ) ;
        this . experience = years ;
    }
    public void setExperience ( int years) {
        this.experience = years;
    }
    public void setName ( String name ) {
        this.name = name;
    }
    //Task04
    public void setAge( int years) {
        this.age = years;
    }
    //Task04
    public void setSalary( int salary)
    {
        this.salary = salary;
    }
    public int getID() {
        return this.ID;
    }
    public String getName() {
        return this.name;
    }
    public int getExperience() {
        return this.experience;
    }
    //Task04
    public int getSalary(){
        return this.salary;
    }
    //Task04
    public int getAge(){
        return this.age;
    }



    @Override
    public String toString () {
        return ID +
                "," + name +
                "," + experience +
                "," + salary +
                "," + age;
    }
}
