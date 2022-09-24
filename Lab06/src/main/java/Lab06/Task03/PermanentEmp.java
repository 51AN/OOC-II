package Lab06.Task03;
import java.util.*;
public class PermanentEmp extends Employee implements YearlyVacation,YearlyWage{


    public PermanentEmp(int workDays, int baseWage){
        super(workDays, baseWage);
    }

    @Override
    public int vacation(){
        return (20 + (int)(workingDays * 0.03));
    }

    @Override
    public double payment(){
        return (12 *(basicWage + (basicWage * 0.3) + (basicWage* 2)));
    }









}
