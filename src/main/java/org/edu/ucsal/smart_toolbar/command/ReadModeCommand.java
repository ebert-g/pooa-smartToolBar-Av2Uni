package org.edu.ucsal.smart_toolbar.command;


import org.edu.ucsal.smart_toolbar.initialization.WorkSpace;

public class ReadModeCommand implements Command {
    private WorkSpace ws;

    public ReadModeCommand(WorkSpace ws) {
        this.ws = ws;
    }

    @Override
    public void execute() {
        ws.changeColor(new java.awt.Color(245, 245, 220));
    }
}
