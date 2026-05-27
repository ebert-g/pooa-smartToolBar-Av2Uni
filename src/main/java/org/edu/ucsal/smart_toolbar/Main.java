package org.edu.ucsal.smart_toolbar;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private WorkSpace ws = new WorkSpace();
    private JPanel toolbar = new JPanel();
    private ActivateNightModel activateNightModel = new ActivateNightModel(ws);
    private ReadMode readMode = new ReadMode(ws);

    public Main() {
        setTitle("Smart Toolbar");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(toolbar, BorderLayout.NORTH);
        add(ws, BorderLayout.CENTER);

        JButton nightModeBtn = new JButton("Night Mode");
        JButton readModeBtn = new JButton("Read Mode");
        toolbar.add(nightModeBtn);
        toolbar.add(readModeBtn);

        nightModeBtn.addActionListener(e -> {
            activateNightModel.execute();
        });

        readModeBtn.addActionListener(e -> {
            readMode.execute();
        });
    }

    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

}
