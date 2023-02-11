package shopProject.items;

public class Racket extends Product{
    private String brand;
    private String type;
    public Racket(double price,double weight, String brand,String type){
        super(price,weight);
        this.brand = brand;
        this.type = type;
    }
    public String getBrand() {
        return this.brand;
    }
    public String getType() {
        return this.type;
    }
}
