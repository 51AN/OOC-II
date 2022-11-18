package Assignment_01;

import assignment1.Date;
import assignment1.DateException;
import assignment1.FactoryDate;
import org.junit.jupiter.api.Test;

public class TestClass {

    @Test
    public void TestNextDate01() throws DateException{
        //Normal Next date
        FactoryDate factoryDate = new FactoryDate(1,1,2021);
        System.out.println(factoryDate.get_next_date());
    }

    @Test
    public void TestNextDate02() throws DateException{
        //December last day
        FactoryDate factoryDate = new FactoryDate(31,12,2022);
        System.out.println(factoryDate.get_next_date());
    }

    @Test
    public void TestNextDate03() throws DateException{
        //December any other day
        FactoryDate factoryDate = new FactoryDate(28,12,2022);
        System.out.println(factoryDate.get_next_date());
    }

    @Test
    public void TestNextDate04() {
        //last day of a 30 days month with error
        try{
            FactoryDate factoryDate = new FactoryDate(31, 04, 2022);
            System.out.println(factoryDate.get_next_date());
        }
        catch (DateException e){
            System.out.println("Date Exception Caught");
        }
    }

    @Test
    public void TestNextDate05() throws DateException{
        //last day of a 30 days month
        FactoryDate factoryDate = new FactoryDate(30,04,2022);
        System.out.println(factoryDate.get_next_date());
    }

    @Test
    public void TestNextDate06() throws DateException{
        //last day of a 31 days month
        FactoryDate factoryDate = new FactoryDate(31,01,2022);
        System.out.println(factoryDate.get_next_date());
    }

    @Test
    public void TestNextDate07() throws DateException{
        //last day of february no leap year
        FactoryDate factoryDate = new FactoryDate(28,02,2022);
        System.out.println(factoryDate.get_next_date());
    }
    @Test
    public void TestNextDate08() throws DateException{
        //28th day of february on leap year
        FactoryDate factoryDate = new FactoryDate(28,02,2020);
        System.out.println(factoryDate.get_next_date());
    }
    @Test
    public void TestNextDate09() throws DateException{
        //last day of february on leap year
        FactoryDate factoryDate = new FactoryDate(29,02,2020);
        System.out.println(factoryDate.get_next_date());
    }

    @Test
    public void TestNextDate10() {
        //month error
        try{
            FactoryDate factoryDate = new FactoryDate(31, 13, 2022);
            System.out.println(factoryDate.get_next_date());
        }
        catch (DateException e){
            System.out.println("Month Exception Caught");
        }
    }




}
