package kw25.required.a5x3.cardComparator;


import static kw25.required.a5x3.cards.Card.*;
import static kw25.required.a5x3.cards.Card.Constant.*;

import java.util.*;

import kw25.required.a5x3.cards.*;
import kw25.required.a5x3.cards.Card.*;


/**
 * Comparator for Cards defining "usual order"
 * 
 * @author   Maksym Zadoya 
 * @version  2025/06/23 Version 1
 */
public class UsualOrder implements Comparator<Card> {

    @Override
    /**
     * @return card1 > card2 : card1 nach links 
     * @return card1 < card2 : card1 nach rechts 
     * @return card1 = card2 : check Farbe 
     */
    
    //TODO check ob in richtiger Reihenfolge alles (nach Aufgabestellung)
    
    public int compare(Card card1, Card card2) {
        if (card1.getRank().ordinal() > card2.getRank().ordinal()) {
            return -1;
        } else if (card1.getRank().ordinal() < card2.getRank().ordinal()) {
            return 1;
        } else {  //wenn die Karten den gleichen Rank haben, sollten beide nach Farbe sortiert werden
            if (card1.getSuit().ordinal() > card2.getSuit().ordinal()) {
                return -1;
            } else if (card1.getSuit().ordinal() < card2.getSuit().ordinal()) {
                return 1;
            } else
                return 0;
        }

    }

}