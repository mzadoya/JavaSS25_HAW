package kw25.required.a5x3.cardComparator;


import static kw25.required.a5x3.cards.Card.*;
import static kw25.required.a5x3.cards.Card.Constant.*;

import java.util.*;

import kw25.required.a5x3.cards.*;
import kw25.required.a5x3.cards.Card.*;

/**
 * Comparator for Cards defining "usual order"
 * 
 * @author Maksym Zadoya
 * @version 2025/06/24 #1
 */
public class UsualOrder implements Comparator<Card> {

    @Override
    /**
     * 
     * kreuz.ordinal = 0 asChar 'C' 
     * karo.odrinal  = 1 asChar 'D' 
     * herz.ordinal  = 2 asChar 'H'
     * pik.ordinal   = 3 asChar 'S'
     * 
     * Reihenfolge Rank: A < K < Q < J 
     * Reihenfolge Farbe: C < S < H < D
     * 
     * @return card1 > card2 : card1 nach links
     * @return card1 < card2 : card1 nach rechts
     * @return card1 = card2 : check Farbe: C < S < H < D
     */

    public int compare(Card card1, Card card2) {
        int result = 0;
        if (card1.getRank().ordinal() > card2.getRank().ordinal()) {
            return -1;
        } else if (card1.getRank().ordinal() < card2.getRank().ordinal()) {
            return 1;
        } else { // wenn die Karten den gleichen Rank haben, sollten beide nach Farbe sortiert werden

            switch (card1.getSuit().ordinal()) {
                
                case 0:
                    result = -1;
                    break;
                    
                case 1:
                    result = 1;
                    break;
                    
                case 2:
                    if (card2.getSuit().ordinal() == 1) {
                        result = -1;
                    } else
                        result = 1;
                    break;
                    
                case 3:
                    if (card2.getSuit().ordinal() != 0) {
                        result = -1;
                    } else
                        result = 1;
                    break;
                    
                default:
                    assert false : "Fatal Error >> Suit ist nicht gefunden >>> Eingabe: " + card1 + card2;

            }
            return result;

        }

    }
}

