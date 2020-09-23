package com.epam.logic.hellouser.data;

public class DataAcquirerFactory {

    public DataAcquirer createDataAcquirer(String[] args) {
        DataAcquirer dataAcquirer;
        if (args.length == 0) {
            dataAcquirer = new ConsoleDataAcquirer();
        } else {
            dataAcquirer = new ArgumentDataAcquirer(args[0]);
        }
        return dataAcquirer;
    }
}
