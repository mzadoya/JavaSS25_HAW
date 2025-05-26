// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package kw20.required.a2x1.simplifiedBlackJack;


import kw20.required.a2x1.cards.*;

import kw20.required.a2x1.cards.Card.*;
import static kw20.required.a2x1.cards.Card.*;
import static kw20.required.a2x1.cards.Card.Constant.*;



/**
 * Simplified Black Jack Agent - see task
 * 
 * @author   Maksym Zadoya
 * @version  2025_05_10
 */
public class SimplifiedBlackJackAgent {

    Card   card;
    Deck   deck = new Deck();
    
    int Punkte = 0;
    
    /**
     * "Play" Black Jack
     */
    public void playBlackJack(){
        
       while (Punkte < 17) {
          card = deck.deal();
          System.out.printf("%s %n", card);
          Rank currentRank = card.getRank();
          switch (currentRank) {
              case JACK, TEN, QUEEN, KING: Punkte +=10; break;
              case ACE: Punkte +=11; break;
              case TWO: Punkte +=2; break;
              case THREE: Punkte +=3; break;
              case FOUR: Punkte +=4; break;
              case FIVE: Punkte +=5; break;
              case SIX: Punkte +=6; break;
              case SEVEN: Punkte +=7; break;
              case EIGHT: Punkte +=8; break;
              case NINE: Punkte +=9; break;
              default: assert (false) : "ERROR: Something went wrong...";
          }
           
       }
       if (Punkte <= 21) {
           System.out.printf("Wow! %2d Points!", Punkte);
       }
       else System.out.printf("LOST: %2d Points", Punkte);
       
        System.out.flush();
    }//method()
    
}//class
