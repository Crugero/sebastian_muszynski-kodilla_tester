public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(1, 1000, 2019);
        Notebook oldNotebook = new Notebook(4, 500, 2017);

        getNotebookInfo(notebook);
        getNotebookInfo(oldNotebook);
    }

    public static void getNotebookInfo (Notebook notebook) {
        System.out.println("Weight is: " + notebook.weight + " Price is: " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkPriceStability();
    }
}