public class Practice  {
 public static void main( String[] args) {
   String[] myFriends = { "Shelby", "Krishan", "Mona", "Ilena", "Kamaldeep" };
   String[] potluckItem = { "salt", "krispy treats", "marshmallows", "ice cream", "krispy creme" };

   int increment = 0;
   for ( String friend : myFriends ) {
     System.out.println( friend + " should bring " + potluckItem[increment]);
     //print Friend and potluckItem[increment]
     increment++;
   }

   }
   //System.out.println( Friend + "should bring " + dish );
 }
}
