package com.search_function;

import static com.search_function.EcommerceSearch.binarySearch;
import static com.search_function.EcommerceSearch.linearSearch;
import java.util.Arrays;
import java.util.Comparator;

public class SearchFunctionImplement {
    public static void run()
    {
        Product[] products = {

                new Product(105, "Keyboard", "Accessories"),
                new Product(101, "Laptop", "Electronics"),
                new Product(104, "Mouse", "Accessories"),
                new Product(102, "Smartphone", "Electronics"),
                new Product(103, "Headphones", "Audio")

        };

        int searchId = 103;

        System.out.println("LINEAR SEARCH:- ");

        Product res1 = linearSearch(products, searchId);

        if (res1 != null) {
            System.out.println("Product Found");
            res1.display();
        } else {
            System.out.println("Product Not Found");
        }

       
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        System.out.println("\n BINARY SEARCH:-");

        Product res2 = binarySearch(products, searchId);

        if (res2 != null) {
            System.out.println("Product Found");
            res2.display();
        } else {
            System.out.println("Product Not Found");
        }
    }

}
