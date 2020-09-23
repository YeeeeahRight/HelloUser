package com.epam.data;

import com.epam.hellouser.data.ArgumentsDataAcquirer;
import com.epam.hellouser.data.ConsoleDataAcquirer;
import com.epam.hellouser.data.DataAcquirer;
import com.epam.hellouser.data.DataAcquirerFactory;
import org.junit.Assert;
import org.junit.Test;

public class DataAcquirerFactoryTest {

    //given
    DataAcquirerFactory dataAcquirerCreator = new DataAcquirerFactory();

    @Test
    public void testDataAcquirerFactoryWhenArgsAreEmpty() {
        //when
        DataAcquirer acquirer = dataAcquirerCreator.createDataAcquirer(new String[]{});
        //then
        Assert.assertTrue(acquirer instanceof ConsoleDataAcquirer);
    }

    @Test
    public void testDataAcquirerFactoryWhenArgsAreFilled() {
        //when
        DataAcquirer acquirer = dataAcquirerCreator.createDataAcquirer(new String[]{"Alex", "3431garbage"});
        //then
        Assert.assertTrue(acquirer instanceof ArgumentsDataAcquirer);
    }


}
