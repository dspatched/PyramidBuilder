package com.dspatched;

public class CannotBuildPyramidException extends Exception {
    public CannotBuildPyramidException() {
        super();
        System.out.println("Cannot build pyramid");
    }
}
