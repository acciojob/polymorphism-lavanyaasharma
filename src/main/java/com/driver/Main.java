package com.driver;

public class Main {

    // Task 1: Create Product class inside Main
    static class Product {

        // Task 3
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4 (Overloaded)
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5 (Overloaded)
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {

        // Task 2: Create object p
        Product p = new Product();

        // Calling all overloaded methods
        System.out.println(p.product(2, 3));          // int, int
        System.out.println(p.product(2, 3, 4));       // int, int, int
        System.out.println(p.product(2.5, 3.5));      // double, double
    }
}
