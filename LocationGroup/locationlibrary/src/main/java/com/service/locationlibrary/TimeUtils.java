package com.service.locationlibrary;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
/**
 * Created by Ting on 17/7/4.
 */

public class TimeUtils {
    public final static SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

    static {
        TIME_FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public static String parseDate(long time) {
        Date date = new Date(time);
        String timeString = TIME_FORMAT.format(date);
        return timeString;
    }
}