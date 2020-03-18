import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

private Library library;
private Book book;

@Before
    public void before(){
    library = new Library(3);
    book = new Book("Tom Sawyer", "Mark Twain", "Adventure");
    book = new Book("milk man", "Anna Burns", "comedy");
    book = new Book("Treasure", "big man", "flagfun");
}
@Test
    public void addBook(){
    library.addBook(book);
    assertEquals(1,library.bookCount());
}
@Test
    public void maxAmountOfBooks(){
    library.addBook(book);
    library.addBook(book);
    library.addBook(book);
    library.addBook(book);
    assertEquals(3, library.bookCount());
}
@Test
    public void canRemoveBook(){
    library.addBook(book);
    library.removeBook();
    assertEquals(0,library.bookCount());
}
}
