package com.recruit.utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by lishaoyong on 16/10/19.
 */
public class UtilDateTime {

    /**
     * 获取当前日期的年月日格式化为20161009
     * @return
     */
    public static String getNowDate(){
        Date nowDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        return dateFormat.format(nowDate).replace("-","");
    }

    public static String getbeforeDate(){
        Calendar now = Calendar.getInstance();
        now.add(Calendar.DATE, -1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(now.getTime()).replace("-","");
    }

    public static String getNowMin(){
        Long minux = System.currentTimeMillis()/1000/60;
        return String.valueOf(minux);
    }

    //测试使用
    public static void main(String args[]){
        System.out.println(getbeforeDate());
    }
}
