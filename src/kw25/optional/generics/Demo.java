package kw25.optional.generics;

import java.util.*;

import kw25.optional.generics.unnotiegeKlassen.*;


public class Demo {

    
    /** - Generics lösen das Problem, dass für verschiedene Datentype separate Klassen oder
     * Methoden, die den konkreten Datentyp unterstützen. Grob gesagt - in Generic kann man
     * alles rein schmeissen, nun muss explicit gesagt werden was genau reingeschmissen wird. 
     * 
     * - Genetische Typen existieren nur zur Compilezeit - sie werden in Rohtypen übersetzt
     * 
     * - Typsicherheit - wenn beide Typen nicht zuweisungskompatibel sind, beisp. String zu Integer gibt
     * Compiler schon zur Kompilezeit eine Fehlermeldung, ohne wird Fehlermeldung nur zur LAUFZWIT ausgegeben.
     * aber!!!
     * generische Typen existieren NUR zur COMPILEZEIT, dynamische Typprüfung ist zur Laufzeit NICHT MÖGLICH!
     * Folge --> keine Typinformatik zur Laufzeit verfügbarf
     * Also Kurz gesagt: Generics existieren nur für den Compiler zur Typsicherheit, zur Laufzeit sind sie gelöscht
     * S. Stelle 3
     * 
     * - Generic kann also auch in Klassen verwendet werden s. Stelle 4
     * 
     * - Wird in eine Methode noch die übergebene Generics unbekannt, also über welchen Typ, oder sollen 
     * universell gemacht werden, dass sie alle Type aktzeptieren können, so wird ? benutzt S. Stelle 5
     * 
     * -Wenn man noch mit Collection unsicher ist, ob man List, Set, Queue benutzen wird, schreibt man einfach Collection da vorne 
     * und kann im Prinzip alles benutzen und ändern. Dabei muss aber gegen ein Interface implementiert werden. S, Stelle 6 
     * 
     * Problematik 1 verdeutlicht dieses Problem 
     * 
     * @author Maksym Zadoya
     * @version 2025/06/26 #1
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
        if (list instanceof List<String> ) { System.out.println("Das funktioniert irgendwie, ist aber nicht korrekt"); }
        
        if (list instanceof List) { System.out.println("So wäre korrekte Überprüfung sichergestellt"); }
        
        /* Zur Errinerung: instanceof überprüft, ob ein Object zur einer Klasse gehört
         * 
         * Besser gesagt; ob ein Object ein Exemplar dieser Klasse ist
         * 
         * Liefert ein boolsches Wert zurück (t, f)
         * 
         * Syntax: Object instanceof Klassentyp 
        */
        
        
        
 /*       
        
        Sssssssss
        Sssssssss
        Ss
        Ss
        sssssssss
        sssssssss   t e l l e  4 
               ss
               ss
        sssssssss
        sssssssss
        
        */
        
        //Da wir unterschiedliche Datentype haben, sind verschiedene Klassen nötig
        
        IrgendwelcheUnnoetigeKlasseInteger newInt = new IrgendwelcheUnnoetigeKlasseInteger(12);
        IrgendwelcheUnnoetigeKlasseChar newChar = new IrgendwelcheUnnoetigeKlasseChar('@');
        IrgendwelcheUnnoetigeKlasseDouble newDouble = new IrgendwelcheUnnoetigeKlasseDouble(3.14);
    
        System.out.println(newInt.getValue());
        System.out.println("#############Integer Klasse############");
        System.out.println(newChar.getValue());
        System.out.println("#############Char Klasse############");
        System.out.println(newDouble.getValue());
        System.out.println("#############Double Klasse############");
        
        //Um das angesprochene Problem zu vermeiden, benutzt man Generics
        //s. GenericClass
        
        //jetzt darf man Objekte von der generischen Klasse erstellen 
        
        GenericClass<Integer> newIntGeneric = new GenericClass<Integer>  (48);
        GenericClass<Character> newCharGeneric = new GenericClass<Character> ('!');
        GenericClass<Double>  newDoubleGeneric = new GenericClass<Double> (2.71);
        
        System.out.println(newIntGeneric.getValue());
        System.out.println("#############Integer Klasse mit Generic############");
        System.out.println(newCharGeneric.getValue());
        System.out.println("#############Char Klasse mit Generic############");
        System.out.println(newDoubleGeneric.getValue());
        System.out.println("#############Double Klasse mit Generic############");
        
        /* 
         * 
         * sollte ein Generic Class zwei genetische Parameter haben, so könnte man solche Objekte 
         * ohne den zweiten Parameter nicht instanziieren, also:       
         */
       
        SecondGenericClass /* --> <Double> <-- */ <Double, Integer> newDoubleSecondGeneric = new SecondGenericClass<Double, Integer> (44.12, 24);
        //wäre ein Objekt nur mit einem Parameter instanziiert, so führte es zum Fehler, da 2 Parameter erwertet werden (ähnlich wie beim Map)
        
        System.out.println(newDoubleSecondGeneric.getValue());
        System.out.println("#############Double Klasse mit Generic mit 2 Parametern############");
        
        /*
         * Wenn man von vorne weisst, dass es angenommen nur Zahlen akzeptiert werden müssen, dann könnte man Generic so begrenzen, dass nur Zahlen 
         * erlaubt werden. 
         * 
         */
        GenericClassOnlyForNumbers <Double> newDoubleGenericOnlyNumbers = new GenericClassOnlyForNumbers<Double>(19.9);
        // Char werden nicht akzeptiert -> GenericClassOnlyForNumbers <Char> newCharGenericOnlyNumbers = new GenericClassOnlyForNumbers<Char>('C');
        
        
        //Stelle 5 Aufruf
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);
        
        List<Character> charList = new ArrayList<>();
        charList.add('$');
        printList(charList);
        
        
/*       
        
        Sssssssss
        Sssssssss
        Ss
        Ss
        sssssssss
        sssssssss   t e l l e  6 
               ss
               ss
        sssssssss
        sssssssss
        
        */
        
        
        Collection<Integer> somethingToSave;
        
        //Dann kann Man heute ArrayList benutzen, da es grade komplett ausreichend ist
        
        somethingToSave = new ArrayList <>();
        
        //Dann reichen features nicht komplett aus, man benutzt dadurch HashSet, vllt. sortierung ist nicht relevant geworden
        
        somethingToSave = new HashSet <>();
        
        //Nächste Woche ist Sortierung doch wieder wichtig und Eigenschaften von Queue nötig sind
        
        somethingToSave = new  PriorityQueue<>();
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
    
    /**
     * Stelle 5
     * 
     * @param myList
     */
    
    public static void printList(List<?> myList) {
        System.out.println(myList);
    }
}
