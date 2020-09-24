package com.epam.hellouser.data;

import com.epam.hellouser.exceptions.EmptyArgumentsException;

public class ArgumentsDataAcquirer implements DataAcquirer {

    private final static String EMPTY_ARGUMENTS_MESSAGE = "Your program arguments are empty.";

    @Override
    public String getUserName(String[] programArguments) throws EmptyArgumentsException {
        if (programArguments.length == 0) {
            throw new EmptyArgumentsException(EMPTY_ARGUMENTS_MESSAGE);
        }
        return programArguments[0];
    }
}
