package com.luxoft.challenge.commands;

import java.util.Stack;
import java.util.stream.Stream;

public interface Command {

    static String LINE_SEPARATOR = ";";

    String execute(Stream<Integer> line, Stack<String> previousResult, Integer value);

    Commands getCommand();
}
