public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(1, 1000, 2019);
        System.out.println("Weight is: " + notebook.weight + " Price is: " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkPriceStability();

        Notebook heavyNotebook = new Notebook(9, 1500, 2024);
        System.out.println("Weight is: " + heavyNotebook.weight + " Price is: " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkPriceStability();

        Notebook oldNotebook = new Notebook(4, 500, 2017);
        System.out.println("Weight is: " + oldNotebook.weight + " Price is: " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkPriceStability();

    }
}