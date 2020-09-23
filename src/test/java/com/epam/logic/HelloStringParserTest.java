package com.epam.logic;


import com.epam.hellouser.logic.Parser;
import com.epam.hellouser.logic.HelloStringParser;
import org.junit.Assert;
import org.junit.Test;

public class HelloStringParserTest {

    //given
    private Parser calculator = new HelloStringParser();

    @Test
    public void testHelloStringCalculatorWhenUserNameIsNumber() {
        //when
        String fullHelloStr = calculator.parseFullHello("12345");
        //then
        Assert.assertEquals("Hello, 12345!", fullHelloStr);
    }

    @Test
    public void testHelloStringCalculatorWhenUserNameIsString() {
        //when
        String fullHelloStr = calculator.parseFullHello("Alex");
        //then
        Assert.assertEquals("Hello, Alex!", fullHelloStr);
    }


}
