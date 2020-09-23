package com.epam.hellouser.view;

public class Hello implements ResultPrinter {

    @Override
    public void printHello(String fullHelloStr) {
        System.out.println(fullHelloStr);
    }
}
