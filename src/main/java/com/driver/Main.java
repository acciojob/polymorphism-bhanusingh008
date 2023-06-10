package com.driver;

public class Main {
  public static void main(String[] args) {

        Product p = new Product();

        p.product(2, 4);
        p.product(2.00, 5.87);
        p.product(2,4,5);
    }

    static public class Product{

        public int product(int x, int y){
            return x*y;
        }

        public int product(int x, int y, int z){
            return x*(y*z);
        }

        public double product(double x, double y){
            return (x*y);
        }
    }
}
