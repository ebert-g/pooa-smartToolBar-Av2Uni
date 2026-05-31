package org.edu.ucsal.smart_toolbar.command;


import org.edu.ucsal.smart_toolbar.annotation.CommandInfo;
import org.edu.ucsal.smart_toolbar.gui.WorkSpace;

@CommandInfo(label = "Read Mode", shortcut = java.awt.event.KeyEvent.VK_R)
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
