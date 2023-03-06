public class testYr {
    public static void main(String[] args) {
        int year = 2001;
        boolean isLeap = true;

        if (year % 4 > 0) {
            isLeap = false;
        } else if (year % 100 > 0) {
            isLeap = true;
        } else if (year % 400 > 0) {
            isLeap = false;
        } else {
            isLeap = true;
        }

        if (isLeap) {
            System.out.println("Rok przestępca");
        } else {
            System.out.println("Rok nie przestępca");
        }
    }
}




