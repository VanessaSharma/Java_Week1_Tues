import java.io.Console;

public class Numbers {
  public static void main( String[] args ) {
  Console userInput = System.console();

    System.out.println( "Name a number and I will count to that number");
      String enteredNumber = userInput.readLine();
      Integer myNumber = Integer.parseInt(enteredNumber);
      System.out.println( "I will now count to your number:");

      for (Integer index = 1 ; index <= myNumber ; index++ ) {
        if (index % 2 == 0) {
          System.out.println( "even" );
        }
        else {
          System.out.println( "odd");
        }
      }
    }
  }
