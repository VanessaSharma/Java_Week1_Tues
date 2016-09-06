import java.io.Console;

public class App {
  public static void main(String[] args) {
  Console myConsole = System.console();

    ShelterAnimals dog = new ShelterAnimals();
     dog.mAge = 4;
     dog.mSpecies = "Poodle";
     dog.mGender = "Male";
     dog.mSize = "Medium";
     dog.mColor = "White";

    ShelterAnimals cat = new ShelterAnimals();
     cat.mAge = 2;
     cat.mSpecies = "Stray";
     cat.mGender = "Male";
     cat.mSize = "Small";
     cat.mColor = "Gray";

    ShelterAnimals rabbit = new ShelterAnimals();
     rabbit.mAge = 1;
     rabbit.mSpecies = "Dwarf";
     rabbit.mGender = "Male";
     rabbit.mSize = "Small";
     rabbit.mColor = "Black";

    ShelterAnimals[] allShelterAnimals ={ dog, cat, rabbit};
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
