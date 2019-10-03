package epam.tam2019.products;

public abstract class Product {

    String name;
    double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "You should never see this";
    }

    public Product(String productTitle, double productPrice) {

        if (productPrice < 0) {
            throw new IllegalArgumentException("Price can not be less than zero, you provided " + productPrice);

        } else {
            System.out.println("The title of the book is " + productTitle + ", its price is " + productPrice + " HUF");
        }

        this.name = productTitle;
        this.price = productPrice;

    }
}
