package com.epam.logic.hellouser;

import com.epam.logic.hellouser.data.DataAcquirer;
import com.epam.logic.hellouser.data.DataAcquirerFactory;
import com.epam.logic.hellouser.exceptions.ConsoleDataException;
import com.epam.logic.hellouser.logic.HelloStringTransformer;
import com.epam.logic.hellouser.view.Hello;
import com.epam.logic.hellouser.view.ResultPrinter;

public class Main {

    public static void main(String[] args) throws ConsoleDataException {
        DataAcquirerFactory dataCreator = new DataAcquirerFactory();
        DataAcquirer dataAcquirer = dataCreator.createDataAcquirer(args);
        String userName = dataAcquirer.getUserName();
        HelloStringTransformer helloTransformer = new HelloStringTransformer();
        String fullHelloStr = helloTransformer.transformFullHello(userName);
        ResultPrinter printer = new Hello();
        printer.printHello(fullHelloStr);
    }
}
