package com.example;

import picocli.CommandLine;
import picocli.CommandLine.Command;

import java.util.concurrent.Callable;

@Command(name = "myCommand")
public class MyCommand implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("hello world");
        return 0;
    }

    public static void main(String[] args) {
        System.exit(new CommandLine(new MyCommand()).execute(args));
    }
}
