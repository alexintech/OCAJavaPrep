package building;
import library.Book;

public class SubStoryBook extends StoryBook {
  void action(Book book, StoryBook storyBook, SubStoryBook subStoryBook) {
    author = "Author";
    //! book.author = "Author";
    //! storyBook.author = "Author";
    subStoryBook.author = "Author";
  }

}

