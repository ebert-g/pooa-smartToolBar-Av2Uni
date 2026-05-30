package org.edu.ucsal.smart_toolbar.command;

import org.edu.ucsal.smart_toolbar.initialization.WorkSpace;

public class ClearCommand implements Command {
    private final WorkSpace ws;

    public ClearCommand(WorkSpace ws) {
        this.ws = ws;
    }

    @Override
    public void execute() {
        ws.changeColor(new java.awt.Color(255, 255, 255));
    }

}
