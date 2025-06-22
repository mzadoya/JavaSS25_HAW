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
 * @version 2025/06/22 Version 1
 */

public class CardProcessor implements CardProcessor_I {

    Card card;

    Map<Card.Rank, Set<Card>> kartenMap = new HashMap<Card.Rank, Set<Card>>();

    public CardProcessor() {

    }

    /**
     * @return
     */
    @Override
    public Object process(final Card card) {
        
        assert card!=null : "Die übergebene Karte ist null";
        
        if (!kartenMap.containsKey(card.getRank())) { // Check ob ein Set für dieses Key schon exestiert
            kartenMap.put(card.getRank(), new HashSet<>()); // Falls nicht --> new Set für dieses Key erstellen
        }
        kartenMap.get(card.getRank()).add(card); // Karte speichern

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
            return Arrays.toString(kartenBack);
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
        this.card = null;
    }

    /**
     * @return card, kartenMap
     */
    @Override
    public String toString() {
        return kartenMap.getClass() + "[card=" + card + ", kartenMap=" + kartenMap + "]";
    }

}
