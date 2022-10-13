package Lab07.Task01.Solution;

public class MastersProgram {

    private IMastersProgram type;
    public MastersProgram(DegreeType type, String major) {
        this.type = new MasterFactory().chooseMasterprogram (type,major);
    }
    public boolean isEligible(float cgpa, String major) {
        return type.isEligible(cgpa,major) ;
    }
    public int getMarks(int theoryMarks, int thesisMarks, int projectMarks) {
        return type.getMarks(theoryMarks, thesisMarks, projectMarks);
    }
}
