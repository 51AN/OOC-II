package assignment1;

public class Month30Days extends Date{

    Month30Days(int day, int month, int year){
        super(day, month, year);
        this.set_Last_day_of_month(30);
    }
}
