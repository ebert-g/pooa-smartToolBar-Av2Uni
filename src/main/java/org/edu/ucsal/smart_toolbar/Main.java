package org.edu.ucsal.smart_toolbar;

import org.edu.ucsal.smart_toolbar.gui.Seed;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Main.class).headless(false).run(args);

        SwingUtilities.invokeLater(() -> {
            Seed seed = context.getBean(Seed.class);
            seed.setVisible(true);
        });
    }

}
