package com.driver;


public class Main {

    static class Product {

        public static int product(int x, int y) {

            return x*y;
        }

        public static int product(int x, int y, int z) {

            return x*y*z;
        }

        public static double product(double x, double y) {

            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p=new Product();

        p.product(5, 10);
        p.product(5, 10, 2);
        p.product(2.5, 2.0);
    }
}



