package kw20.vorlesungen.PT15Mai;

import kw20.vorlesungen.PT15Mai.cards.*;
import kw20.vorlesungen.PT15Mai.cards.Card.*;
import static kw20.vorlesungen.PT15Mai.cards.Card.*;
import static kw20.vorlesungen.PT15Mai.cards.Card.Constant.*;

public class FirstClass {

    public static void main(String[] args) {
       
    justDoIt();
    doSomething();

    }
    public static void doSomething() {
        int[] v = {1,3,5}; 
        for (int i = 0; i < 3; i ++) System.out.printf( "%d", v[i]);
     //   System.out.printf("$d\n", i); i hier ist nicht definiert, da i lokal in For-Schleife deklariert worden ist
    }
   public static void justDoIt() {
       
       //Idee: Karten ziehen und sortiert ausgeben 
       
       final boolean debugOutputEnable = true;
       final int numberOfDraws = 7; 
       
       final int numberOfRanks = 13;
       final int numberOfSuits = 4;
       
       final Deck deck = new Deck ();
       final Card[][] cardMatrix = new Card [numberOfSuits][numberOfRanks];
       
       // Die Karte ziehen -> die Karte merken
       
       for (int cardCounter=0; cardCounter<numberOfDraws; cardCounter++ ) {
          final Card card = deck.deal();
          final Rank rank = card.getRank();
          final Suit suit = card.getSuit();
          final int cardSuitAsIndex = suit.ordinal(); //что такое ordinal?
          cardMatrix[cardSuitAsIndex][card.getRank().ordinal()] = card; //schreibweise so oder so 
       }
   }
}
