package Lab07.Task01.Solution;

public interface IMastersProgram {

    boolean isEligible(float cgpa, String major);
    int getMarks(int theoryMarks, int thesismarks, int projectMarks);
}
