package epam.tam2019.products;

import java.time.OffsetDateTime;

public class Food extends Product {


    OffsetDateTime shelfDate;

    @Override
    public String toString() {
        return name + super.toString();
    }

    public Food(String productTitle, double productPrice) {
        this(productTitle, productPrice, OffsetDateTime.now().plusDays(5));
    }

    public Food(String productTitle, double productPrice, OffsetDateTime shelfDate) {
        super(productTitle, productPrice);
        this.shelfDate = shelfDate;
    }


    public OffsetDateTime getShelfDate() {
        return shelfDate;
    }

    public void setShelfDate(OffsetDateTime shelfDate) {
        this.shelfDate = shelfDate;
    }


}
