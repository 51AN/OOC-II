package assignment1;

public class February extends Date{

    February(int day, int year){
        super(day, 2, year);
        if(this.is_leap_year()){
            this.set_Last_day_of_month(29);
        }
        else{
            this.set_Last_day_of_month(28);
        }
    }
}
