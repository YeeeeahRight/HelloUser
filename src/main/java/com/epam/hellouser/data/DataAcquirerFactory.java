package com.epam.hellouser.data;

public class DataAcquirerFactory {

    public DataAcquirer createDataAcquirer(String[] args) {
        DataAcquirer dataAcquirer;
        if (args.length == 0) {
            dataAcquirer = new ConsoleDataAcquirer();
        } else {
            dataAcquirer = new ArgumentsDataAcquirer(args);
        }
        return dataAcquirer;
    }
}
