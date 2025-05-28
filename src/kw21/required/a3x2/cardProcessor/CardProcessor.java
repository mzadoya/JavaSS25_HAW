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
        
        int lengthOfArray = givenCards.length;
        
        for (int i = 0; i < cardMatrix.length; i++) {
            for(int j = 0; j < cardMatrix[0].length; j++) {
                for (int h = 0; h < givenCards.length; h++) {
                final Rank rankCard = givenCards[h].getRank();
                final Suit suitCard = givenCards[h].getSuit();
                final int cardSuitAsIndex = suitCard.ordinal();
                final int cardRankAsIndex = rankCard.ordinal();
                if (cardSuitAsIndex == i) {
                   if (cardRankAsIndex == j) {
                    cardMatrix[i][j] = givenCards[h];   
                     }//if inside if
                   }//if 
                }//for inside for inside for         
            }//for inside for
        }//for
        printCardMatrixForFun(cardMatrix);
        return cardMatrix;
    }//method
        
        public static void sortCards(Card[] cardArrayToBeSorted) {
            
            Card[][] cardMatrix = generateCardMatrix(cardArrayToBeSorted);
            int posCounter = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 13; j++) {
                    if (cardMatrix[i][j]!=null) {
                        cardArrayToBeSorted[posCounter] = cardMatrix[i][j];
                        posCounter++;
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
