import java.util.ArrayList;


public class Library {


        private ArrayList<Book> book;
        private int maxStock;
        public Library( int maxStock){
            this.book = new ArrayList<Book>();
            this.maxStock = maxStock;
        }
        public void addBook (Book book) {
            if (this.book.size() < this.maxStock) {
                this.book.add(book);
            }
        }
    public Book removeBook(){
        return this.book.remove(0);
    }
    public int bookCount(){
            return this.book.size();
    }
    }



