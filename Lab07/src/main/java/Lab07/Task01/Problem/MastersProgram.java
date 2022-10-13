package Lab07.Task01.Problem;

public class MastersProgram {

        private DegreeType dt;
        private String major;
        public MastersProgram(DegreeType type, String major){
            this.dt = type;
            this.major = major;
        }
        public boolean isEligible(float cgpa, String major){
            if(dt == DegreeType.RegularThesis){
                return this.major.equals(major) && cgpa >= 3.8;
            } else {
                return this.major.equals(major);
            }
        }
        public int getMarks(int theoryM, int thesisM, int pm){
            if(dt == DegreeType.RegularNonThesis){
                return theoryM + pm/2;
            } else {
                return theoryM + thesisM;
            }
        }
    }

