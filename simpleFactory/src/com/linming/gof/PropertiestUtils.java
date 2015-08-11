package com.linming.gof;

import java.io.InputStream;
import java.util.*;

/**
 * Created by linming on 2015/8/11 0011.
 */
public class PropertiestUtils {
    public Map<String, String> getProperties() {
        Properties properties = new Properties();
        Map<String, String> map = new HashMap<String, String>();
        try {
            InputStream inputStream = getClass().getResourceAsStream("class.properties");
            if (inputStream != null) {
                properties.load(inputStream);
//                Enumeration enumeration = properties.propertyNames();
//                while (enumeration.hasMoreElements()) {
//                    String key = (String) enumeration.nextElement();
//                    String property = properties.getProperty(key);
//                    map.put(key, property);
//				    System.out.println(key + "  " + property);
//                }

//                Set set = properties.keySet();
//                Iterator iterator = set.iterator();
//                while (iterator.hasNext()) {
//                    String key = (String) iterator.next();
//                    String value = properties.getProperty(key);
//                    map.put(key, value);
//				    System.out.println(key);
//                }

                Set<String> set = properties.stringPropertyNames();
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) {
                    String key = (String) iterator.next();
                    String value = properties.getProperty(key);
                    map.put(key, value);
//				    System.out.println(key);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
