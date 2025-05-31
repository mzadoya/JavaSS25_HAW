package kw21.required.a3x2.cardProcessor;


import static kw21.required.a3x2.cards.Card.*;

import static kw21.required.a3x2.cards.Card.Constant.*;

//
import kw21.required.a3x2.cards.*;
import kw21.required.a3x2.cards.Card.*;



/**
 * CardProcessor - sort cards in-place - see task
 * 
 * @author  Maksym Zadoya
 * @version 28.05.2025 v1.ß
 */
public class CardProcessor {
    
  
    
        public static Card[][] generateCardMatrix (Card[] givenCards) {
            Card[][] cardMatrix = new Card[4][13];
        
        
        for (Card card : givenCards) {
            int suitIndex = card.getSuit().ordinal();
            int rankIndex = card.getRank().ordinal();
            cardMatrix[suitIndex][rankIndex] = card;
        }//for
        printCardMatrixForFun(cardMatrix);
        return cardMatrix;
    }//method
        
        public static void sortCards(Card[] cardsToSort) {
            
            Card[][] cardMatrix = generateCardMatrix(cardsToSort);
            int posIndex = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 13; j++) {
                    if (cardMatrix[i][j]!=null) {
                        cardsToSort[posIndex] = cardMatrix[i][j];
                        posIndex++;
                    }//if 
                }//for inside for
            }//for
        }//method
        
        
        //nicht relevant 
        
        public static void printCardMatrixForFun(Card[][] cardMatrix) {
           
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 13; j++) {
                    if (cardMatrix[i][j]!=null) {
                        System.out.printf("%2s ", cardMatrix[i][j]);
                    }//if
                    else System.out.printf(" ####  ");
                }//for inside for
                System.out.println();
            }//for
            System.out.println();
        }//method
}//class
