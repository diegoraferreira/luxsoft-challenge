package com.luxoft.challenge.commands;

public final class CommandsResolver {

    public static Command resolve(String command) {
        if (command == null || command.isEmpty()) {
            throw new IllegalArgumentException("Input value must not be null");
        }

        if (command.startsWith(Commands.SUM.getIdentifier())) {
            return new SumCommand();
        } else if (command.startsWith(Commands.MULTIPLY.getIdentifier())) {
            return new MultiplyCommand();
        } else if (command.startsWith(Commands.MOD.getIdentifier())) {
            return new ModCommand();
        } else if (command.startsWith(Commands.UNDO.getIdentifier())) {
            return new UndoCommand();
        } else if (command.startsWith(Commands.QUIT.getIdentifier())) {
            return new QuitCommand();
        } else {
            throw new IllegalArgumentException("Unrecognized command");
        }
    }
}
