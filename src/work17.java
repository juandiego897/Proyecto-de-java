import java.util.HashMap;
import java.util.Map;
public class work17 {
    public static void main(String[] args) {
        HashMap<String, int[]> studentGrades = new HashMap<>();

        studentGrades.put("sara", new int[]{90, 85, 88});
        studentGrades.put("pablo", new int[]{75, 82, 80});
        studentGrades.put("hector", new int[]{95, 88, 92});

        calculateAndDisplayGPA(studentGrades);
    }

    public static void calculateAndDisplayGPA(HashMap<String, int[]> studentGrades) {
        for (Map.Entry<String, int[]> entry : studentGrades.entrySet()) {
            String studentName = entry.getKey();
            int[] grades = entry.getValue();

            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }

            double gpa = (double) sum / grades.length;

            System.out.println("GPA of " + studentName + ": " + gpa);
        }
    }
}

