import java.io.Console;

public class App{
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println(" - - - Welcome to EVENT-PLANNING!!! - - - \nPlease enter the total number of guests for your event...");
    String guestNumInput = myConsole.readLine();
    int totlGuests = Integer.parseInt(guestNumInput);

    System.out.println("What would you like for the main entrée?\nEnter (1) for Pizza  @ 10$ a head.\nEnter (2) for Pasta  @ 20$ a head.\nEnter (3) for Salmon @ 25$ a head.\nEnter (4) for Steak  @ 35$ a head.\n");
    String entréeInput = myConsole.readLine();
    int entréeChoice = Integer.parseInt(entréeInput);

    System.out.println("What would you like to serve for drinks?\nEnter (1) for BYOB  @ 0$ a head.\nEnter (2) for self-serve domestic beer and wine @ 20$ a head.\nEnter (3) for self-serve open bar @ 30$ a head.\nEnter (4) for open premium bar with tender @ 50$ a head.\n");
    String drinksInput = myConsole.readLine();
    int drinkChoice = Integer.parseInt(drinksInput);

    System.out.println("What kind of entertainment would you like?\nEnter (1) to forgo entertainment @ 0$ a head.\nEnter (2) for a dance floor and an iPod @ 20$ a head.\nEnter (3) for option (2) plus a petting Zoo @ 40$ a head.\nEnter (4) for options (2),(3), and a fireworks show @ 60$ a head.\n");
    String entertainmentInput = myConsole.readLine();
    int entertainmentChoice = Integer.parseInt(entertainmentInput);

  }
}
