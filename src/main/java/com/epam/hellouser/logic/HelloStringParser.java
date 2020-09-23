package com.epam.hellouser.logic;

public class HelloStringParser implements Parser {

    @Override
    public String parseFullHello(String userName) {
        return "Hello, " + userName + "!";
    }
}
