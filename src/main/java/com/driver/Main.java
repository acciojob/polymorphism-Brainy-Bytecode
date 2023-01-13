package com.driver;

import java.util.Scanner;

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
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.print(p.product(x, y));

        int z=sc.nextInt();
        System.out.println(p.product(x, y, z));

        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.print(p.product(a, b));
    }
}



