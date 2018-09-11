package com.silvertb.utils;

import org.springframework.util.DigestUtils;


import java.sql.Timestamp;
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
}
