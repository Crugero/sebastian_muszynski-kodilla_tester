import java.util.Scanner;
public class LetterPrompt {

    public static String getLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Considering I only know few colors starting with W, B or G please enter the first letter of your favorite one:");
        String lett = scanner.nextLine();
        return lett;
    }

    public static String lastLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("There are few colors for this letter, please enter the first and last letter:");
        String last = scanner.nextLine();
        return last;
    }

    public static String probablyFemale() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are You a female? Y = yes, N = no");
        String checker = scanner.nextLine();
        return checker;
    }
}
