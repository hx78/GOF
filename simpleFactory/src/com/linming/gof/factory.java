package com.linming.gof;

import java.util.Map;

/**
 * Created by linming on 2015/8/11 0011.
 */
public class Factory {

//    public IProduct createProduct(String s) {
//        if (s.equalsIgnoreCase("A")) {
//            return  new ProductA();
//        }
//        else if (s.equalsIgnoreCase("B")){
//            return new ProductB();
//        }
//        else {
//            return null;
//        }
//    }

    public IProduct createProduct(String key) {
        try {
            Map<String, String> map = new PropertiestUtils().getProperties();
            String className = map.get(key);
            if (className != null) {
                return (IProduct) Class.forName(map.get(key)).newInstance();
            }
            else {
                return null;
            }


        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
