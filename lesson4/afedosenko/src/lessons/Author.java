package lessons;
import java.util.Arrays;

public class Author {
  private String name;
  private String email;

  public Author(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String toString() {
    return name + " " + email;
  }

  public boolean equals(Object that) {
    if (this == that) return true;
    Author auth = (Author)that;
    return (this.name.equals(auth.name) && this.email.equals(auth.email));
  }
}
