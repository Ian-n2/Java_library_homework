import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;
    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book("Bone", "Jeff Smith", "comic");
        library = new Library(3);
    }
    @Test
    public void checkBorrowersBooks(){
        assertEquals(0,borrower.bookBorrowed());
    }
    @Test
    public void canTakeBook(){
        library.addBook(book);
        borrower.checkOut(library);
        assertEquals(1,borrower.bookBorrowed());

    }
}
