import java.io.Console;

public class App {
  public static void main(String[] args) {
  Console myConsole = System.console();

    ShelterAnimals dog = new ShelterAnimals(4, "Poodle", "Male", "Medium", "White");
    ShelterAnimals cat = new ShelterAnimals(2, "Stray", "Male", "Small", "Gray");
    ShelterAnimals rabbit = new ShelterAnimals(1, "Dwarf", "Male", "Small", "Black");

    ShelterAnimals[] allShelterAnimals = { dog, cat, rabbit};
     System.out.println("What size animal are you looking for?");
     String userSize = myConsole.readLine();
     String theUsersSize = userSize;

     System.out.println( "These are the animals we suggest for adoptions:");
     for( ShelterAnimals individualAnimals : allShelterAnimals ) {
       if (individualAnimals.perfectAnimal(theUsersSize));
       System.out.println("--------------");
       System.out.println(individualAnimals.mAge);
       System.out.println(individualAnimals.mSpecies);
       System.out.println(individualAnimals.mGender);
       System.out.println(individualAnimals.mSize);
       System.out.println(individualAnimals.mColor);
     }



  }
}
