package kw24.required.a4x1.cardHand;

import java.util.Arrays;

import kw24.required.a4x1.cards.Card;

public class Hand {

    private Card[] cards;

    public Hand() {
        this(new Card[0]);
    }

    public Hand(Card... cards) {

        this.cards = cards;

        if (!hasValidCards()) {
            assert (false) : "+++NULL ERROR >>> CARDS NOT FOUND+++";
        }
    }

    public void add(Card... newCards) {
        Card[] allCards = new Card[cards.length + newCards.length];

        for (int i = 0; i < cards.length; i++) {
            allCards[i] = this.cards[i];
        }

        for (int i = this.cards.length; i < allCards.length; i++) {
            allCards[i] = newCards[i - this.cards.length];
        }
        this.cards = allCards;
    }

    public void add(Hand OtherHand) {

        Card[] allCards = new Card[this.cards.length + OtherHand.cards.length];

        for (int i = 0; i < this.cards.length; i++) {
            allCards[i] = this.cards[i];
        }

        for (int i = this.cards.length; i < allCards.length; i++) {
            allCards[i] = OtherHand.cards[i - this.cards.length];
        }
        this.cards = allCards;
    }

    public boolean isSuited() {

        if (this.cards.length == 0) {
            return true;
        }
        int farbeDerErstenKarte = cards[0].getSuit().ordinal();
        for (int i = 1; i < cards.length; i++) {
            if (farbeDerErstenKarte != cards[i].getSuit().ordinal()) {
                return false;
            }
        }
        return true;

    }

    public Card[] getHandCards() {
        return cards;
    }

    public void setHandCards(Card... newCardsInAHand) {
        this.cards = newCardsInAHand;
    }

    public boolean hasValidCards() {

        if (this.cards == null) {
            return false;
        }

        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Hand [cards=" + Arrays.toString(cards) + "]";
    }

}
