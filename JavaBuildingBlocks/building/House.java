package building;
import library.Book;

public class House {
  public House() {
    Book book = new Book();
    book.author = "ABC";
    book.modifyTemplate();
  }
}
