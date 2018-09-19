package com.silvertb.utils;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JwtTests {

    @Test
    public void aTest() {
        JwtUtil.create();
    }
}
