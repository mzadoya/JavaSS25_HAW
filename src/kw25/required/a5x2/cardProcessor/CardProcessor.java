// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package kw25.required.a5x2.cardProcessor;


import static kw25.required.a5x2.cards.Card.*;
import static kw25.required.a5x2.cards.Card.Constant.*;
import kw25.required.a5x2.cards.*;
import kw25.required.a5x2.cards.Card.*;
import java.util.*;


/**
 * CardProcessor removing duplicates - see task
 * 
 * @author   Maksym Zadoya 
 * @version  2025/06/21 Version 1
 */
public class CardProcessor {
    
    /**
     * Die Methode removeDuplicates() entfernt Doppelte aus den übergebenen Karten.
     * Welche Karte (von den mehrfach vorhandenen Karten) übrig bleibt ist egal.
     * Wichtig ist, dass es bei den als Ergebnis abgelieferten Katen keine Doppelten gibt,
     * aber sonst jede Karten erhalten bleibt. 
     *
     * @param cards     die übergebenen Karten aus denen die Doppelten entfernt werden.
     * 
     * @return          die Karten befreit von Doppelten.
     */
    public Card[] removeDuplicates(Card[] cards) {
     Set<Card> einzigartigeKarten = new HashSet<Card>(); //In Aufgabestellung ist eine TreeSet nicht gefördert, deswegen Hash --> schneller 
     isKartenNull(cards);
     for (Card c : cards) {   //Speichern jede Karte in Set, dabei kann Set keine Duplicaten enthalten 
     einzigartigeKarten.add(c);
     }
     Card[] cardsArray = einzigartigeKarten.toArray(new Card[einzigartigeKarten.size()]);  //Nachdem alle doppelten Karten ignoriert wurde, werden einzigartige Karten gespeichert 
      
     return cardsArray;
  }
    /**
     * Die Methode isKartenNull() überprüft, ob das ganze übergebene Array über Karten null ist 
     * oder das eine beliebige Stelle den Wert null enthäht.
     *  
     * @param cards    die übergebene Karten sollen überprüft werden 
     */
    private void isKartenNull(Card[] cards) {
        assert cards!=null : "Array über Karten ist null";
        for (Card c : cards) {
          assert c!=null : "Eingabe Error: Karte ist null";
        } 
    }
    
}//class
