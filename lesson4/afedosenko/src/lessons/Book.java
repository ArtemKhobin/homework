package lessons;
import java.util.Arrays;
import lessons.Author;

public class Book {
  private String name;
  private int year;
  private Author[] authors;


  public Book(String name, int year, Author[] authors) {
    this.name = name;
    this.year = year;
    this.authors = authors;
  }

  public String toString() {
    String result = "";
    result += "BOOK: \"" + name + "\" YEAR: " + year + " AUTHORS: ";
    for(int i = 0; i < authors.length; i++) {
        result += authors[i].toString() + " ";
    }
    return result;
  }

  public boolean equals(Object that) {
    if (this == that)
        return true;
    Book book = (Book)that;

    if (this.authors.length != book.authors.length)
        return false;
    for (int i = 0; i < book.authors.length; i++) {
        if (!this.authors[i].equals(book.authors[i]))
            return false;
    }
    return (this.name.equals(book.name) && this.year == book.year);
  }

}
