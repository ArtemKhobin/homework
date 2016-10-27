import java.util.Arrays;

class Book {
	private String name;
	private String id;
	
	private Author[] author;
	private String publishing;

	private String[] genre;	
	private double rating;
	
	private double prize;
	
	Book (String id) {
		this.id = id;
	}
	
	public String getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Author[] getAuthor() {
		return author;
	}
	
	public void setAuthor(Author[] author) {
		this.author = author;
	}
	
	public String getPublishing() {
		return publishing;
	}
	
	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}
	
	public String[] getGenre() {
		return genre;
	}
	
	public void setGenre(String[] genre) {
		this.genre = genre;
	}
	
	public double getRating() {
		return rating;
	}
	
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public double getPrize() {
		return prize;
	}
	
	public void setPrize(double prize) {
		this.prize = prize;
	}
	
	public String toString() {
		return name + ", " + toStringAuthor() + publishing;
	}
	
	public boolean equals(Object that) {
		if (this == that) return true;
		if (that == null) return false;
		if (this.getClass() != that.getClass()) return false;
		
		Book book = (Book)that;
		
		return id == book.id;
	}
		
	private String toStringAuthor() {
		String result = "";
		for (int i = 0; i < author.length; i++) {
			result += author[i].getName() + ", "; 
		}
		return result;
	}
}