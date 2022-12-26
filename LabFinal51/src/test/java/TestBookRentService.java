import Task2.Book;
import Task2.BookRentService;
import Task2.BookType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestBookRentService {

    @Test
    public void TestCase01(){
        Book book = new Book("The insider", "Steven Williams", BookType.RegularBook);
        BookRentService bookRentService = new BookRentService(4, 1000);
        assertEquals(800, bookRentService.totalRent(book));
    }

    @Test
    public void TestCase02(){
        Book book = new Book("The insider", "Steven Williams", BookType.RegularBook);
        BookRentService bookRentService = new BookRentService(8, 1000);
        assertEquals(804, bookRentService.totalRent(book));
    }

    @Test
    public void TestCase03(){
        Book book = new Book("You and Me", "Steven Williams", BookType.KidsBook);
        BookRentService bookRentService = new BookRentService(2, 1000);
        assertEquals(900, bookRentService.totalRent(book));
    }

    @Test
    public void TestCase04(){
        Book book = new Book("You and Me", "Steven Williams", BookType.KidsBook);
        BookRentService bookRentService = new BookRentService(8, 1000);
        assertEquals(904, bookRentService.totalRent(book));
    }

    @Test
    public void TestCase05(){
        Book book = new Book("The end of times", "Steven Williams", BookType.NewBook);
        BookRentService bookRentService = new BookRentService(7, 1000);
        assertEquals(1300, bookRentService.totalRent(book));
    }

    @Test
    public void TestCase06(){
        Book book = new Book("The end of times", "Steven Williams", BookType.NewBook);
        BookRentService bookRentService = new BookRentService(10, 1000);
        assertEquals(1312, bookRentService.totalRent(book));
    }








}
