package Library_Mgmt;

import java.util.*;
import java.time.*;

public class BorrowRecord extends Books {
	private String issue_date;
	private String return_date;
	private int overdue;
	
	public BorrowRecord(String book_id, String b_name, String author, String book_code, String genre, String issue_date,String return_date) {
		super(book_id, b_name, author, book_code, genre);
		this.issue_date = issue_date;
		this.return_date = return_date;
		this.overdue = 0;
	}
	public int fineAmt() {
		LocalDate currDate = LocalDate.now();
		LocalDate retDate = LocalDate.parse(return_date);
		if(currDate.isAfter(retDate)) {
			Period per = Period.between(currDate, retDate);
			int yrs = per.getYears();
			int mon = per.getMonths();
			int day = per.getDays();
			overdue = (yrs*365)+(mon*30)+day;
		}
		return overdue;
	}
	public void returnBook() {
		setAvail(true);
		return_date = LocalDate.now().toString();
		overdue = fineAmt();
	}
	public String getIssue_date() {
        return issue_date;
    }
    
    public String getReturn_date() {
        return return_date;
    }
    
    public int getOverdue() {
        return overdue;
    }
    @Override
    public String toString() {
        return "Book ID: " + getBook_id() + ", Issue Date: " + issue_date + 
               ", Return Date: " + return_date + ", Overdue Fine: ₹" + overdue;
    }
}
	
	

