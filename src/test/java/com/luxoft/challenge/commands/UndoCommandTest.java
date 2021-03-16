package com.luxoft.challenge.commands;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;
import java.util.stream.Stream;

public class UndoCommandTest {

    private static final String expectedResult = "5;6;7;8";

    private static final String expectedResult1 = "1;2;3;4";

    private static final String expectedResult2 = "10;20;30;40";

    private static final String expectedResult3 = "100;200;300;400";

    @Test
    public void undoManyOperations() {
        UndoCommand command = new UndoCommand();
        Stack<String> stack = new Stack<>();
        stack.push(expectedResult);
        stack.push(expectedResult1);
        stack.push(expectedResult2);
        stack.push(expectedResult3);

        String result = command.execute(Stream.of(3, 4, 5, 6), stack, 2);
        Assert.assertEquals(expectedResult3, result);


    }

    @Test
    public void execute() {
        UndoCommand command = new UndoCommand();
        Stack<String> stack = new Stack<>();
        stack.push(expectedResult);
        String result = command.execute(Stream.of(3, 4, 5, 6), stack, 2);
        Assert.assertEquals(expectedResult, result);
        Assert.assertTrue(stack.empty());
    }
}