/**
 * This is a class that tests the Card class.
 */
public class CardTester {

 /**
  * The main method in this class checks the Card operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
   Card c = new Card("queen", "diamond", 4);
   Card a = new Card("king", "hearts", 2);
   Card b = new Card("queen", "diamond", 4);
   
   System.out.println(c.rank() + a.suit() + b.pointValue());
   System.out.println(b.matches(c));
   System.out.println(a.toString());
 }
}
