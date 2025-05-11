// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package kw20.optional.z2x4.nBlackFaceCards;


import static kw20.optional.z2x4.cards.Card.Constant.DIAMOND;
import static kw20.optional.z2x4.cards.Card.Constant.HEART;
import static kw20.optional.z2x4.cards.Card.*;
import static kw20.optional.z2x4.cards.Card.Constant.*;

import kw20.optional.z2x4.cards.Card;
import kw20.optional.z2x4.cards.Deck;
import kw20.optional.z2x4.cards.Card.Rank;
import kw20.optional.z2x4.cards.Card.Suit;
import kw20.optional.z2x4.cards.*;
import kw20.optional.z2x4.cards.Card.*;
import kw20.optional.z2x4.stuffBeginnersDontHaveToUnderstand.Version;


/**
 * Five Red Face Cards - see task
 * 
 * @author   Maksym Zadoya
 * @version  2025_05_11
 */
public class NBlackFaceCards {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_001___2025_05_04__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    /**
     * The method {@link #getDecodedVersion()} delivers the code version as reground/readable String.
     * @return version as decoded/readable String.
     */
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung.
    
    
    
    Card card;
    Deck deck = new Deck();
    int counter = 0;
    
    /**
     * "Draw" card until requestedAmount of black face cards are drawn
     */
    public void drawAndPrintCardsAsRequested( final int requestedAmount ){
            while (counter < requestedAmount) {
                card = deck.deal();
                System.out.printf("%s  ", card);
                Rank currentRank = card.getRank();
                Suit currentSuit = card.getSuit();
                switch (currentRank) {
                    case KING, QUEEN, JACK: 
                        if (currentSuit.equals(SPADES) || currentSuit.equals(CLUB)) {
                            counter +=1; System.out.printf("%n"); break;
                        }

                default: continue;
                }
            }
        System.out.flush();
    }//method()
    
}//class
