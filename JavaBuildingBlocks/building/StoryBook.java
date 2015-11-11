package building;
import library.Book;

public class StoryBook extends Book {
  public StoryBook() {
    author = "ABC";
    modifyTemplate();
    Book book = new Book();
    //! String v = book.author;   // Compile error
    //! book.modifyTemplate();    // Compile error
  }
  public void refStoryBook() {
    StoryBook sb = new StoryBook();
    sb.modifyTemplate();  // OK, because sb is a reference to this class
    String v = sb.author;
  }; // colon is legal
  void action(Book book, StoryBook storyBook, SubStoryBook subStoryBook) {
    author = "Author";
    //! book.author = "Author";
    storyBook.author = "Author";
    subStoryBook.author = "Author"; // OK, because subStoryBook is a ref to subclass
  }

}
