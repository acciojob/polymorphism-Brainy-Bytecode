package com.driver;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Product p=new Product();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        p.product(x, y);

        int z=sc.nextInt();
        p.product(x, y, z);

        double a=sc.nextDouble();
        double b=sc.nextDouble();
        p.product(a, b);
    }
}

class Product {

    public int product(int x, int y) {
       return 0;
    }

    public int product(int x, int y, int z) {
       return 0;
    }

    public double product(double x, double y) {
       return 0;
    }
}