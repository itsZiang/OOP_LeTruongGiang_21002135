package com.patterns.command.realworld;

public class Switch {
    private Command upCommand;
    private Command downCommand;

    public Switch(Command upCommand, Command downCommand) {
        this.upCommand = upCommand;
        this.downCommand = downCommand;
    }

    void flipUp() {
        upCommand.execute();
    }

    void flipDown() {
        downCommand.execute();
    }
}
