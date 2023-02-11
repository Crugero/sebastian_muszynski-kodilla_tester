public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice(){
        if (this.price < 600){
            System.out.println("This notebook is cheap");
        }
        else if (this.price >= 600 && this.price <= 1000){
            System.out.println("The price is good");
            }
        else{
            System.out.println("This notebook is quite expensive");
        }
    }

    public void checkWeight(){
        if (this.weight < 2){
            System.out.println("This notebook seems strangely light");
        }
        else if (this.weight >= 2 && this.weight <= 5){
            System.out.println("This notebook has good weight");
        }
        else{
            System.out.println("This notebook is too heavy");
        }
    }
    public void checkPriceStability(){
        if (this.price < 500 && this.year > 2020 && this.year < 2024){
            System.out.println("This notebook got cheap quickly");
        }
        else if (this.price >= 500 && this.price < 1000 && this.year <= 2020){
            System.out.println("This notebook keeps it's price very well");
        }
        else if (this.price >= 1000 && this.year > 2020 && this.year < 2024) {
            System.out.println("This notebook has good price for it's production year");
        }
        else if (this.price >= 1000 && this.year < 2020) {
            System.out.println("This notebook can be considered as great investment!");
        }
        else if (this.year > 2023) {
            System.out.println("Hey, are You from the future?");
        }
        else{
            System.out.println("It's hard to tell anything about the price considering this production year");
        }
    }

}
