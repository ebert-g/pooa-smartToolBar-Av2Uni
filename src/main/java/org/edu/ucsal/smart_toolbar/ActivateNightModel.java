package org.edu.ucsal.smart_toolbar;

import java.awt.*;


public class ActivateNightModel {
    private WorkSpace ws;

    public ActivateNightModel(WorkSpace ws) {
        this.ws = ws;
    }

    public void activateNM() {
        ws.changeColor(new Color(44, 62, 80));
    }
}
