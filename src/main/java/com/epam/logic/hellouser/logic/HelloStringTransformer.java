package com.epam.logic.hellouser.logic;

public class HelloStringTransformer implements Transformer {

    @Override
    public String transformFullHello(String userName) {
        return "Hello, " + userName + "!";
    }
}
