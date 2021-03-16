package com.luxoft.challenge.commands;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

public class MultiplyCommandTest {

    private static final String expectedResult = "6;8;10;12";

    @Test
    public void execute() {
        MultiplyCommand command = new MultiplyCommand();
        String result = command.execute(Stream.of(3, 4, 5, 6), null, 2);
        Assert.assertEquals(expectedResult, result);
    }
}