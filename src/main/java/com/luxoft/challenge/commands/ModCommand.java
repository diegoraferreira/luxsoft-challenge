package com.luxoft.challenge.commands;

import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ModCommand implements Command {

    @Override
    public String execute(Stream<Integer> line, Stack<String> previousResult, Integer value) {
        String result = line.map(i -> i % value)
                .map(Object::toString)
                .collect(Collectors.joining(";"));

        return result;
    }

    @Override
    public Commands getCommand() {
        return Commands.MOD;
    }
}
