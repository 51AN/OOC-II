package Lab07.Task01.Solution;

public class MasterFactory {
    
    public IMastersProgram chooseMasterprogram (DegreeType type,String major) {
        IMastersProgram master = null;
        if(type.equals(DegreeType.RegularThesis)) {
            master = new RegularThesis(major);
        } else if (type.equals(DegreeType.RegularNonThesis)) {
            master = new RegularNonThesis(major);
        } else master = new Executive(major);
        return master;
    }
    
}
