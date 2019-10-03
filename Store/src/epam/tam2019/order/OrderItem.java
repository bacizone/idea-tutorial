package epam.tam2019.order;

public class OrderItem {

    private String name;
    private double price;
    private int quantity;
    private double discount;
    private double amount;

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", discount=" + discount +
                ", amount=" + amount +
                '}';
    }

    public OrderItem(String name, double price, int quantity) {
        this.name = name;
        this.discount = 0;
        this.quantity = quantity;
        this.price = price;
        this.amount = price * quantity;
    }

    private double recalculateAmount() {
        amount = quantity * price - discount;
        return amount;
    }


}

