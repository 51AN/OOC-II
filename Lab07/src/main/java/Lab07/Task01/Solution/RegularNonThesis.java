package Lab07.Task01.Solution;

public class RegularNonThesis implements IMastersProgram{

    String major;

    public RegularNonThesis(String major){
        this.major = major;
    }

    @Override
    public boolean isEligible(float cgpa, String major){
        return this.major.equals(major);
    }

    @Override
    public int getMarks(int theoryMarks, int thesismarks, int projectMarks){
        return theoryMarks + (projectMarks/2);
    }
}
