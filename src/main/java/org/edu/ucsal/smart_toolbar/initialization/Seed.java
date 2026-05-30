package org.edu.ucsal.smart_toolbar.initialization;

import org.edu.ucsal.smart_toolbar.command.*;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Seed extends JFrame {
    private final WorkSpace ws = new WorkSpace();
    private final JPanel toolbar = new JPanel();

    public Seed() {
        setTitle("Smart Toolbar - Pattern Command");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        toolbar.setLayout(new FlowLayout(FlowLayout.CENTER));
        add(toolbar, BorderLayout.NORTH);
        add(ws, BorderLayout.CENTER);

        Command nightModeCommand = new NightModeCommand(ws);
        Command readModeCommand = new ReadModeCommand(ws);
        Command ClearCommand = new ClearCommand(ws);
        Command zenModeCommand = new ZenModeCommand(ws);
        HashMap<String, Command> commandMap = new HashMap<>();
        commandMap.put("Night Mode", nightModeCommand);
        commandMap.put("Read Mode", readModeCommand);
        commandMap.put("Clear", ClearCommand);
        commandMap.put("Zen Mode", zenModeCommand);

        createCommandButton(commandMap);
    }

    private void createCommandButton(HashMap<String, Command> commandMap) {
        for (String key : commandMap.keySet()) {
            JButton button = new JButton(key);
            button.addActionListener(e -> commandMap.get(key).execute());
            toolbar.add(button);
        }
    }
}


