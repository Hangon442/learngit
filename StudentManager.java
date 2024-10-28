import java.util.HashMap;
import java.util.Map;

public class StudentManager {
    private Map<String, Integer> studentGrades;

    public StudentManager() {
        studentGrades = new HashMap<>();
    }

    // 添加学生及其成绩
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
    }

    // 获取学生成绩
    public Integer getGrade(String name) {
        return studentGrades.get(name);
    }

    // 新增：计算所有学生的平均成绩
    public double getAverageGrade() {
        if (studentGrades.isEmpty()) {
            return 0.0;
        }
        int total = 0;
        for (int grade : studentGrades.values()) {
            total += grade;
        }
        return (double) total / studentGrades.size();
    }
}
