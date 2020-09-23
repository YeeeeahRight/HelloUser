package com.epam.logic.hellouser.data;

import com.epam.logic.hellouser.exceptions.ConsoleDataException;

public interface DataAcquirer {
    String getUserName() throws ConsoleDataException;
}
