package Lab06.TestTask02;
import java.util.ArrayList;
import java.util.List;

import Lab06.Task02.DivisibleThree;
import Lab06.Task02.GenericCount;
import Lab06.Task02.Length;
import Lab06.Task02.Odd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestGenericCount {

    @Test
    public void TestCount01(){

        GenericCount count = new GenericCount();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        DivisibleThree divThree = new DivisibleThree();

        assertEquals(2,count.countIf(list, divThree));


    }


    @Test
    public void TestCount02(){

        GenericCount count = new GenericCount();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(16);
        list.add(6);

        Odd odd = new Odd();

        assertEquals(1,count.countIf(list, odd));


    }

    @Test
    public void TestCount03(){

        GenericCount count = new GenericCount();
        ArrayList<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Beautiful");


        Length length = new Length();

        assertEquals(2,count.countIf(list, length));


    }




}
