package TestTask4;
import Task2.Book;
import Task2.BookType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestBook {

    @Test
    public void testCase(){
        Book book = new Book("Some Book", "Sian Ashsad", BookType.NewBook);

        Class cls = book.getClass();
        Class superclass = cls.getSuperclass();


        assertEquals("java.lang.Object" ,superclass.getName());
    }
}
