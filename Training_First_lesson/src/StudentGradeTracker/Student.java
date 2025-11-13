package StudentGradeTracker;

import java.time.LocalDate;
import java.util.*;

public class Student extends Person {
    private String major;
    private int semester;
    private Map<String, Course> courses; // Course ID -> Course object
    
    public Student(String id, String name, String email, LocalDate dateOfBirth, 
                   String major, int semester) {
        super(id, name, email, dateOfBirth);
        this.major = major;
        this.semester = semester;
        this.courses = new HashMap<>();
    }
    
    public void addCourse(Course course) {
        courses.put(course.getCourseId(), course);
    }
    
    public boolean removeCourse(String courseId) {
        return courses.remove(courseId) != null;
    }
    
    public Course getCourse(String courseId) {
        return courses.get(courseId);
    }
    
    public Collection<Course> getAllCourses() {
        return courses.values();
    }
    
    public double calculateOverallGPA() {
        if (courses.isEmpty()) return 0.0;
        
        double totalPoints = 0.0;
        int totalCredits = 0;
        
        for (Course course : courses.values()) {
            if (course.getGrade() != null) {
                totalPoints += course.getGradePoint() * course.getCredits();
                totalCredits += course.getCredits();
            }
        }
        
        return totalCredits > 0 ? totalPoints / totalCredits : 0.0;
    }
    
    public Map<String, String> getGradeSummary() {
        Map<String, String> summary = new HashMap<>();
        for (Course course : courses.values()) {
            summary.put(course.getCourseName(), 
                       course.getGrade() != null ? course.getGrade() : "No Grade");
        }
        return summary;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("=== Student Information ===");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Major: " + major);
        System.out.println("Semester: " + semester);
        System.out.printf("Overall GPA: %.2f\n", calculateOverallGPA());
    }
    
    // Getters and setters
    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }
    
    public int getSemester() { return semester; }
    public void setSemester(int semester) { this.semester = semester; }
    
    public Map<String, Course> getCourses() { return courses; }
}