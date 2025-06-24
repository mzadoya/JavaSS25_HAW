package kw25.required.a5x4.tripleFinder;

import java.util.*;

import kw25.required.a5x4.cards.*;

import static kw25.required.a5x4.cards.Card.*;
import static kw25.required.a5x4.cards.Card.Constant.*;
//
import kw25.required.a5x4.cards.*;
import kw25.required.a5x4.cards.Card.*;
import kw25.required.a5x4.stuffBeginnersDontHaveToUnderstand.*;

/**
 * @author Maksym Zadoya
 * @version 2025/06/24 Version 1
 */

public class CardProcessor implements CardProcessor_I {

    final Map<Card.Rank, Set<Card>> kartenMap = new HashMap<Card.Rank, Set<Card>>();
    
    /**
     * Parameterloser Konstruktor 
     */
    public CardProcessor() {

    }

    /**
     * @version 2025/06/23 #1
     * @param card    Die übergebene in Methode Karte, die verarbeited werden muss
     * @return Ein aus 3 Karten bestehendes Array, wenn ein Drilling vorliegt, sonst {@code null}
     */
    @Override
    public Object process(final Card card) {
        
        assert card!=null : "Die übergebene Karte ist null";
        
        if (!kartenMap.containsKey(card.getRank())) { // Check ob ein Set für dieses Key schon exestiert
            kartenMap.put(card.getRank(), new HashSet<>()); // Falls nicht --> new Set für dieses Key erstellen
        } kartenMap.get(card.getRank()).add(card); // Karte speichern
        /*
         * if (kartenMap.get(card.getRank()).size() == 3) { //Fall 3 Karten mit dem
         * gleichen Rank schon übergeben worden sind 
         * Lol ... Card[] kartenBack = kartenMap.get(card.getRank()).toArray(new Card[kartenMap.get(card.getRank()).size()]); 
         */

        if (kartenMap.get(card.getRank()).size() == 3) {
            Card[] kartenBack = new Card[3]; // Erstellen lokale Variable in diesem Scope, speichern in die die Karten,
                                             // die mit diesem Rank-Key liegen
            int i = 0;
            for (Card c : kartenMap.get(card.getRank())) {
                kartenBack[i++] = c;
            }
            kartenMap.get(card.getRank()).clear();

            // TODO fix or find a solutioon or its ok...?
            System.out.printf("%n %n");
            System.out.println(Arrays.toString(kartenBack)); // Debug output

            return kartenBack;
            
        } else
            return null;
    }

    /**
     * Alle gepeicherte Karten werden gelöscht
     * 
     */
    @Override
    public void reset() {
        kartenMap.clear();
    }

    /**
     * @return Klassenname mit kartenMap im Form eines Strings
     */
    @Override
    public String toString() {
        return this.getClass() + "[kartenMap=" + kartenMap + "]";
    }

    
}
