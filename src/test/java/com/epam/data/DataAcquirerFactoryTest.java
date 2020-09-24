package com.epam.data;

import com.epam.hellouser.data.ArgumentsDataAcquirer;
import com.epam.hellouser.data.DataAcquirer;
import com.epam.hellouser.data.DataAcquirerFactory;
import com.epam.hellouser.enums.InputWayEnum;
import com.epam.hellouser.exceptions.UnknownInputWayException;
import org.junit.Assert;
import org.junit.Test;

public class DataAcquirerFactoryTest {

    private DataAcquirerFactory dataAcquirerCreator = new DataAcquirerFactory();

    @Test(expected = UnknownInputWayException.class)
    public void testDataAcquirerFactoryWhenTryToUseConsoleInput() throws UnknownInputWayException {
        InputWayEnum inputWay = InputWayEnum.CONSOLE;
        dataAcquirerCreator.createDataAcquirer(inputWay);
    }

    @Test
    public void testDataAcquirerFactoryWhenTryToUseArguments() throws UnknownInputWayException {
        InputWayEnum inputWay = InputWayEnum.ARGUMENTS;
        DataAcquirer acquirer = dataAcquirerCreator.createDataAcquirer(inputWay);
        Assert.assertTrue(acquirer instanceof ArgumentsDataAcquirer);
    }


}
