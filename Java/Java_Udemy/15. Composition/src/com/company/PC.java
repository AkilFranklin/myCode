package com.company;

public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }
    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo(){
        theMonitor.drawPixelAt(1250,1000, "red");

    }
    // no longer needed since we can access the variables directly
//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getTheMonitor() {
//        return theMonitor;
//    }
//
//    private Motherboard getTheMotherboard() {
//        return theMotherboard;
//    }
}
