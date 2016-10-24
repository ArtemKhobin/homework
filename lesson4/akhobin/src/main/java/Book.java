package main.java;

import java.util.Arrays;

class Book {
  private String title;
  private int cost;
  private Author[] authors;

  public Book(String title, int cost) {
    this.title = title;
    this.cost = cost;
  }
  public Book(String title, int cost, Author author) {
    this(title, cost);
    this.authors = new Author[]{author};
  }
  public Book(String title, int cost, Author[] authors) {
    this(title, cost);
    this.authors = authors;
  }

  public String toString() {
    String result = "Title: \"" + title + "\"; Cost: $" + cost;
    if (authors.length > 0) {
      result += "; author(s): ";
      for (int i = 0; i < authors.length; i++) {
        result += authors[i].toString() + ' ';
      }
    }
    return result;

  }

  public boolean equals(Object that) {
    if (this == that) return true;
    return  isTheSame((Book) that);
  }

  private boolean isTheSame(Book book) {
    if (title != book.title || cost != book.cost && authors.length != book.authors.length) {
      return false;
    }

    for (int i = 0; i < authors.length; i++) {
      if ( ! authors[i].equals(book.authors[i])) return false;
    }

    return true;
  }
}
