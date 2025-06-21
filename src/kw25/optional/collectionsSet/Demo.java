package kw25.optional.collectionsSet;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        /*
         * 1) in Set exestieren keine Duplikaten 2) ein Element kann nicht mit nums[i]
         * aufgerufen werden => Index funktioniert bzw. exestiert nicht! 3) get und set
         * sind auch nicht erlaubt
         * 
         */

        /*
         * Konkret über HashSet
         * 
         * 1) werden ungeordnet gespeichert, also quasi irgendwie random mit hash of
         * Value
         * 
         */
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(6); // Hinzufügt
        nums.add(2); // Hinzufügt
        nums.add(3); // Hinzufügt
        nums.add(4); // Hinzufügt
        nums.add(82); // Hinzufügt

        nums.add(6); // Nicht hinzufügt! => Duplikate!
        nums.add(2); // Nicht hinzufügt! => Duplikate!

        nums.add(11); // Hinzufügt

        System.out.print(nums.toString());

        System.out.println();
        System.out.println("Jetzt HashSet:%n");
        /*
         * Konkret über TreeSet
         * 
         * 1) werden sortiert gespeichert
         * 
         * Anmerkung: sortiert heisst, dass die Elemente nach einem Prinzip sortiert
         * werden z.B. geordnet heisst, wenn die Elemente so gespeichert werden, in
         * welcher Reihenfolge sie hinzufügt worden sind
         * 
         * Beispiel: Arraylist: x.add("Beta") x.add("Alpha") x.add("Omega") => [Beta,
         * Alpha, Omega] ThreeSet: x.add("Beta") x.add("Alpha") x.add("Omega") =>
         * [Alpha, Beta, Omega] >> Alphabethische Reihenfolge
         * 
         */

        Set<Integer> secondNums = new TreeSet<Integer>();

        secondNums.add(6); // Hinzufügt
        secondNums.add(2); // Hinzufügt
        secondNums.add(3); // Hinzufügt
        secondNums.add(4); // Hinzufügt
        secondNums.add(82); // Hinzufügt

        secondNums.add(6); // Nicht hinzufügt! => Duplikate!
        secondNums.add(2); // Nicht hinzufügt! => Duplikate!

        secondNums.add(11); // Hinzufügt

        System.out.print(secondNums.toString()); // kleinste Zahl ... grosste Zahl

        System.out.println("Jetzt Iterator:%n");
        /*
         * Weitere Anmerkungen:
         * 
         * 1) Collection erbt von Iterable 2) Iterable hat iterator
         */

        Iterator<Integer> values = secondNums.iterator();

        while (values.hasNext()) {
            System.out.println(values.next());
        }
    }

}
