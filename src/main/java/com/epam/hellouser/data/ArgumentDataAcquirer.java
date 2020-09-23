package com.epam.hellouser.data;

public class ArgumentDataAcquirer implements DataAcquirer {

    private String argumentUserName;

    public ArgumentDataAcquirer(String argumentUserName) {
        this.argumentUserName = argumentUserName;
    }

    @Override
    public String getUserName() {
        return argumentUserName;
    }
}
