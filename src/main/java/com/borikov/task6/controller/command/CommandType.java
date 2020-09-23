package com.borikov.task6.controller.command;

import com.borikov.task6.controller.command.impl.SwitchLocaleCommand;

public enum CommandType {
    SWITCH_LOCALE_COMMAND(new SwitchLocaleCommand());

    private final Command command;

    CommandType(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }
}
