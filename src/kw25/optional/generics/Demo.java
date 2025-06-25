package kw25.optional.generics;

import java.util.*;

public class Demo {

    
    /** Generics lösen das Problem, dass für verschiedene Datentype separate Klassen oder
     * Methoden, die den konkreten Datentyp unterstützen. Grob gesagt - in Generic kann man
     * alles rein schmeissen, nun muss explicit gesagt werden was genau reingeschmissen wird. 
     * 
     * Genetische Typen existieren nur zur Compilezeit - sie werden in Rohtypen übersetzt
     * 
     * Typsicherheit - wenn beide Typen nicht zuweisungskompatibel sind, beisp. String zu Integer gibt
     * Compiler schon zur Kompilezeit eine Fehlermeldung, ohne wird Fehlermeldung nur zur LAUFZWIT ausgegeben.
     * aber!!!
     * generische Typen existieren NUR zur COMPILEZEIT, dynamische Typprüfung ist zur Laufzeit NICHT MÖGLICH!
     * Folge --> keine Typinformatik zur Laufzeit verfügbarf
     * Also Kurz gesagt: Generics existieren nur für den Compiler zur Typsicherheit, zur Laufzeit sind sie gelöscht
     * S. Stelle 3
     * 
     * Problematik 1 verdeutlicht dieses Problem 
     * 
     * @author Maksym Zadoya
     * @version 2025/06/25 #1
     */
    
    public static void main(String[] args) {
   
        //Problematik 1
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double [] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        
        /*
        um das ganze beispielsweise auszugeben, sollte map für jeden Datentyp eigene Implementierung 
        der Ausgabe schreiben, also 

        */
        displayArray(intArray);
        displayDouble(doubleArray);
        displayChar(charArray);
        
        //An der Stelle 1 ist es zu erkennen, wie simple das ganze ist
        
        displayAlles(intArray); displayAlles(doubleArray); displayAlles(charArray);
        
        //Es gibt auch angere Anwerndungen, beispielsweise s. Stelle 2
        
        System.out.println(getFirst(intArray));  
        System.out.println(getFirst(doubleArray)); 
        System.out.println(getFirst(charArray));
        
 /*       
        
        Sssssssss
        Sssssssss
        Ss
        Ss
        sssssssss
        sssssssss   t e l l e  3 
               ss
               ss
        sssssssss
        sssssssss
        
        */
        
        
        List<String> list = new ArrayList<>();
        if (list instanceof List<String> ) { System.out.println("Lol"); }
        
    }
    
    
    //Verdeutlichung der Problematik, weiter: nicht relevant
    public static void displayArray(Integer[] intArray) {
        for (/* --> */ Integer /* <-- */ i : intArray) {
            System.out.println(i);
        }
        System.out.println("#############Integer############");
    }
    
    public static void displayDouble(Double[] doubleArray) {
       for (/* --> */ Double /* <-- */ d : doubleArray) {
            System.out.println(d);
        }
       System.out.println("#############Double############");
    }
    
    public static void displayChar(Character[] charArray) {
        for (/* --> */ Character /* <-- */ c : charArray) {
             System.out.println(c);
         }
        System.out.println("#############Char############");
     }
   //Ende Problematik, weiter relevant
    
   //Um anstatt so viel Müll zu schreiben, könnte eine wiederverwendbare Methode implementiert werden,
   //und zwar:
    
    
    
    /**Stelle 1
     * 
     * Völlig unabhängig davon, welchen Parameter mit welchem Datentyp man in die Methode übergeben wird, 
     * wird Java das sofort erkennen und anpassen
     * 
     * @param <T> sagt dem Compiler "Jo! In dieser Methode verwende ich den Typ T, aber nur zur COMPILEZEIT
     * beim Aufruf der Methode sag ich dir Bescheid was fürn Typ ist dat. 
     * 
     * @param array verdeutlicht, dass der Parameter array ist ein Array über Elemente T
     */
    public static <T> void displayAlles(T[] array) {
        
        for (T things: array) {
            System.out.println(things);
        }
        System.out.println("#############Generic############");
    }
    
    
    
    /**Stelle 2
     * 
     * @param <T> Compiler Bro Diggi Achtung!! Weiter wird ein Typ T verwendet!!!
     * @param array über T (array über Generic)
     * @return T  die Methode liefer ein Typ T zurück (Falls ist ein array über Integer --> liefer Integer 
     * zurück, falls über String --> liefert String zurück)
     */
    public static <T> T getFirst(T[] array) {
        return array[0];
    }
    
    
}
