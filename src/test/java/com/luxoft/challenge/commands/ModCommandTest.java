package com.luxoft.challenge.commands;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

public class ModCommandTest {

    private static final String expectedResult = "1;2;0;1";

    @Test
    public void execute() {
        ModCommand command = new ModCommand();
        String result = command.execute(Stream.of(4, 5, 6, 7), null, 3);
        Assert.assertEquals(expectedResult, result);
    }
}