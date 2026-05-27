package org.edu.ucsal.smart_toolbar;


public class ReadMode {
    private WorkSpace ws;

    public ReadMode(WorkSpace ws) {
        this.ws = ws;
    }


    public void execute() {
        ws.changeColor(new java.awt.Color(245, 245, 220));
    }
}
