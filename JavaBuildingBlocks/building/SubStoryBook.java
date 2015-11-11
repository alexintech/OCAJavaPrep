package building;
import library.Book;

public class SubStoryBook extends StoryBook {
  //! public final static int count;  // count is not initialized.
                                  // It will not get default value
  void action(Book book, StoryBook storyBook, SubStoryBook subStoryBook) {
    author = "Author";
    //! book.author = "Author";
    //! storyBook.author = "Author";
    subStoryBook.author = "Author";
  }

}

