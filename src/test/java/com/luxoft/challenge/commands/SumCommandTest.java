package com.luxoft.challenge.commands;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

public class SumCommandTest {

    private static final String expectedResult = "5;6;7;8";

    @Test
    public void execute() {
        SumCommand command = new SumCommand();
        String result = command.execute(Stream.of(3, 4, 5, 6), null, 2);
        Assert.assertEquals(expectedResult, result);
    }
}