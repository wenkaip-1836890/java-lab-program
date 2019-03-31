/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

 /**
  * The main method in this class checks the Deck operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
   /*
   String[] a = {"jack", "queen", "king"};
   String[] b = {"heart", "diamond", "spades"};
   int[] c = {1,2,3};
   String[] d = {"joker", "ace", "two"};
   String[] e = {"clubs", "spades", "diamond"};
   int[] f = {4,5,6};
   String[] g = {"three", "four", "five"};
   String[] h = {"diamond", "clubs", "heart"};
   int[] i = {7,8,9};
   Deck firstSet = new Deck(a,b,c);
   Deck secondSet = new Deck(d,e,f);
   Deck thirdSet = new Deck(g,h,i);
   System.out.println(firstSet.isEmpty());
   System.out.println(firstSet.size());
   System.out.println(firstSet.deal());
   System.out.println(firstSet.size());
   System.out.println(firstSet.toString());
   */
   String[] ranks = {"two","three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
   String[] suits = {"spades", "heart", "diamond", "clubs"};
   int[] pointValue = {2,3,4,5,6,7,8,9,10,10,10,10,11};
   Deck fourthSet = new Deck(ranks, suits, pointValue); 
   System.out.println(fourthSet.toString());
  }
}
