package Library_Mgmt;

import java.util.*;

public class Members {
	private int id;
	private String name;
	private String card_no;
	private String expiration_date;
	private String phone;
	private String email;
	private List<BorrowRecord> borrowBooks;
	private int maxAllowed;
	public Members(int id,String name, String card_no,String expiration_date,String phone,String email){
		this.id = id;
		this.name = name;
		this.card_no = card_no;
		this.expiration_date = expiration_date;
		this.email= email;
		this.phone = phone;
		this.maxAllowed = 5;
		this.borrowBooks = new ArrayList<>();
	}
	public void display() {
		System.out.println("ID:"+id+"\nName:"+name+"\nCard No.:"+card_no+"\nExpiration Date:"+expiration_date+"\nPhone No.:"+phone+"\nEmail:"+email+"\nBooks borrowed:"+borrowBooks.size());
		if(!borrowBooks.isEmpty()) {
			System.out.println("Borrowed Books:");
			for(BorrowRecord record:borrowBooks) {
				System.out.println("  - " + record.getBook_id() + " (Due: " + record.getReturn_date() + ")");
			}
		}
	}
	public boolean canBorrow() {
		return borrowBooks.size()<maxAllowed;
	}
	public void addBorrow(BorrowRecord book) {
		if(canBorrow() && book.isAvail()) {
			borrowBooks.add(book);
			book.setAvail(false);			
		}
	}
	public void returnBorrow(String bid) {
		Iterator<BorrowRecord> iterator = borrowBooks.iterator();
        boolean found = false;
        
        while (iterator.hasNext()) {
            BorrowRecord b = iterator.next();
            if (b.getBook_id().equalsIgnoreCase(bid)) {
                b.returnBook();
                iterator.remove();
                found = true;
                System.out.println("Book returned successfully: " + bid);
                break;
            }
        }
        
        if (!found) {
            System.out.println("No such book borrowed. Invalid Book ID: " + bid);
        }
	}
	public List<BorrowRecord> getBorrowedBooks(){
		return new ArrayList<>(borrowBooks);
	}
	public String getCardNo() {
		return card_no;
	}
	
}
