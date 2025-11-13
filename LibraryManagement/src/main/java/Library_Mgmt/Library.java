package Library_Mgmt;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Records records = new Records();
        
        System.out.println("=== WELCOME TO LIBRARY MANAGEMENT SYSTEM ===");
        
        while (true) {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Book Management");
            System.out.println("2. Member Management");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Books");
            System.out.println("6. View Reports");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            int mainChoice = getIntInput(scanner);
            
            switch (mainChoice) {
                case 1:
                    bookManagement(scanner, records);
                    break;
                case 2:
                    memberManagement(scanner, records);
                    break;
                case 3:
                    borrowBookMenu(scanner, records);
                    break;
                case 4:
                    returnBookMenu(scanner, records);
                    break;
                case 5:
                    searchBooksMenu(scanner, records);
                    break;
                case 6:
                    viewReportsMenu(scanner, records);
                    break;
                case 7:
                    System.out.println("Thank you for using Library Management System!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
    
    private static void bookManagement(Scanner scanner, Records records) {
        while (true) {
            System.out.println("\n=== BOOK MANAGEMENT ===");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. View All Books");
            System.out.println("4. View Available Books");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");
            
            int choice = getIntInput(scanner);
            
            switch (choice) {
                case 1:
                    addBook(scanner, records);
                    break;
                case 2:
                    removeBook(scanner, records);
                    break;
                case 3:
                    records.displayAllBooks();
                    break;
                case 4:
                    records.displayAvailableBooks();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
    
    private static void memberManagement(Scanner scanner, Records records) {
        while (true) {
            System.out.println("\n=== MEMBER MANAGEMENT ===");
            System.out.println("1. Add Member");
            System.out.println("2. Remove Member");
            System.out.println("3. View All Members");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter your choice: ");
            
            int choice = getIntInput(scanner);
            
            switch (choice) {
                case 1:
                    addMember(scanner, records);
                    break;
                case 2:
                    removeMember(scanner, records);
                    break;
                case 3:
                    records.displayAllMembers();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
    
    private static void borrowBookMenu(Scanner scanner, Records records) {
        System.out.println("\n=== BORROW BOOK ===");
        System.out.print("Enter Member Card Number: ");
        String cardNo = scanner.nextLine();
        System.out.print("Enter Book ID to borrow: ");
        String bookId = scanner.nextLine();
        
        records.borrowBook(cardNo, bookId);
    }
    
    private static void returnBookMenu(Scanner scanner, Records records) {
        System.out.println("\n=== RETURN BOOK ===");
        System.out.print("Enter Member Card Number: ");
        String cardNo = scanner.nextLine();
        System.out.print("Enter Book ID to return: ");
        String bookId = scanner.nextLine();
        
        records.returnBook(cardNo, bookId);
    }
    
    private static void searchBooksMenu(Scanner scanner, Records records) {
        System.out.println("\n=== SEARCH BOOKS ===");
        System.out.print("Enter search keyword (title, author, genre, or ID): ");
        String keyword = scanner.nextLine();
        
        var results = records.searchBooks(keyword);
        if (results.isEmpty()) {
            System.out.println("No books found matching: " + keyword);
        } else {
            System.out.println("Search Results:");
            results.forEach(System.out::println);
        }
    }
    
    private static void viewReportsMenu(Scanner scanner, Records records) {
        while (true) {
            System.out.println("\n=== VIEW REPORTS ===");
            System.out.println("1. View All Books");
            System.out.println("2. View Available Books");
            System.out.println("3. View All Members");
            System.out.println("4. View Borrowed Books");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");
            
            int choice = getIntInput(scanner);
            
            switch (choice) {
                case 1:
                    records.displayAllBooks();
                    break;
                case 2:
                    records.displayAvailableBooks();
                    break;
                case 3:
                    records.displayAllMembers();
                    break;
                case 4:
                    records.displayBorrowedBooks();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
    
    private static void addBook(Scanner scanner, Records records) {
        System.out.println("\n=== ADD NEW BOOK ===");
        System.out.print("Enter Book ID: ");
        String bookId = scanner.nextLine();
        scanner.next();
        System.out.print("Enter Book Name: ");
        String bookName = scanner.nextLine();
        scanner.next();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        scanner.next();
        System.out.print("Enter Book Code: ");
        String bookCode = scanner.nextLine();
        scanner.next();
        System.out.print("Enter Genre: ");
        String genre = scanner.nextLine();
        scanner.next();
        
        if (records.findBook(bookId) != null) {
            System.out.println("Book with ID " + bookId + " already exists!");
            return;
        }
        
        Books book = new Books(bookId, bookName, author, bookCode, genre);
        records.addBooks(book);
    }
    
    private static void removeBook(Scanner scanner, Records records) {
        System.out.println("\n=== REMOVE BOOK ===");
        System.out.print("Enter Book ID to remove: ");
        String bookId = scanner.nextLine();
        
        records.removeBook(bookId);
    }
    
    private static void addMember(Scanner scanner, Records records) {
        System.out.println("\n=== ADD NEW MEMBER ===");
        System.out.print("Enter Member ID: ");
        int id = getIntInput(scanner);
        scanner.nextLine(); 
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Card Number: ");
        String cardNo = scanner.nextLine();
        System.out.print("Enter Expiration Date (YYYY-MM-DD): ");
        String expDate = scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        
        if (records.findMember(cardNo) != null) {
            System.out.println("Member with card number " + cardNo + " already exists!");
            return;
        }
        
        Members member = new Members(id, name, cardNo, expDate, phone, email);
        records.addMember(member);
    }
    
    private static void removeMember(Scanner scanner, Records records) {
        System.out.println("\n=== REMOVE MEMBER ===");
        System.out.print("Enter Member Card Number to remove: ");
        String cardNo = scanner.nextLine();
        
        records.removeMember(cardNo);
    }
    
    private static int getIntInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.print("Invalid input! Please enter a number: ");
                scanner.nextLine(); 
            }
        }
    }
}