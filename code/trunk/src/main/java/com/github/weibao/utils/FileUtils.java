package com.github.weibao.utils;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chenkaihua on 15-8-23.
 */
public class FileUtils {


    public static String getFileType(String fileName){
        int index = fileName.lastIndexOf(".");
        int length = fileName.length();
        String fileType = null;
        if( index == -1){
            fileType = "";
        }
        else {
            fileType =  fileName.substring(index,length);
        }
        return  fileType;

    }

    /**
     * 获取当前时间DATE->STRING
     * @return
     */
    public static String getNowDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");// TODO: 16/2/19 后面再加四位随机数
        String dateFormatStr = formatter.format(new Date());
        return dateFormatStr;
    }

}
