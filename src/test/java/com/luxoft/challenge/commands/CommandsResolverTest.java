package com.luxoft.challenge.commands;

import org.junit.Assert;
import org.junit.Test;

public class CommandsResolverTest {

    @Test
    public void resolveSumCommand(){
        Command command = CommandsResolver.resolve("+20");
        Assert.assertTrue(command.getCommand().equals(Commands.SUM));
    }

    @Test
    public void resolveMultiplyCommand(){
        Command command = CommandsResolver.resolve("*20");
        Assert.assertTrue(command.getCommand().equals(Commands.MULTIPLY));
    }

    @Test
    public void resolveModCommand(){
        Command command = CommandsResolver.resolve("%3");
        Assert.assertTrue(command.getCommand().equals(Commands.MOD));
    }

    @Test
    public void resolveUndoCommand(){
        Command command = CommandsResolver.resolve("Undo");
        Assert.assertTrue(command.getCommand().equals(Commands.UNDO));
    }

    @Test
    public void resolveQuitCommand(){
        Command command = CommandsResolver.resolve("Quit");
        Assert.assertTrue(command.getCommand().equals(Commands.QUIT));
    }

    @Test(expected = IllegalArgumentException.class)
    public void resolveUnknownCommand(){
        Command command = CommandsResolver.resolve("Unknown");
    }
}