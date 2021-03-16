package com.luxoft.challenge;

import com.luxoft.challenge.executor.CommandLineExecutor;

public class LuxoftChallengeApplication {

    public static void main(String[] args){
        CommandLineExecutor executor = new CommandLineExecutor();
        executor.execute(args[0]);
    }
}
