package org.edu.ucsal.smart_toolbar.command;

import org.edu.ucsal.smart_toolbar.annotation.CommandInfo;
import org.edu.ucsal.smart_toolbar.gui.WorkSpace;

import java.awt.*;

@CommandInfo(label = "Night Mode", shortcut = java.awt.event.KeyEvent.VK_N)
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
