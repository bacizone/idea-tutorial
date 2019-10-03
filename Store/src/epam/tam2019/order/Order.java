package epam.tam2019.order;

import epam.tam2019.discounts.Discount;
import epam.tam2019.products.Product;

import java.util.ArrayList;

public class Order implements Discount {

    private ArrayList<OrderItem> list = new ArrayList<OrderItem>();

    private Order(ArrayList<OrderItem> list) {
        this.list = list;
    }


    /*
    Adds an orderItem element to orderItem list
     */
    private void addItem(Product product, int quantity) {
        if (product == null) {
            throw new NullPointerException("Product can not be a null");
        }

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity can not be negative");
        }

        OrderItem orderItem = new OrderItem(product.getName(), product.getPrice(), quantity);
        list.add(orderItem);


    }

    /*
    returns the sum of the order item amounts
    */
//    private calculateOrderTotal() {
//        for (int i = 0; i < list.size(); i++) {
//
//        }
//
//    }
//
//
//    private printItems() {
//
//    }


}
