package main.java;

import java.util.Arrays;

class Author {
  private String name;
  private String email;

  public Author(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String toString() {
    return name + " (" + email + ")";

  }

  public boolean equals(Object that) {
    if (this == that) return true;
    return isTheSame((Author)that);
  }

  private boolean isTheSame(Author author) {
    if (name == author.name && email == author.email) return true;
    return false;
  }
}
