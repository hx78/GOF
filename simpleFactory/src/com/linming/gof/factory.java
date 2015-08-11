package com.linming.gof;

/**
 * Created by linming on 2015/8/11 0011.
 */
public class Factory {

    public IProduct createProduct(String s) {
        if (s.equalsIgnoreCase("A")) {
            return  new ProductA();
        }
        else if (s.equalsIgnoreCase("B")){
            return new ProductB();
        }
        else {
            return null;
        }
    }
}
