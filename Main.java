public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // 添加几个学生的成绩
        manager.addStudent("Alice", 85);
        manager.addStudent("Bob", 90);

        // 查询学生的成绩
        System.out.println("Alice的成绩: " + manager.getGrade("Alice"));
        System.out.println("Bob的成绩: " + manager.getGrade("Bob"));
    }
}
