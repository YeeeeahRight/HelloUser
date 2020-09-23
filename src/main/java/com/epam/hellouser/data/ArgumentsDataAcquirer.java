package com.epam.hellouser.data;

public class ArgumentsDataAcquirer implements DataAcquirer {

    private String[] programArguments;

    public ArgumentsDataAcquirer(String[] programArguments) {
        this.programArguments = programArguments;
    }

    @Override
    public String getUserName() {
        return programArguments[0];
    }
}
