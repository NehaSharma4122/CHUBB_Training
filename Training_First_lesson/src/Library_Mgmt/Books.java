package Library_Mgmt;

import java.util.List;

public class Books {
	private String book_id;
	private String b_name;
	private String author;
	private String book_code;
	private String genre;
	private boolean avail;
	public Books(String book_id, String b_name,String author, String book_code, String genre) {
		this.book_id = book_id;
		this.b_name = b_name;
		this.author = author;
		this.book_code = book_code;
		this.genre = genre;
		this.avail = true;
	}
	public String getBook_id() {
		return book_id;
	}
	public String getB_name() {
        return b_name;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getBook_code() {
        return book_code;
    }
    
    public String getGenre() {
        return genre;
    }
	public boolean matchesSearch(String word) {
		// TODO Auto-generated method stub
		return b_name.toLowerCase().contains(word.toLowerCase()) || author.toLowerCase().contains(word.toLowerCase()) || book_id.contains(word) || genre.toLowerCase().contains(word.toLowerCase());
	}
	public boolean isAvail() {
		return avail;
	}
	public void setAvail(boolean avail) {
		this.avail = avail;
	}
	
	@Override
    public String toString() {
        return "Book ID: " + book_id + ", Title: " + b_name + ", Author: " + author + 
               ", Genre: " + genre + ", Available: " + avail;
    }
	
	

}
