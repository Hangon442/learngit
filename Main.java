public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // 添加学生成绩
        manager.addStudent("Alice", 85);
        manager.addStudent("Bob", 90);
        manager.addStudent("Charlie", 78);

        // 查询学生成绩
        System.out.println("Alice的成绩: " + manager.getGrade("Alice"));
        System.out.println("Bob的成绩: " + manager.getGrade("Bob"));

        // 这里假设李四修改了Main Class,方便后续添加新的功能
        System.out.println("所有学生的平均成绩: " + manager.getAverageGrade());
    }
}

