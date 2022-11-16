package assignment1;

public class Month31Days extends Date{

    Month31Days(int day, int month, int year){
        super(day, month, year);
        this.set_Last_day_of_month(31);
    }
}
