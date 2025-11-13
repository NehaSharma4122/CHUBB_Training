package Books;

import java.util.Date;
import java.util.List;

public class BookDetails {
	private String book_id;
	private String book_name;
	private List<Author> authors; //Has a relationship, composition
	private String publishers;
	private EDITION edition;
	private int num_pages;
	private Date date_of_printing;
	private float price;
	private GENRE genre;
	public BookDetails(String book_id, String book_name, List<Author> authors, String publishers, EDITION edition,
			int num_pages, Date date_of_printing, float price, GENRE genre) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.authors = authors;
		this.publishers = publishers;
		this.edition = edition;
		this.num_pages = num_pages;
		this.date_of_printing = date_of_printing;
		this.price = price;
		this.genre = genre;
	}
	public String getBook_id() {
		return book_id;
	}
	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	public String getPublishers() {
		return publishers;
	}
	public void setPublishers(String publishers) {
		this.publishers = publishers;
	}
	public EDITION getEdition() {
		return edition;
	}
	public void setEdition(EDITION edition) {
		this.edition = edition;
	}
	public int getNum_pages() {
		return num_pages;
	}
	public void setNum_pages(int num_pages) {
		this.num_pages = num_pages;
	}
	public Date getDate_of_printing() {
		return date_of_printing;
	}
	public void setDate_of_printing(Date date_of_printing) {
		this.date_of_printing = date_of_printing;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public GENRE getGenre() {
		return genre;
	}
	public void setGenre(GENRE genre) {
		this.genre = genre;
	}
	
}
