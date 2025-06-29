package kw26.required.a6x2.wordCounter;

import java.util.*;

/**
 * @author Maksym Zadoya
 * @version 2025/06/29 #1
 */

public class WordCounter {

    final Map<Word, Counter> wordSpeicher;
    WordGrabber wg;

    /**
     * Parameterloser Konstruktor
     */
    public WordCounter() {

        wordSpeicher = new HashMap<Word, Counter>();
    }

    /**
     * Die Methode nimmt alle von WordGrabber übergebene Woerte und prüft, ob jedes
     * Wort schon in Map enthalten ist. Falls ja -> inсerementiert Counter, falls
     * nicht -> speichert das neue Key in Map und instantiiert ein Objekt der Klasse
     * Counter mit dem parameterlosen Default-Konstruktor, wobei Counter sofort auf
     * 0 gesetzt wird.
     * 
     * @param speicherort enthält den Speicherort auf dem PC, wo die Datei mit dem
     * Text zur Analyse liegt
     */
    public void printStatistic(String speicherort) {

        wg = new WordGrabber(speicherort);
        while (wg.hasNext()) { // gibts ein weiteres Wort -> go
            String nextWord = wg.next(); // -> speichern das naechste Wort, da bei mehrfachem Aufruf von wg.next() das
                                         // tatsaechlich
            // naechste Wort uebersprungen wird
            Word wordToSave = new Word(nextWord); // Zurueck zu Word -> sonst stimmt Parametertyp nicht

            if (!wordSpeicher.containsKey(wordToSave)) { // ist dieses Wort schon im Map?
                wordSpeicher.put(wordToSave, new Counter()); // neine -> speichern, Counter instantiieren mit count = 0
            }
            wordSpeicher.get(wordToSave).inc(); // erhoehen Counter fuer dieses Wort (key)
        }
        Word[] keyWordsArray = wordSpeicher.keySet().toArray(new Word[0]); // speichern alle keys in einem Array
        // um sie zu sortieren
        Arrays.sort(keyWordsArray, compareKeys);

        for (Word d : keyWordsArray) { // geben alle keys mit ihrer Anzahl aus
            System.out.printf("[ %s ] : %d %n", d.wort, wordSpeicher.get(d).count);
        }
    }

    Comparator<Word> compareKeys = new Comparator<Word>() {
        public int compare(Word word1, Word word2) {
            return word1.wort.compareTo(word2.wort); // Keys sortieren
        }
    };
} // genau 38 Zeilen (ohne JavaDoc) 😄
