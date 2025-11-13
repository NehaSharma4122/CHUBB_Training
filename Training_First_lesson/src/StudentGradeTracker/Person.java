package StudentGradeTracker;

import java.time.*;

public abstract class Person {
	protected String id;
    protected String name;
    protected String email;
    protected LocalDate dateOfBirth;
    
    public Person(String id, String name, String email, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }
    
    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    
    public abstract void displayInfo();
    
    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Email: %s, DOB: %s", 
                           id, name, email, dateOfBirth);
    }
}
