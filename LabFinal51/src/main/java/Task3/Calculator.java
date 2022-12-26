package Task3;

public class Calculator implements Operations<Double>{
    @Override
    public Double add(Double num1, Double num2) {
        return num1 + num2;
    }

    @Override
    public Double subtract(Double num1, Double num2) {
        return num1>num2?(num1-num2):(num2-num1);
    }

    @Override
    public Double multiply(Double num1, Double num2) {
        return num1 * num2;
    }

    @Override
    public Double divide(Double num1, Double num2) {
        return num1>num2?(num1/num2):(num2/num1);
    }
}
