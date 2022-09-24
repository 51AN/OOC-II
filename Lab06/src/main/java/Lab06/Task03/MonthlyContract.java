package Lab06.Task03;

public class MonthlyContract extends Employee implements YearlyVacation, YearlyWage{

    public MonthlyContract(int workDays, int baseWage){
        super(workDays, baseWage);
    }

    @Override
    public int vacation(){
        return 21;
    }

    @Override
    public double payment(){
        return (12 * basicWage);
    }


}
