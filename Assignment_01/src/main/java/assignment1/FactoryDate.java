package assignment1;
import java.util.*;

public class FactoryDate {

    List<Integer> MonthsWith30Days = Arrays.asList(4,6,9,11);
    List<Integer> MonthsWith31Days = Arrays.asList(1,3,5,7,8,10,12);

    Date date;
    public FactoryDate(int day, int month, int year){
        if(MonthsWith30Days.contains(month)){
            this.date = new Month30Days(day,month,year);
        }
        else if(MonthsWith31Days.contains(month)){
            this.date = new Month31Days(day,month,year);
        }
        else{
            this.date = new February(day, year);
        }
        //date.next_date();
    }

    public String get_next_date(){
        date.next_date();
        String str = date.getDay() + "/" + date.getMonth() + "/" + date.getYear();
        return str;
    }





}
