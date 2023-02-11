package shopProject.items;

public abstract class Product {

    private double price;
    private double weight;
    public Product(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }
    public double getPrice(){
        return this.price;
    }
    public double getWeight(){
        return this.weight;
    }



}
