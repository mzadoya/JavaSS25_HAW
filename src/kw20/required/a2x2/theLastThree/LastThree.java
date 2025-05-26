// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package kw20.required.a2x2.theLastThree;
/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Wir erinnern uns: NIEMALS verschiedene Sprachen in einem Programm mixen.
 * Oder konkreter: Entweder Code, Variablen und Kommentar in deutsch oder in englisch.
 * Es gelten die in der Vorlesung besprochenen Regeln.
 * Es lohnt sich immer, die Vorlesungsinhalte zu kennen ;-)
 * 
 * Auch ist diese Art von Kommentar KEIN guter Kommentar.
 * Wir nutzen den Kommentar "hier" für Erklärungen und Ausführungen zur
 * Aufgabenstellung. Es  gilt "hier" die Regel:
 *  o) "Kommentar" der Kommentar ist in englisch.
 *  o) "Kommentar" der die Aufgabenstellung vertieft in deutsch.
 *     Löschen Sie derartigen Kommentar vor der Abgabe.
 * 
 * Im Rahmen der Aufgabenstellung müssen Sie GUTEN Kommentar schreiben.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */


/**
 * The {@link LastThree} - see task
 * 
 * @author   Maksym Zadoya
 * @version  2025_05_10
 */
public class LastThree {
    
    int value1;
    int value2;
    int value3;
    int counter = 0;
    
    /**
     * in the beginning there isn't any number known
     */
    public LastThree(){
       value1 = 0;
       value2 = 0;
       value3 = 0;
       counter = 0;
    }//method()
    
    /**
     * print the last three numbers/values
     */
    public void printLastThree(){
        switch(counter) {
            case 0: System.out.print("Sie haben noch keine Werte eingegeben...:("); break;
            case 1: System.out.printf("Sie haben nur einen Wert eingegeben: %d", value1); break;
            case 2: System.out.printf("Erste eingabe ist %d, die zweite ist %d", value2, value1); break;
            case 3: System.out.printf("pos1: %d, pos2: %d, pos3: %d", value3, value2, value1); break;
        }
    }//method()
    
    /**
     * process new value
     * 
     * @param value  current value
     */
    public void processNewValue( int value ){
        
        value3 = value2;
        value2 = value1;
        value1 = value;
        if (counter < 3) counter++;
    }//method()
    
}
