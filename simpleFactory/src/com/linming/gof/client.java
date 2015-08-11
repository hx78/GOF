package com.linming.gof;

/**
 * Created by linming on 2015/8/11 0011.
 */
public class client {

    public static void main(String args[]) {
        Factory factory = new Factory();
        IProduct product = factory.createProduct("c");
        if (product != null) {
            product.getName();
        }
        else {
            System.out.println("sorry, the factory can not create the product for now");
        }

    }
}
