package com.patterns.command.structure;

import com.patterns.command.Command;

public class Invoker {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
