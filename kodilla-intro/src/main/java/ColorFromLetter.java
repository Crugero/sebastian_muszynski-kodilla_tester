public class ColorFromLetter {
    public static void main(String[] args) {
        findColor();
    }

    public static String findColor() {
        String userSelected = LetterPrompt.getLetter();
        String result;
        Boolean didUseDefault = false;
        switch (userSelected) {
            case "W":
                result = "white";
                break;
            case "B":
                String moreLetters = LetterPrompt.lastLetter();
                switch (moreLetters) {
                    case "BN":
                        result = "brown";
                        break;
                    case "BE":
                        result = "blue";
                        break;
                    case "BK":
                        result = "black";
                        break;
                    default:
                        result = "probably black, great color :->";
                        break;
                }
                break;
            case "G":
                result = "green";
                break;
            default:
                didUseDefault = true;
                String femaleChecker = LetterPrompt.probablyFemale();
                switch (femaleChecker) {
                    case "Y":
                        result = "I knew it! You just can't decide huh?";
                        break;
                    case "N":
                        result = "You just lied to me :->";
                        break;
                    default:
                        result = "You just can't decide, huh?";
                        break;
                }
                break;
        }
        if (didUseDefault) {
            System.out.println(result);
        } else {
            System.out.println("My guess is: " + result);
        }
        return result;
    }
}