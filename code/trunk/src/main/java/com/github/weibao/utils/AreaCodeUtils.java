package com.github.weibao.utils;

import org.springframework.util.StringUtils;

/**
 * @Create 16/2/21,下午10:54
 * @Author dongzhukai
 */
public class AreaCodeUtils {
    public static String filtercode(String provincecode) {
        if (StringUtils.isEmpty(provincecode)) {
            throw new NullPointerException("城市编码为NULL.");
        }

        switch (Integer.valueOf(provincecode)) {
            case 110000:
                return "110100";
            case 120000:
                return "120100";
            case 310000:
                return "310100";
            case 500000:
                return "500100";
            default:
                return provincecode;
        }

    }

    public static void main(String[] args) {
        //System.out.println(filtercode(110000));
        //System.out.println(filtercode(121000));
        //System.out.println(filtercode(310000));
        //System.out.println(filtercode(500000));
        //System.out.println(filtercode(610000));
    }

}
