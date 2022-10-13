package Lab07.TestTask01;
import Lab07.Task01.Solution.DegreeType;
import Lab07.Task01.Solution.MastersProgram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MastersProgramTest {

        @Test
        public void isEligibleThesis(){
            MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "swe");
            boolean isEligible = mp.isEligible(2, "swe");
            assertFalse(isEligible);
            isEligible = mp.isEligible(3.9f, "swe");
            assertTrue(isEligible);
        }

        @Test
        public void isEligibleThesis2(){
            MastersProgram mp = new MastersProgram(DegreeType.RegularNonThesis, "CSE");
            boolean isEligible = mp.isEligible(3.6f,"CSE");
            assertTrue(isEligible);
            isEligible = mp.isEligible(3.6f, "SWE");
            assertFalse(isEligible);
        }

        @Test
        public void getMarksThesis(){
            MastersProgram mp = new MastersProgram(DegreeType.RegularNonThesis, "swe");
            int marks = mp.getMarks(80,60, 40);
            assertEquals(100, marks);
        }

        @Test
        public void getMarksThesis2(){
            MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "CSE");
            int marks = mp.getMarks(40, 70, 15);
            assertEquals(110, marks);
        }

        @Test
        public void isEligibleThesisDifferentMajor(){
            MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "cse");
            boolean isEligible = mp.isEligible(3.9f, "swe");
            assertFalse(isEligible);
        }

        @Test
        public void isEligibleThesis3(){
            MastersProgram mp = new MastersProgram(DegreeType.RegularNonThesis, "CSE");
            boolean isEligible = mp.isEligible(3.6f,"CSE");
            assertTrue(isEligible);
            isEligible = mp.isEligible(1.2f, "CSE");
            assertTrue(isEligible);
        }

    @Test
    public void isEligibleExecutive(){
        MastersProgram mp = new MastersProgram(DegreeType.Executive, "swe");
        boolean isEligible = mp.isEligible(2, "cse");
        assertFalse(isEligible);
        isEligible = mp.isEligible(3.76f, "swe");
        assertTrue(isEligible);
    }

}
