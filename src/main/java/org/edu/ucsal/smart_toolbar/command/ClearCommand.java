package org.edu.ucsal.smart_toolbar.command;

import org.edu.ucsal.smart_toolbar.annotation.CommandInfo;
import org.edu.ucsal.smart_toolbar.view.WorkSpace;

import java.awt.*;

@CommandInfo(label = "Clear Mode", shortcut = java.awt.event.KeyEvent.VK_C)
public class ClearCommand implements Command {
    private final WorkSpace ws;

    public ClearCommand(WorkSpace ws) {
        this.ws = ws;
    }

    @Override
    public void execute() {
        ws.changeColor(new Color(255, 255, 255));
    }

}
