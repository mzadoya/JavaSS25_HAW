package kw20.vorlesungen.PT15Mai;

import kw20.vorlesungen.PT15Mai.cards.*;
import kw20.vorlesungen.PT15Mai.cards.Card.*;
import static kw20.vorlesungen.PT15Mai.cards.Card.*;
import static kw20.vorlesungen.PT15Mai.cards.Card.Constant.*;

public class FirstClass {
    

    //hat teilweise die Inhalte von PM Vorlesung am 20.05.2025

    public static void main(String[] args) {
    
    justDoIt();
    doSomething();
    
    
    int ersteZahl = 54; int zweiteZahl = 34; boolean istRueckgabeAktiv = true;
    swapInteger(ersteZahl,zweiteZahl, istRueckgabeAktiv);
    istRueckgabeAktiv = false;
    System.out.printf("%nBLOCK 1############################################################");
    System.out.printf("%njetzt werden die Werte im main Methode zurueckgegeben:");
    swapInteger(ersteZahl,zweiteZahl, istRueckgabeAktiv);
    System.out.printf("Zahl 1 nachher: %d, Zahl 2 nachher: %d %nDa wir nur die Werte Kopieren (ist integer, ein primitiver Datentyp"
            + ", werden sie nur innerhalb von Methode swap geaendert, %ndies beeinflusst die Werte in main Methode NICHT %n", ersteZahl, zweiteZahl);
    System.out.printf("ENDE BLOCK 1--------------------------------------------------------");
    
    System.out.printf("%n%nBLOCK 2############################################################");
    int[] erstesArray= {32};  int[] zweitesArray= {61};
    istRueckgabeAktiv = true;
    swapArray(erstesArray,zweitesArray,istRueckgabeAktiv);
    
    System.out.printf("%njetzt werden die Werte im main Methode zurueckgegeben:");
    istRueckgabeAktiv = false;
    swapArray(erstesArray,zweitesArray,istRueckgabeAktiv);
    System.out.printf("Zahl 1 nachher: %d, Zahl 2 nachher: %d %nEs ist zu sehen, dass bei Objekten wird die Referenz"
            + "auf das Objekt kopiert, deswegen sind die Aenderungen sowohl in main, %nals auch in swap Methode erkennbar sind ", erstesArray[0], zweitesArray[0]);
    System.out.printf("%nENDE BLOCK 2--------------------------------------------------------%n");
    
    int sumIntegers = 0; int randomNumberOne = 356; int randomNumberTwo = 135; 
    sumArgs(sumIntegers, randomNumberOne, randomNumberTwo);
    
    //Array kann auch uebergeben werden 
    
    int[] irgendwelcherRandomArrayFuerSumme = new int[30];
    for (int i = 0; i < irgendwelcherRandomArrayFuerSumme.length; i++ ) {
        irgendwelcherRandomArrayFuerSumme[i] = (i*12+245*1284)/1005;
      }
    sumArgs(sumIntegers, irgendwelcherRandomArrayFuerSumme);
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
   
   
   public static void swapInteger(int x, int y, boolean istRueckgabeAktiv) {
       System.out.printf("%nZahl 1 vorher: %d, Zahl 2 vorher %d %n", x, y);
       int temp = x;
       x = y;
       y = temp;
       if (istRueckgabeAktiv) {
       System.out.printf("Zahl 1 nachher: %d, Zahl 2 nachher: %d %n ", x, y);
       }
   }
   public static void swapArray(int[] x, int[] y, boolean istRueckgabeAktiv) {
       System.out.printf("%nZahl 1 vorher: %d, Zahl 2 vorher %d %n", x[0], y[0]);
       int[] temp = new int[1];
       temp[0] = x[0];
       x[0] = y[0];
       y[0] = temp[0];
       if (istRueckgabeAktiv) {
       System.out.printf("Zahl 1 nachher: %d, Zahl 2 nachher: %d %n ", x[0], y[0]);
       }
   }
   public static void sumArgs(int sumIntegers, int... variable) {
     
     for (int v : variable) {
         
         sumIntegers += v;
        }
     System.out.printf("%nDie Summe der gegebenen Werten ist %d", sumIntegers);
     }
}
