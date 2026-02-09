package homework001.exercises.bookstore;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book (){}

    public Book (String name, Author author, double price, int qty){
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (author == null) {
            throw new IllegalArgumentException("Author cannot be null");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        if (qty < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public int getQty(){
        return qty;
    }

    public void setPrice(double price){
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public void setQty(int qty){
        if (qty < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.qty = qty;
    }

    public String toString(){
        return "Book[name=" + name + ", author=" + author + ", price=" + price + ", qty=" + qty + "]";
    }
}

