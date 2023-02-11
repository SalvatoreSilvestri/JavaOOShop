package shopProject.items;
import java.util.ArrayList;

public class Shop {

    static ArrayList<Product> tot = new ArrayList<Product>();
    static ArrayList<Racket> specialracket = new ArrayList<Racket>();

    public static void main(String[] args) {
        Book a1 = new Book(15, 1, "Harry Potter", "2342342342345", "fantasy", 304);
        Book a2 = new Book(12, 2, "Moby Dick", "1234567891234,", "adventure", 798);
        Book a3 = new Book(20, 1, "the Hobbit", "0283746374893", "fantasy", 438);
        Book a4 = new Book(11,2 , "Zanna Bianca", "6454647464647", "adventure", 234);
        DVD b1 = new DVD(20, 2, "Star Wars", "shi-fi", 130);
        DVD b2 = new DVD(15, 2, "La carica dei e 101", "family", 120);
        Racket c1 = new Racket(101, 33, "BlackCrown", "goccia");
        Racket c2 = new Racket(131, 40, "Adidas", "diamante");
        Racket c3 = new Racket(70, 33, "Dropshot", "rotonda");
        Racket c4 = new Racket(130, 32, "Nike", "goccia");
        tot.add(a1);
        tot.add(a2);
        tot.add(a3);
        tot.add(a4);
        tot.add(b1);
        tot.add(b2);
        tot.add(c1);
        tot.add(c2);
        tot.add(c3);
        tot.add(c4);


        System.out.println(countProduct());
        System.out.println(sumWeight());
        System.out.println(howMf());
        System.out.println(moreExpa());
        addSpecialR();
    }

    public static int countProduct() {
        return tot.size();
    }
    public static double sumWeight() {
        double x = 0;
        for (Product p : tot) {
            x += p.getWeight();
        }
        return x;
    }
    public static void addProduct(Product x) {
        tot.add(x);
    }
    public static int howMf() {
        int numf = 0;
        for (Product p : tot) {
            if (p instanceof Book) {
                Book b = (Book) p;
                if (b.getCategory().equalsIgnoreCase("fantasy")) {
                    numf += 1;
                }
            }
        }
        return numf;
    }
    public static double moreExpa(){
        double x = 0;
        for (Product p : tot ){
            if(p.getPrice() > x){
                x = p.getPrice();
            }
        }
        return x;
    }
    public static void addSpecialR(){
        for (Product p : tot){
            if (p instanceof Racket){
                Racket r = (Racket) p;
                if(r.getType().equalsIgnoreCase("goccia")&& r.getPrice()>100)
                    specialracket.add(r);
            }
        }for (Racket ra : specialracket){
            if(ra instanceof Racket){
                Racket xa = (Racket) ra;
                System.out.println(xa.getBrand());
            }
        }
    }
}




