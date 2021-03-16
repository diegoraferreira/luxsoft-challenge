package com.luxoft.challenge.commands;

import java.util.Stack;
import java.util.stream.Stream;

public class UndoCommand implements Command {

    @Override
    public String execute(Stream<Integer> line, Stack<String> previousResult, Integer value) {
        return previousResult.pop();
    }

    @Override
    public Commands getCommand() {
        return Commands.UNDO;
    }
}
