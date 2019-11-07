package com.xbs.util.helper;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Description
 * @Author cheng
 * @Date2019-11-05 10:30
 * @Version V1.0
 **/
public class DateUtil {

    /**
     * 时间格式(yyyy-MM-dd)
     */
    public final static String DATE_PATTERN = "yyyy-MM-dd";
    /**
     * 时间格式(yyyy-MM-dd)
     */
    public final static String DATE_TIME_PATTERN_HHMMSS = "yyyyMMddHHmmss";
    /**
     * 时间格式(yyyy-MM-dd HH:mm:ss)
     */
    public final static String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";


    private static ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal<SimpleDateFormat>();


    private static SimpleDateFormat getDateFormat() {

        return getDateFormat(DATE_TIME_PATTERN);
    }
    private static SimpleDateFormat getDateFormat(String pattern) {
        SimpleDateFormat df = threadLocal.get();
        if(df==null){
            df = new SimpleDateFormat(pattern);
            threadLocal.set(df);
        }
        return df;
    }

    public static String format(Date date) {
        return format(date, DATE_PATTERN);
    }

    public static String format(Date date, String pattern) {
        if (date != null) {
            return getDateFormat(pattern).format(date);
        }
        return null;
    }

    public static Date parseDate(String date, String pattern) throws ParseException {
        if (StringUtils.isNotBlank(date)) {
            return getDateFormat(pattern).parse(date);
        }
        return null;
    }


    public static Date getStartTime(Date date) {
        Calendar todayStart = Calendar.getInstance();
        todayStart.setTime(date);
        todayStart.set(Calendar.HOUR, 0);
        todayStart.set(Calendar.MINUTE, 0);
        todayStart.set(Calendar.SECOND, 0);
        todayStart.set(Calendar.MILLISECOND, 0);
        return todayStart.getTime();
    }

    public static Date getEndTime(Date date) {
        Calendar todayEnd = Calendar.getInstance();
        todayEnd.setTime(date);
        todayEnd.set(Calendar.HOUR, 23);
        todayEnd.set(Calendar.MINUTE, 59);
        todayEnd.set(Calendar.SECOND, 59);
        todayEnd.set(Calendar.MILLISECOND, 999);
        return todayEnd.getTime();
    }
}
