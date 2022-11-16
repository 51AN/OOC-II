package assignment1;

 public class Date {
    private int day;
    private int month;
    private int year;
    private int last_day_of_month;
    private int last_month_of_year = 12;

    Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    protected void set_Last_day_of_month(int day_of_month){
        this.last_day_of_month = day_of_month;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }

    public void next_date(){
        if(day == last_day_of_month){
            day = 0;
        }
        if(month == last_month_of_year){
            month = 0;
            year++;
        }

        month++;
        day++;
    }

    boolean is_leap_year(){
        if (this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 != 0)){
            return true;
        }
        else {
            return false;
        }
    }


}
