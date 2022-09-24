package Lab06.Task03;

public class DayLabour extends Employee implements YearlyWage, YearlyVacation{

    public DayLabour(int workDays, int baseWage){
        super(workDays, baseWage);
    }

    @Override
    public double payment(){

        return (12 * ( (workingDays * basicWage) / 25 ));
    }

    @Override
    public int vacation(){
        return 0;
    }


}
