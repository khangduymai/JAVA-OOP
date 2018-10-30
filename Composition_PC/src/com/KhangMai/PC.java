package com.KhangMai;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

/*    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }*/


    public void powerUp(){
        theCase.pressPowerButton();
        motherboard();
        monitor();
    }

    private void motherboard(){
        motherboard.loadProgram("Window 10");
    }

    private void monitor(){
        monitor.drawPixelAt(1920,1080,"yellow");
    }
}
