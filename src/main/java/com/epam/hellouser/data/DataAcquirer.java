package com.epam.hellouser.data;

import com.epam.hellouser.exceptions.ConsoleDataException;

public interface DataAcquirer {
    String getUserName() throws ConsoleDataException;
}
