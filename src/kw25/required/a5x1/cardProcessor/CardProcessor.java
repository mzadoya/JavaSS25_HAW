// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package kw25.required.a5x1.cardProcessor;

import static kw25.required.a5x1.cards.Card.*;

import static kw25.required.a5x1.cards.Card.Constant.*;
//
import kw25.required.a5x1.cards.*;
import kw25.required.a5x1.cards.Card.*;
import java.util.*;

/**
 * CardProcessor printing cards in reverse order - see task
 * 
 * @author (your name(s))
 * @version (a version number or a date)
 */
public class CardProcessor {

    /**
     * Die Methode reverseOrder() zieht solange Karten von einem Kartenstapel bis
     * eine gewünschte Karte gezogen wird und gibt danach alle gezogenen Karten in
     * umgekehrter Reihenfolge wieder aus.
     *
     * @param deck           der Kartenstapel von dem die Karten gezogen werden.
     * @param cardToCheck    die gewünschte Karte, die die Ziehung beendet.
     * @param kartenAusgeben true schaltet Kontrollausgabe an und false aus.
     */
    public void reverseOrder(Deck deck, Card cardToCheck, boolean kartenAusgeben) {
        Stack<Card> kartenStapel = new Stack<Card>();
        assert deck != null : "Deck ist null";
        assert cardToCheck != null : "Karte ist null";
        System.out.println("#####################START#####################");
        Card card;
        do {       //ziehen Karte, bis die gesuchte Karte gefunden ist oder kleiner als 52 Karten genommen ist (Sicherheit)
            card = deck.deal(); 
            assert card!=null : "Deck ist leer!";
            kartenStapel.add(card);
            if (kartenAusgeben) {
                System.out.println(card);
            }
        } while (!card.equals(cardToCheck) && kartenStapel.size() < 52);

        if (kartenStapel.contains(cardToCheck)) { //Sicherheit > Check, dass Karte gefunden wurde 
            System.out.printf("gesuchte Karte %s ist gefunden! %n", cardToCheck);

            while (!kartenStapel.isEmpty()) {  //nehmen die oberste Karte aus dem kartenStapel bis Stapel leer ist
                System.out.println(kartenStapel.pop());
            }
        } else {
            assert false : "+++ Gesuchte Karte ist nicht gefunden +++ Check TestFrameAndStarter.java ";
        }
        System.out.println("#####################ENDE#####################");
    }

}// class
