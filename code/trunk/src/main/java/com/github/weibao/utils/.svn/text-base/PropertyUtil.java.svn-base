package com.github.weibao.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Create 16/2/19,下午9:52
 * @Author dongzhukai
 */
public class PropertyUtil {
    private static PropertyUtil instance=new PropertyUtil();

    private PropertyUtil(){

    }

    public static PropertyUtil getInstance(){
        return instance;
    }

    public String getValue(String key){
        try {
            Properties prop = new Properties();
            InputStream in = getClass().getResourceAsStream("/app.properties");
            prop.load(in);
            return prop.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
