import java.util.Arrays;

public class Grades {
    private int[] grades;
    private int size;
    private int sum;
    public Grades() {
        grades = new int[10];
        size = 0;
    }
    //public void add(int value) {           //A to nic nie zwraca, bo jest void? :/ Po co this. przy każdej zmiennej jak jest tylko 1 o tej nazwie?
    //   if (this.size == 10) {
    //       return;
    //   }
    //  this.grades[this.size] = value;
    //   this.size++;
    //}
    public int add(int value) {           //Moje ADD
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
        int lastAdded = grades[size - 1]; //tu jest coś skopane chyba
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
    public double averageGrades() {   //Średnia - osobna metoda wywołująca sumę? Działa
        sumGrades();
        double average = (double)sum / size;
        System.out.println("Średnia ocen: " + average);
        return average;
    }
}