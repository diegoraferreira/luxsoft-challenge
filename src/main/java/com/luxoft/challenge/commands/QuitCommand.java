package com.luxoft.challenge.commands;

import java.util.Stack;
import java.util.stream.Stream;

public class QuitCommand implements Command {

    @Override
    public String execute(Stream<Integer> line, Stack<String> previousResult, Integer value) {
        System.exit(0);
        return null;
    }

    @Override
    public Commands getCommand() {
        return Commands.QUIT;
    }
}
