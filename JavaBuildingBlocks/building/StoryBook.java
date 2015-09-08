package building;
import library.Book;

public class StoryBook extends Book {
  public StoryBook() {
    author = "ABC";
    modifyTemplate();
    Book book = new Book();
    String v = book.author;   // Compile error
    book.modifyTemplate();    // Compile error
  }
}
