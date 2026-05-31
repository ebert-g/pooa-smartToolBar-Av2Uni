package org.edu.ucsal.smart_toolbar.command;

import org.edu.ucsal.smart_toolbar.annotation.CommandInfo;
import org.edu.ucsal.smart_toolbar.gui.WorkSpace;

@CommandInfo(label = "Zen Mode", shortcut = java.awt.event.KeyEvent.VK_Z)
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
