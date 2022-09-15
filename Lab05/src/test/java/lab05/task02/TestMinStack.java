package lab05.task02;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMinStack {

    @Test
    public void TestStack01(){
        MinStack stack = new MinStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        assertEquals(1, stack.min());
    }

    @Test
    public void TestStack02(){
        MinStack stack = new MinStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        stack.pop();

        assertEquals(2, stack.min());
    }

    @Test
    public void TestStack03(){
        MinStack stack = new MinStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        stack.pop();
        stack.pop();

        assertEquals(3, stack.min());
    }

    @Test
    public void TestStack04(){
        MinStack stack = new MinStack();
        stack.push(12);
        stack.push(3);
        stack.push(4);
        stack.pop();
        assertEquals(3, stack.min());
    }



    @Test
    public void TestStack05(){
        MinStack stack = new MinStack();
        assertEquals(-1, stack.pop());
    }

@Test
    public void TestStack06(){
        MinStack stack = new MinStack();
        stack.push(12);
        stack.push(3);
        stack.push(4);
        assertEquals(4, stack.pop());
    }





}
