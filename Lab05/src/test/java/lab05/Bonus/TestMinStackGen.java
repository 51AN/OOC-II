package lab05.Bonus;
import lab05.task02.MinStack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMinStackGen {


    @Test
    public void TestStack01(){
        MinStackGen<Integer> stack = new MinStackGen<>();
        stack.Push(5);
        stack.Push(4);
        stack.Push(3);
        stack.Push(2);
        stack.Push(1);

        assertEquals(1, stack.min());
    }

    @Test
    public void TestStack02(){
        MinStackGen<Double> stack = new MinStackGen<>();
        stack.Push(5.6);
        stack.Push(4.3);
        stack.Push(3.001);
        stack.Push(2.0);
        stack.Push(1.99);

        assertEquals(1.99, stack.min());
    }

    @Test
    public void TestStack03(){
        MinStackGen<String> stack = new MinStackGen<>();
        stack.Push("How");
        stack.Push("are");
        stack.Push("doing");
        stack.Push("?");
        stack.Push(":3");

        assertEquals(":3", stack.pop());
    }







}
