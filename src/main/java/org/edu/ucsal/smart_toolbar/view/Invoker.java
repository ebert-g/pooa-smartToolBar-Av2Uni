package org.edu.ucsal.smart_toolbar.view;

import org.edu.ucsal.smart_toolbar.dto.CommandMDRecord;
import org.edu.ucsal.smart_toolbar.service.CommandLoader;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.util.List;

@Component
public class Invoker extends JFrame {
    private final WorkSpace ws = new WorkSpace();
    private final JPanel toolBar = new JPanel();

    public Invoker() {
        setTitle("Smart Toolbar - Command + Reflection");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        toolBar.setLayout(new FlowLayout(FlowLayout.CENTER));
        add(toolBar, BorderLayout.NORTH);
        add(ws, BorderLayout.CENTER);

        initializeDynamicCommands();
    }

    private void initializeDynamicCommands() {
        List<CommandMDRecord> commands = CommandLoader.load(ws);

        for (CommandMDRecord meta : commands) {
            JButton button = new JButton(meta.label());
            button.setToolTipText("Atalho -> " + (char) meta.shortcut());
            button.addActionListener(e -> meta.command().execute());
            toolBar.add(button);

            String actionKey = "action_" + meta.label();

            getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                    .put(KeyStroke.getKeyStroke(meta.shortcut(), 0), actionKey);

            getRootPane().getActionMap().put(actionKey, new AbstractAction() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    meta.command().execute();
                }
            });
        }
    }

}

