package com.mt.sample.test;

import com.mt.sample.HelloWorld;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    @Test
    public void testSayHello() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, World!", hw.sayHello());
    }
}
