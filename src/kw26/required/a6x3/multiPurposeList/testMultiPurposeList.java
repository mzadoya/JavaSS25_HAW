package kw26.required.a6x3.multiPurposeList;

/**
 * Just an easy Test um zu Testen, wie die Daten bzw. Informations-Objekte
 * gespeichert werden.
 * 
 * @author Maksym Zadoya
 * @version 2025/07/01 #1
 */
public class testMultiPurposeList {

    public static void main(String[] args) {

        MultiPurposeList<String> newList = new MultiPurposeList<String>();

        newList.putNo(0, "Hi!");
        newList.putNo(1, "Wir");
        newList.putNo(2, "machen");
        newList.putNo(3, "ganz");
        newList.putNo(4, "einfachen");
        newList.putNo(5, "Test");

        newList.printElemFirstToLast();

        System.out.println();
        System.out.println("######Umgekehrte Reihenfolge#####");
        System.out.println();

        newList.printElemLastToFirst();

        System.out.println();
        System.out.println("### Weitere Elemente Einfuegen ###");
        System.out.println();

        newList.putNo(1, "gesagt");
        newList.putNo(1, "genauer");
        newList.putNo(1, "oder");
        newList.putNo(1, "Ich");

        newList.printElemFirstToLast();

        System.out.println();
        System.out.println("### Elemente loeschen ###");
        System.out.println();

        newList.remove("ganz");
        newList.remove("einfachen");

        newList.printElemFirstToLast();

        System.out.println();
        System.out.println("### Was passiert wenn zwei gleiche Elemente vorhanden sind? ###");
        System.out.println();

        newList.putNo(1, "Ich");
        newList.putNo(4, "Ich");

        newList.printElemFirstToLast();

        System.out.println();

        newList.remove("Ich");

        newList.printElemFirstToLast();

        System.out.println();

        newList.remove("Ich");

        newList.printElemFirstToLast();
        
        System.out.println(newList);

    }

}
