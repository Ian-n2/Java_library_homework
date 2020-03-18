import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }
    public void checkOut(Library library){
        collection.add(library.removeBook());
    }

    public int bookBorrowed(){
        return this.collection.size();
    }

}
