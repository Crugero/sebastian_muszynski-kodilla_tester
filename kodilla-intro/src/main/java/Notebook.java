public class Notebook {
    int weight;
    int price;

    public Notebook(int weight, int price){
        this.weight = weight;
        this.price = price;

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

}
