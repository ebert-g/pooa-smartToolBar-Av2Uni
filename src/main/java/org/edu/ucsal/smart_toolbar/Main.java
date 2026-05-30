package org.edu.ucsal.smart_toolbar;

import org.edu.ucsal.smart_toolbar.initialization.Seed;

import javax.swing.*;

public class Main {
    Seed seed = new Seed();
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(() -> {
            new Main().seed.setVisible(true);
        });
    }

}
