
public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Akil";
//        player.health = 20;
//        player.weapon = "Knife";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

//        EnhancedPlayer player = new EnhancedPlayer("Akil", 200, "Sword");
//        System.out.println("Initial health is " + player.getHealth());

//        Challenge
        Printer printer = new Printer(100, 0, "duplex");
        System.out.println(printer.getTonerLevel());
        System.out.println(printer.getPrintedPages());
        printer.printPages(10);
        System.out.println(printer.getTonerLevel());
        System.out.println(printer.getPrintedPages());
        printer.fillToner(20);
        printer.fillToner(10);


    }
}
