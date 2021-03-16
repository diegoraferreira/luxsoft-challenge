package com.luxoft.challenge.commands;

public enum Commands {

    SUM("+"), MULTIPLY("*"), MOD("%"), UNDO("Undo"), QUIT("Quit");

    private String identifier;

    Commands(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public boolean isUndo() {
        return this.equals(UNDO);
    }

    public boolean isQuit() {
        return this.equals(QUIT);
    }
}
