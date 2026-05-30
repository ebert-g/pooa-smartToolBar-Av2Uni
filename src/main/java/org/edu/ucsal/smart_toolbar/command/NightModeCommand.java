package org.edu.ucsal.smart_toolbar.command;

import org.edu.ucsal.smart_toolbar.initialization.WorkSpace;

import java.awt.*;


public class NightModeCommand implements Command {
    private WorkSpace ws;

    public NightModeCommand(WorkSpace ws) {
        this.ws = ws;
    }

    @Override
    public void execute() {
        ws.changeColor(new Color(44, 62, 80));
    }
}
