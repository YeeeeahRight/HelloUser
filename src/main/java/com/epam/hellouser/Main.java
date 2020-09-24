package com.epam.hellouser;

import com.epam.hellouser.data.DataAcquirer;
import com.epam.hellouser.data.DataAcquirerFactory;
import com.epam.hellouser.enums.InputWayEnum;
import com.epam.hellouser.exceptions.EmptyArgumentsException;
import com.epam.hellouser.exceptions.UnknownInputWayException;
import com.epam.hellouser.logic.HelloStringParser;
import com.epam.hellouser.view.Hello;
import com.epam.hellouser.view.ResultPrinter;

public class Main {

    public static void main(String[] args) throws EmptyArgumentsException, UnknownInputWayException {
        DataAcquirerFactory dataCreator = new DataAcquirerFactory();
        InputWayEnum inputWay = InputWayEnum.ARGUMENTS;
        DataAcquirer dataAcquirer = dataCreator.createDataAcquirer(inputWay);
        String userName = dataAcquirer.getUserName(args);
        HelloStringParser helloParser = new HelloStringParser();
        String fullHelloStr = helloParser.parseFullHello(userName);
        ResultPrinter printer = new Hello();
        printer.printHello(fullHelloStr);
    }
}