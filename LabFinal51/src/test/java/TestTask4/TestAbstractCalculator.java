package TestTask4;
import Task3.Calculator;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;
public class TestAbstractCalculator {

    @Test
    public void testCase(){
        Calculator calculator = new Calculator();
        Class cls = calculator.getClass();
        assertFalse(Modifier.isAbstract(cls.getModifiers()));
    }
}
