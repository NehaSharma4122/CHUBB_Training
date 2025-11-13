package StudentGradeTracker;

public class Course {
    private String courseId;
    private String courseName;
    private int credits;
    private String grade;
    
    public Course(String courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.grade = null;
    }
    
    public double getGradePoint() {
        if (grade == null) return 0.0;
        
        switch (grade.toUpperCase()) {
            case "A": return 4.0;
            case "A-": return 3.7;
            case "B+": return 3.3;
            case "B": return 3.0;
            case "B-": return 2.7;
            case "C+": return 2.3;
            case "C": return 2.0;
            case "D": return 1.0;
            case "F": return 0.0;
            default: return 0.0;
        }
    }
    
    public String getCourseId() { 
    	return courseId; 
    }
    public void setCourseId(String courseId) { this.courseId = courseId; }
    
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
    
    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }
    
    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
    
    @Override
    public String toString() {
        return String.format("Course: %s (%s) - Credits: %d - Grade: %s", 
                           courseName, courseId, credits, grade != null ? grade : "Not Graded");
    }
}