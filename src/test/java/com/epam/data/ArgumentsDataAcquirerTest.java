package com.epam.data;

import com.epam.hellouser.data.ArgumentsDataAcquirer;
import com.epam.hellouser.exceptions.EmptyArgumentsException;
import org.junit.Assert;
import org.junit.Test;

public class ArgumentsDataAcquirerTest {

    private ArgumentsDataAcquirer argumentsAcquirer = new ArgumentsDataAcquirer();

    @Test(expected = EmptyArgumentsException.class)
    public void testArgumentsDataAcquirerWhenArgumentsAreEmpty() throws EmptyArgumentsException {
        argumentsAcquirer.getUserName(new String[]{});
    }

    @Test
    public void testArgumentsDataAcquirerWhenArgumentsAreFilled() throws EmptyArgumentsException {
        String fullHelloName = argumentsAcquirer.getUserName(new String[]{"Alex", "is", "my", "name"});
        Assert.assertEquals("Alex", fullHelloName);
    }
}
