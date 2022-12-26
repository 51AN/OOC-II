package Task2;

public class BookRentService {
    private int numberOfDays;
    private int baseRentFee;

    public BookRentService(int numberOfDays, int baseRentFee){
        this.baseRentFee = baseRentFee;
        this.numberOfDays = numberOfDays;
    }

    private boolean fineApplicable(){
        if(numberOfDays > 7){
            return true;
        }
        else {
            return false;
        }
    }

    private int calculateFine(){
        if(fineApplicable()){
            return ((numberOfDays - 7) * 4);
        }
        else{
            return 0;
        }
    }


    public int totalRent(Book book){
        if(book.bookType == BookType.RegularBook){
            return (int)(baseRentFee * 0.8) + calculateFine();
        } else if (book.bookType == BookType.KidsBook) {
            return (int)(baseRentFee * 0.9) + calculateFine();

        } else if (book.bookType == BookType.NewBook) {
            return (int)(baseRentFee * 1.3) + calculateFine();
        }
        else {
            return baseRentFee;
        }
    }




}
