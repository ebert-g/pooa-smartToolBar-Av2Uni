package org.edu.ucsal.smart_toolbar;

import org.edu.ucsal.smart_toolbar.annotation.CommandInfo;
import org.edu.ucsal.smart_toolbar.command.Command;
import org.edu.ucsal.smart_toolbar.view.WorkSpace;

import javax.swing.*;
import java.awt.event.KeyEvent;

@CommandInfo(label = "Focus Mode", shortcut = KeyEvent.VK_F)
public class FocusModeCommand implements Command {
    private WorkSpace ws;

    public FocusModeCommand(WorkSpace ws) {
        this.ws = ws;
    }

    @Override
    public void execute() {
        JOptionPane.showMessageDialog(ws, "Show Me The Code!",
                "Focus Mode", JOptionPane.INFORMATION_MESSAGE);
    }
}