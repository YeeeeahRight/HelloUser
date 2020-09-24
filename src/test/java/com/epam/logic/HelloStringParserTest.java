package com.epam.logic;

import com.epam.hellouser.logic.HelloStringParser;
import org.junit.Assert;
import org.junit.Test;

public class HelloStringParserTest {

    private HelloStringParser calculator = new HelloStringParser();

    @Test
    public void testHelloStringCalculatorWhenUserNameIsNumber() {
        String fullHelloStr = calculator.parseFullHello("12345");
        Assert.assertEquals("Hello, 12345!", fullHelloStr);
    }

    @Test
    public void testHelloStringCalculatorWhenUserNameIsString() {
        String fullHelloStr = calculator.parseFullHello("Alex");
        Assert.assertEquals("Hello, Alex!", fullHelloStr);
    }


}
