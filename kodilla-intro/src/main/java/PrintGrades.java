public class PrintGrades {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(5);
        grades.add(4);
        grades.averageGrades();
        grades.lastAddedGrade();
    }
}