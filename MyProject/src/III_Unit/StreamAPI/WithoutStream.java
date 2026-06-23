package III_Unit.StreamAPI;

import java.util.ArrayList;
import java.util.List;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class WithoutStream {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 55000));
        productsList.add(new Product(2, "Dell Laptop", 50000));
        productsList.add(new Product(3, "Lenovo Laptop", 38000));
        productsList.add(new Product(4, "Sony Laptop", 68000));
        productsList.add(new Product(5, "Apple Laptop", 110000));

        // Without using Stream
        // We create a list to store price of products
        List<Float> productPriceList = new ArrayList<Float>();

        for (Product product : productsList) {
            // Food for thought: this will generate error
            // System.out.println(typeof(product.price));

            // filtering data of list
            if (product.price < 60000) {
                // adding price to a productPriceList
                productPriceList.add(product.price);
            }
        }
        // displaying data
        System.out.println(productPriceList);
        // print 2nd Time
        // System.out.println(productPriceList);
        // print 3rd Time
        // System.out.println(productPriceList);
        // print 4th Time
        // System.out.println(productPriceList);
    }
}