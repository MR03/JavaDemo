package com.silvertb.utils;

import org.springframework.util.StringUtils;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by Administrator on 2018/9/6.
 */
public class Time {

    /**
     * Date转sql的Timestamp
     */
    public static Timestamp dateToTimestamp() {
        Date date = new Date();
        return new Timestamp(date.getTime());
    }

    public static String timestampSecond() {
        long epochSecond = Instant.now().getEpochSecond();
        return String.valueOf(epochSecond);
    }
}
