package com.luxoft.challenge.executor;

import com.luxoft.challenge.commands.Command;
import com.luxoft.challenge.commands.CommandsResolver;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Stream;

public class CommandLineExecutor {

    public void execute(String input) {
        Stack<String> lastValueStack = new Stack<>();
        lastValueStack.push(input);
        String actualValue = input;
        System.out.println(actualValue);

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String commandInput = sc.nextLine();
            Command command = CommandsResolver.resolve(commandInput);
            int commandValue = 0;
            if (!(command.getCommand().isUndo() || command.getCommand().isQuit())) {
                commandValue = Integer.parseInt(commandInput.substring(1));
            }
            Stream<Integer> intStream = Arrays.stream(actualValue.split(Command.LINE_SEPARATOR)).map(s -> Integer.parseInt(s));
            String result = command.execute(intStream, lastValueStack, commandValue);
            lastValueStack.push(actualValue);
            actualValue = result;
            System.out.println(result);
        }
    }
}
