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
}