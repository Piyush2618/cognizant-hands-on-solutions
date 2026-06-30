package com.search_function;

public class Product {
    int productId;
    String productName;
    String category;

    public Product(int pid, String pname, String category) {
        this.productId = pid;
        this.productName = pname;
        this.category = category;
    }

    public void display() {
        
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Category     : " + category);
    }
}
