public class LeapYear2 {
    public static void main(String[] args) {
        boolean result = przestepczyRok(2000);
        System.out.println(result);

    }

    private static boolean przestepczyRok(int year) {
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
        return isLeap;

    }
}



