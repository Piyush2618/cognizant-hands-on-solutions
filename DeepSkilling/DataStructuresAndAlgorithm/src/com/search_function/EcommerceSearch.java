package com.search_function;

public class EcommerceSearch {
    public static Product linearSearch(Product[] p, int id) {

        for (Product product : p) {

            if (product.productId == id) {
                return product;
            }
        }

        return null;
    }

   
    public static Product binarySearch(Product[] p, int id) {

        int l = 0;
        int r = p.length - 1;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (p[mid].productId == id) {
                return p[mid];
            }

            if (p[mid].productId < id) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return null;
    }
}