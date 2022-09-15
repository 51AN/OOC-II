package lab05.task01;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestFizzBuzz {

    @Test
    public void FizzTest01(){
        String expected = "";
        FizzBuzz fizzy = new FizzBuzz();
        expected = "Fizz";
        assertEquals(expected,fizzy.getFizzyBuzz(6) );
    }

    @Test
    public void FizzTest02(){
        String expected = "";
        FizzBuzz fizzy = new FizzBuzz();
        expected = "Buzz";
        assertEquals(expected,fizzy.getFizzyBuzz(14) );
    }



    @Test
    public void FizzTest03(){
        String expected = "";
        FizzBuzz fizzy = new FizzBuzz();
        expected = "Fizzbuzz";
        assertEquals(expected,fizzy.getFizzyBuzz(21) );
    }

    @Test
    public void FizzTest04(){
        String expected = "";
        FizzBuzz fizzy = new FizzBuzz();
        expected = "Gotcha";
        assertEquals(expected,fizzy.getFizzyBuzz(22) );
    }

    @Test
    public void FizzTest05(){
        String expected = "";
        FizzBuzz fizzy = new FizzBuzz();
        expected = "Fizzbuzz";
        assertEquals(expected,fizzy.getFizzyBuzz(0) );
    }


}
