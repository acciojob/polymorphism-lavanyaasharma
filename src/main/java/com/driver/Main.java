package com.driver;

public class Main {

    // Product class inside Main
    static class Product {

        // Method with 2 int parameters
        public int product(int x, int y) {
            return x * y;
        }

        // Overloaded method with 3 int parameters
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Overloaded method with double parameters
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {

        // Object creation
        Product p = new Product();

        // Calling overloaded methods
        System.out.println(p.product(2, 3));
        System.out.println(p.product(2, 3, 4));
        System.out.println(p.product(2.5, 3.5));
    }
}
