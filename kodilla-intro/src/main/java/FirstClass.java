public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(1, 1000);
        System.out.println("Weight is: " + notebook.weight + " Price is: " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();

        Notebook heavyNotebook = new Notebook(9, 1500);
        System.out.println("Weight is: " + heavyNotebook.weight + " Price is: " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();

        Notebook oldNotebook = new Notebook(4, 500);
        System.out.println("Weight is: " + oldNotebook.weight + " Price is: " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();

    }
}