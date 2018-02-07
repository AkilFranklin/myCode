public class Printer {
    private int tonerLevel = 100;
    private int printedPages = 0;
    private String duplexPrinter;

    public Printer (int tonerLevel, int printedPages, String duplexPrinter){
        if (tonerLevel > 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        else {
            this.tonerLevel = -1;
        }


    }
    public void fillToner(int tonerToAdd){
        if ((tonerLevel + tonerToAdd) <= 100){
            this.tonerLevel = this.tonerLevel + tonerToAdd;
            System.out.println("Added " + tonerToAdd + " toner. Total is now " + getTonerLevel());
        }
        else{
            System.out.println("Cannot add that much toner");
        }
    }

    public void printPages(int pagesToPrint) {
        if (pagesToPrint >= 0) {
            this.printedPages = printedPages + pagesToPrint;
            System.out.println("Printed " + pagesToPrint + " pages. Total printed is " + getPrintedPages());
            this.tonerLevel = this.tonerLevel - pagesToPrint;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPrintedPages() {
        return printedPages;
    }

    public String getDuplexPrinter() {
        return duplexPrinter;
    }
}
