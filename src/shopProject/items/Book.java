package shopProject.items;

public class Book extends Product{
    private String title;
    private String ISBN;
    private String category;
    private int pages;

    public Book(double price, double weight,String title, String ISBN, String category, int pages){
        super( price, weight);
        this.title = title;
        this.ISBN = ISBN;
        this.category =category;
        this.pages = pages;
        }
    public String getTitle(){
        return this.title;}
    public String getISBN(){
        return this.ISBN;}
    public String getCategory(){
        return this.category;}
    public int getPages(int pages){
        return this.pages;
    }

}





