 public class FavoriteFoods {
  public static void main(String[] args) {


    String[] myFavoriteFoods = { "pizza", "tacos", "muffins", "hot cheetos", "chocolate", "curry" };
     //System.out.println( "I am eating " + myFavoriteFoods[0])

     //int increment = 0;
     for ( int increment = 0 ; increment < 5 ; increment++ ) {
       System.out.println( "I am eating " + myFavoriteFoods[increment]);
     }
    System.out.println( "I am full!" );
     //for (String foods : myFavoriteFoods ) {
       //System.out.println("I am eating " + food)
     //}
  }
 }
