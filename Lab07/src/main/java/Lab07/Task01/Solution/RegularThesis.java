package Lab07.Task01.Solution;

public class RegularThesis implements IMastersProgram{
    String major;

    public RegularThesis(String major){
        this.major = major;
    }

    @Override
    public boolean isEligible(float cgpa, String major){
        return this.major.equals(major) && cgpa >= 3.8;
    }

    @Override
    public int getMarks(int theoryMarks, int thesismarks, int projectMarks){
        return theoryMarks + thesismarks;
    }
}
