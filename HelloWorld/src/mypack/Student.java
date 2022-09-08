package mypack;

abstract public class Student {

    private String name;
    int age;

    public String getName()
    {
        return name;
    }


    public void setName(String NaMe)
    {
        this.name = NaMe;
    }

    public void displayMessage()
    {
        System.out.println("I am student");
    }



}
