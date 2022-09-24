package Lab06.TestTask01;
import Lab06.Task01.MaxStackGen;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMaxStackGen {


    @Test
    public void TestStack01(){
        MaxStackGen<Integer> stack = new MaxStackGen<>();
        stack.Push(3);
        stack.Push(5);
        stack.Push(2);

        assertEquals(5, stack.max());
    }

    @Test
    public void TestStack02_01(){
        MaxStackGen<Integer> stack = new MaxStackGen<>();
        stack.Push(2);
        stack.Push(1);
        stack.Push(2);
        stack.Push(5);

        stack.pop();

        assertEquals(2, stack.max());
    }

    @Test
    public void TestStack02_02(){
        MaxStackGen<Integer> stack = new MaxStackGen<>();
        stack.Push(2);
        stack.Push(1);
        stack.Push(2);
        stack.Push(5);

        stack.pop();
        stack.pop();

        assertEquals(2, stack.max());
    }



    @Test
    public void TestStack03_01(){
        MaxStackGen<Double> stack = new MaxStackGen<>();
        stack.Push(49.75);
        stack.Push(23.54);
        stack.Push(100.0);



        assertEquals(100.0, stack.max());
    }

    @Test
    public void TestStack03_02(){
        MaxStackGen<Double> stack = new MaxStackGen<>();
        stack.Push(49.75);
        stack.Push(23.54);
        stack.Push(100.0);

        stack.pop();

        assertEquals(49.75, stack.max());
    }

    @Test
    public void TestStack04_01(){
        MaxStackGen<String> stack = new MaxStackGen<>();
        stack.Push("OOC is bad");
        stack.Push("Nothing to understand");
        stack.Push("Try hard");

        assertEquals("Try hard", stack.max());
    }

    @Test
    public void TestStack04_02(){
        MaxStackGen<String> stack = new MaxStackGen<>();
        stack.Push("OOC is bad");
        stack.Push("Nothing to understand");
        stack.Push("Try hard");

        stack.pop();

        assertEquals("OOC is bad", stack.max());
    }





}
