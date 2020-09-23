package com.epam.hellouser;

import com.epam.hellouser.data.DataAcquirer;
import com.epam.hellouser.data.DataAcquirerFactory;
import com.epam.hellouser.exceptions.ConsoleDataException;
import com.epam.hellouser.logic.HelloStringParser;
import com.epam.hellouser.view.Hello;
import com.epam.hellouser.view.ResultPrinter;

public class Main {

    public static void main(String[] args) throws ConsoleDataException {
        DataAcquirerFactory dataCreator = new DataAcquirerFactory();
        DataAcquirer dataAcquirer = dataCreator.createDataAcquirer(args);
        String userName = dataAcquirer.getUserName();
        HelloStringParser helloParser = new HelloStringParser();
        String fullHelloStr = helloParser.parseFullHello(userName);
        ResultPrinter printer = new Hello();
        printer.printHello(fullHelloStr);
    }
}