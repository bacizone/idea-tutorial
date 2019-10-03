package epam.tam2019.products;


public class Book extends Product {

    private String author;

    @Override
    public String toString() {
        return super.toString();
    }

    public Book(String productTitle, double productPrice) {
        this("No Author", productTitle, productPrice);
    }

    public Book(String bookAuthor, String productTitle, double productPrice) {
        super(productTitle, productPrice);
        this.author = bookAuthor;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}