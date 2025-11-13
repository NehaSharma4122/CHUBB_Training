package StudentGradeTracker;
import java.util.Arrays;
import java.util.List;

public class GradeValidator {
    private static final List<String> VALID_GRADES = 
        Arrays.asList("A", "A-", "B+", "B", "B-", "C+", "C", "D", "F");
    
    public static boolean isValidGrade(String grade) {
        return grade != null && VALID_GRADES.contains(grade.toUpperCase());
    }
    
    public static List<String> getValidGrades() {
        return VALID_GRADES;
    }
}
