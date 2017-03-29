import java.io.Console;

public class App{
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Welcome to EVENT-PLANNING!!! please enter the total number of guests for your event...");
    String guestNumInput = myConsole.readLine();
    int totlGuests = Integer.parseInt(guestNumInput);
  }
}
