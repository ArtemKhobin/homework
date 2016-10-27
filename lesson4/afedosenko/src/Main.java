
import lessons.Book;
import lessons.Author;
import java.util.Arrays;


public class Main {
  public static void main(String ...args) {
    System.out.println("--- Andrey Fedosenko. Homework. Lesson 4.");
    System.out.println("-- Part 2. Books and Authors.");

    Author auth1 = new Author("Ilya Ilf", "liya@writers.su");
    Author auth2 = new Author("Eugene Petrov", "eugene@writers.su");
    Author auth3 = new Author("Eugene Petrov", "eugene@writers.su");
    System.out.println(auth1.getName() + " " + auth1.getEmail());
    System.out.println(auth2.toString());
    if (auth1.equals(auth2))
        System.out.println("The authors: " + auth1.toString() + " AND " + auth2.toString() + " are EQUAL.");
    else
        System.out.println("The authors: " + auth1.toString() + " AND " + auth2.toString() + " are not EQUAL.");
    if (auth2.equals(auth3))
        System.out.println("The authors: " + auth2.toString() + " AND " + auth3.toString() + " are EQUAL.");
    else
        System.out.println("The authors: " + auth2.toString() + " AND " + auth3.toString() + " are not EQUAL.");

    Author[] auths1 = new Author[2];
    auths1[0] = new Author("Ilya Ilf", "liya@writers.su");
    auths1[1] = new Author("Eugene Petrov", "eugene@writers.su");
    Book book1 = new Book("The Little Golden Calf", 1931, auths1);
    Author[] auths2 = new Author[1];
    auths2[0] = new Author("Issaak Babel", "isaak@writers.su");
    Book book2 = new Book("Odessa tales", 1931, auths2);
    System.out.println(book1.toString());
    System.out.println(book2.toString());

    if (args.length >= 4) {
      Author[] auths3 = new Author[(args.length - 2)/2];
      int count = 0;
      for (int i = 2; i < args.length - 1;) {
        auths3[count] = new Author(args[i], args[i+1]);
        count++;
        i += 2;
      }
      Book book3 = new Book(args[0], Integer.parseInt(args[1]), auths3);
      System.out.println(book3.toString());
    }

    if (book1.equals(book2))
      System.out.println("Book1 and Book2 are EQUAL");
    else
      System.out.println("Book1 and Book2 are NOT EQUAL");

    Book book4 = new Book("Odessa tales", 1931, auths2);
    if (book2.equals(book4))
      System.out.println("Book2 and Book4 are EQUAL");
    else
      System.out.println("Book2 and Book4 are NOT EQUAL");

  }
}
