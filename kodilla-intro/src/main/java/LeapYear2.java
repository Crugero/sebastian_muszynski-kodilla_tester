public class LeapYear2 {
    public static void main(String[] args) {
        boolean result = przestepczyRok(2000);
        System.out.println(result);
    }
    private static boolean przestepczyRok(int year) {
        if (year % 4 > 0) {
            return false;
        } else if (year % 100 > 0) {
            return true;
        } else if (year % 400 > 0) {
            return false;
        } else {
            return true;
        }
    }
}