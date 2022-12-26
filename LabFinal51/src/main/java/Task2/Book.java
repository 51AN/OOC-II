package Task2;

import java.lang.reflect.Type;

public class Book {
    private String title;
    private String author;

    public BookType bookType;

    public Book(String title, String author, BookType type){
        this.author = author;
        this.title = title;
        this.bookType = type;

    }



}
