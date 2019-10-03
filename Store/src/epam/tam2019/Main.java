package epam.tam2019;

import epam.tam2019.discounts.Discount;
import epam.tam2019.order.Order;
import epam.tam2019.order.OrderItem;
import epam.tam2019.products.Book;
import epam.tam2019.products.Product;


import java.util.HashMap;

public class Main {

    static HashMap<String, Discount> popularDiscounts = new HashMap<>();

    public static void main(String[] args) {

        OrderItem orderArticle = new OrderItem("Excalibur", 12, 2);

        System.out.println(orderArticle.toString());



        //
        //Product myFavouriteBook = new Book("Ken Follet", "Via Mala", 31.0);
//        OrderItem itemApple = new OrderItem(

    }

}

