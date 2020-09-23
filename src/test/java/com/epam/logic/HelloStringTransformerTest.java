package com.epam.logic;


import com.epam.logic.hellouser.logic.Transformer;
import com.epam.logic.hellouser.logic.HelloStringTransformer;
import org.junit.Assert;
import org.junit.Test;

public class HelloStringTransformerTest {

    //given
    private Transformer calculator = new HelloStringTransformer();

    @Test
    public void testHelloStringCalculatorWhenUserNameIsNumber() {
        //when
        String fullHelloStr = calculator.transformFullHello("12345");
        //then
        Assert.assertEquals("Hello, 12345!", fullHelloStr);
    }

    @Test
    public void testHelloStringCalculatorWhenUserNameIsString() {
        //when
        String fullHelloStr = calculator.transformFullHello("Alex");
        //then
        Assert.assertEquals("Hello, Alex!", fullHelloStr);
    }


}
