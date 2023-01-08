package com.patterns.command;

import com.patterns.command.structure.Receiver;

public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
