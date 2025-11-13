package Library_Mgmt;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Records {
	public List<Books> book;
	public List<Members> memb;
	public List<BorrowRecord> borrow;
	public Records() {
		this.book = new ArrayList<>();
		this.memb = new ArrayList<>();
		this.borrow = new ArrayList<>();
	}
	
	public void addBooks(Books b) {
		book.add(b);
		System.out.println("Book added: "+book);
	}
	public void removeBook(String b_id) {
		book.removeIf(b -> b.getBook_id().equalsIgnoreCase(b_id));
		System.out.println("Book removed:"+b_id);
	}
	public Books findBook(String b_id) {
		return book.stream().filter(b->b.getBook_id().equalsIgnoreCase(b_id)).findFirst().orElse(null);
	}
	public List<Books> searchBooks(String word){
		return book.stream().filter(b->b.matchesSearch(word)).collect(Collectors.toList());
	}
	public List<Books> availableBooks() {
        return book.stream()
                .filter(Books::isAvail)
                .collect(Collectors.toList());
    }
	public void addMember(Members mb) {
		memb.add(mb);
		System.out.println("Members added: "+memb);
	}
	public void removeMember(String card_no) {
		memb.removeIf(m->m.getCardNo().equalsIgnoreCase(card_no));
		System.out.println("Member Removed with card number: "+card_no);
	}
	public Members findMember(String card_no) {
		return memb.stream().filter(m->m.getCardNo().equalsIgnoreCase(card_no)).findFirst().orElse(null);
	}
	public boolean borrowBook(String card_no, String book_id) {
        Members member = findMember(card_no);
        Books book = findBook(book_id);
        
        if (member == null) {
            System.out.println("Member not found!");
            return false;
        }
        
        if (book == null) {
            System.out.println("Book not found!");
            return false;
        }
        
        if (!book.isAvail()) {
            System.out.println("Book is not available!");
            return false;
        }
        if (!member.canBorrow()) {
            System.out.println("Member cannot borrow more books!");
            return false;
        }
        
        LocalDate issueDate = LocalDate.now();
        LocalDate returnDate = issueDate.plusDays(14); // 2 weeks
        
        BorrowRecord record = new BorrowRecord(book_id, book.getB_name(), book.getAuthor(), 
                                             book.getBook_code(), book.getGenre(),
                                             issueDate.toString(), returnDate.toString());
        
        member.addBorrow(record);
        borrow.add(record);
        book.setAvail(false);
        System.out.println("Book borrowed successfully!");
        System.out.println("Return Date: " + returnDate);
        return true;
    }
	public boolean returnBook(String card_no, String book_id) {
        Members member = findMember(card_no);
        
        if (member == null) {
            System.out.println("Member not found!");
            return false;
        }
        
        member.returnBorrow(book_id);
        Books book = findBook(book_id);
        if (book != null) {
            book.setAvail(true);
        }
        borrow.removeIf(br -> br.getBook_id().equalsIgnoreCase(book_id));
        
        return true;
    }
    
    public void displayAllBooks() {
        System.out.println("\n=== ALL BOOKS ===");
        if (book.isEmpty()) {
            System.out.println("No books in library.");
        } else {
            book.forEach(System.out::println);
        }
    }
    
    public void displayAvailableBooks() {
        System.out.println("\n=== AVAILABLE BOOKS ===");
        List<Books> available = availableBooks();
        if (available.isEmpty()) {
            System.out.println("No books available.");
        } else {
            available.forEach(System.out::println);
        }
    }
    
    public void displayAllMembers() {
        System.out.println("\n=== ALL MEMBERS ===");
        if (memb.isEmpty()) {
            System.out.println("No members registered.");
        } else {
            memb.forEach(Members::display);
        }
    }
    public void displayBorrowedBooks() {
        System.out.println("\n=== BORROWED BOOKS ===");
        if (borrow.isEmpty()) {
            System.out.println("No books currently borrowed.");
        } else {
            borrow.forEach(System.out::println);
        }
    }
	
}
