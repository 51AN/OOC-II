import Task3.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestCalculator {

    @Test
    public void TestCase01(){
        Calculator calculator = new Calculator();

        assertEquals(5.0, calculator.add(3.0,2.0));

    }
    @Test
    public void TestCase02(){
        Calculator calculator = new Calculator();

        assertEquals(1.0, calculator.subtract(3.0,2.0));

    }
    @Test
    public void TestCase03(){
        Calculator calculator = new Calculator();

        assertEquals(6.0, calculator.multiply(3.0,2.0));

    }
    @Test
    public void TestCase04(){
        Calculator calculator = new Calculator();

        assertEquals(1.5, calculator.divide(3.0,2.0));

    }
    @Test
    public void TestCase05(){
        Calculator calculator = new Calculator();

        assertEquals(3.0, calculator.subtract(2.0,5.0));

    }
}
