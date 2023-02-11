package shopProject.items;

public class DVD extends Product{
    private String title;
    private String category;
    private double time;
    public DVD(double price, double weight, String title,String category, double time){
        super(price,weight);
        this.title = title;
        this.category = category;
        this.time= time;
    }
    public String getTitle() {
        return this.title;
    }
    public String getCategory(){
        return this.category;
    }
    public double getTime(){
        return this.time;
    }
}
