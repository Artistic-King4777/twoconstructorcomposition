package books;

public class Book {

    private String name;
    private Author author;
    private double price;
    private int quantity;


    public Book(String name, Author author, double price, int quantity){
        this.author = author;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    private double getInvoice(){
        return getQuantity() * getPrice() ;
    }

    public void invoiceFrom(){
        System.out.println(getAuthor().createBookEmail().replaceAll("\\s", "").toLowerCase() +
                " Sent you an invoice for $" + getInvoice());
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=Author" + author +
                ", price= $" + price +
                ", quantity=" + quantity +
                '}';
    }


}
