package org.edu.ucsal.smart_toolbar;


public class ReadMode {
    private WorkSpace ws;

    public ReadMode(WorkSpace ws) {
        this.ws = ws;
    }


    public void ActRM() {
        ws.changeColor(new java.awt.Color(245, 245, 220));
    }
}
