package lab05.task03;

public class Person {

    public String name , address;
    public Integer age;

    public Person(String Name, String Add, Integer Age){
        this.name = Name;
        this.address = Add;
        this.age = Age;
    }

    @Override
    public String toString() {
        return name + ", " +address + ", " + age;
    }

}
