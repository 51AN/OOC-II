package Lab06.TestTask03;
import Lab06.Task03.DayLabour;
import Lab06.Task03.MonthlyContract;
import Lab06.Task03.PermanentEmp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestEmployee {


    @Test
    public void EmployeeTest01(){

        PermanentEmp permanentEmp = new PermanentEmp(250, 30000);

        assertEquals(27, permanentEmp.vacation());
        assertEquals(1188000.00, permanentEmp.payment());


    }

    @Test
    public void EmployeeTest02(){

        MonthlyContract monthlyContract = new MonthlyContract(200, 15000);

        assertEquals(21, monthlyContract.vacation());
        assertEquals(180000.00, monthlyContract.payment());


    }

    @Test
    public void EmployeeTest03(){

        DayLabour dayLabour = new DayLabour(100, 5000);

        assertEquals(0, dayLabour.vacation());
        assertEquals(240000.00, dayLabour.payment());


    }

    @Test
    public void EmployeeTest04(){

        PermanentEmp permanentEmp = new PermanentEmp(250, 30000);

        assertInstanceOf( PermanentEmp.class ,permanentEmp);

    }








}
