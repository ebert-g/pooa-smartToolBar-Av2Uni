package org.edu.ucsal.smart_toolbar.command;

import org.edu.ucsal.smart_toolbar.initialization.WorkSpace;

public class ZenModeCommand implements Command {
    private WorkSpace ws;

    public ZenModeCommand(WorkSpace ws) {
        this.ws = ws;
    }

    @Override
    public void execute() {
        ws.changeColor(new java.awt.Color(230, 230, 250));
    }
}
