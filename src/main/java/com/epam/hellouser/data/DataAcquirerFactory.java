package com.epam.hellouser.data;

import com.epam.hellouser.enums.InputWayEnum;
import com.epam.hellouser.exceptions.UnknownInputWayException;

public class DataAcquirerFactory {

    private static final String UNKNOWN_INPUT_WAY_MESSAGE = "Unknown input way.";

    public DataAcquirer createDataAcquirer(InputWayEnum way) throws UnknownInputWayException {
        if (way == InputWayEnum.ARGUMENTS) {
            return new ArgumentsDataAcquirer();
        }
        throw new UnknownInputWayException(UNKNOWN_INPUT_WAY_MESSAGE);
    }
}
