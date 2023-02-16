public class Application {
    public static void main(String[] args) {
        Human adas = new Human("Adam",20, 120 );
        Human bartek = new Human("Bartosz", 32, 162);

        adas.checkAgeAndHeight();
        bartek.checkAgeAndHeight();
    }
}