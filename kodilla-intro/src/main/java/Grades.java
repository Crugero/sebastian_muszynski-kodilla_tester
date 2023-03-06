public class Grades {
    private int[] grades;
    private int size;
    private int sum;

    public Grades() {
        grades = new int[10];
        size = 0;
    }

    public int add(int value) {
        if (size == 10) {
            System.out.println("Nie można dodać więcej ocen");
            return size;
        }
        grades[size] = value;
        size++;
        return size;
    }

    public int lastAddedGrade() {
        if (size == 0) {
            System.out.println("Nie dodano żadnej oceny");
            return 0;
        }
        int lastAdded = grades[size - 1];
        System.out.println("Ostatnio dodana ocena to " + lastAdded);
        return lastAdded;
    }

    private void sumGrades() {   //Suma
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        this.sum = sum;
    }

    public double averageGrades() {
        sumGrades();
        double average = (double)sum / size;
        System.out.println("Średnia ocen: " + average);
        return average;
    }
}