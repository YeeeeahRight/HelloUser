package com.epam.logic.hellouser.data;

import com.epam.logic.hellouser.exceptions.ConsoleDataException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleDataAcquirer implements DataAcquirer {

    final static String CONSOLE_INPUT_MESSAGE = "Your program arguments are empty. Enter your name from console: ";
    final static String CONSOLE_INPUT_ERROR_MESSAGE = "Something wrong with your input. Please, restart program.";
    final static String CLOSE_EXCEPTION_MESSAGE = "Error with closing reader. Please, restart program.";

    @Override
    public String getUserName() throws ConsoleDataException {
        System.out.print(CONSOLE_INPUT_MESSAGE);
        String userName;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            userName = reader.readLine();
        } catch (IOException e) {
            throw new ConsoleDataException(CONSOLE_INPUT_ERROR_MESSAGE);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println(CLOSE_EXCEPTION_MESSAGE);
                }
            }
        }
        return userName;
    }
}
