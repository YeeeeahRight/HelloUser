package com.epam.hellouser.data;

import com.epam.hellouser.exceptions.EmptyArgumentsException;

public interface DataAcquirer {
    String getUserName(String[] programArguments) throws EmptyArgumentsException;
}
