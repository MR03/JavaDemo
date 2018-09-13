package com.silvertb.utils;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TimeTests {

    @Test
    public void dateToTimestampTest() {
        System.out.println(Time.timestampSecond());
    }
}
