package assignment2.DataCoupling;

public class Calculator {

    Operations operations = new Operations();

    public void Summation(int num1, int num2){
        System.out.println(operations.sum(num1,num2));
    }

    public void Subtraction(int num1, int num2){
        System.out.println(operations.sub(num1, num2));
    }
}
