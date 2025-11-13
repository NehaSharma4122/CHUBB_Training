package Books;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Author> author = new ArrayList<>();
		author.add(new Author());
		BookDetails book = new BookDetails("101","Learning Java",author,"THM",EDITION.FIRST,200,new Date(),2910,GENRE.NON_FICTIONAL);
		System.out.println(book.getBook_name());
	}
}
