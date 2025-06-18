package kw25.optional.collectionsMap;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        /*
         * Allgemein 
         * 
         * 1) Map erbt von Collection nicht, aber ist ein Teil von Collection API
         * 2) Typparametern (also Map --> <String, Integer> <-- im Beispiel, können ganz beliebig sein, also <Integer, String> usw..., 
         * ABER! nur 2! Map<String, Integer, Integer> oder mehr geht nicht!
         * 3) Keys sind einzigartig -- die Duplikate mit dem gleichen Key wird ersetzt mit dem neuen (s. Kommentar z. 28-32) 
         */

        Map<String, Integer> students = new HashMap<>();
        students.put("Maksym", 50);
        students.put("Denys", 100);
        students.put("Schmekel", 60);
        students.put("Parsa", 86);
        students.put("Parsa", 86);
        
        System.out.println(students); //ALLE students (keys) und dazugehörige Elemente werden ausgegeben
        
        System.out.println(students.get("Maksym")); //Elemente, die NUR zu diesem Key gehören werden ausgegeben 
        
        //leider aufgrund einer Tippfehler oder aus Versehen KA hat Prof falsche NOte dem Student Maksym zugewiesen. 
        
        students.put("Maksym", 100);
        
        /* Falls man das gleiche Key nochmal benutzt, werden die zuvor zugewiesene diesem Key Elemente ersetzt bzw. überschrieben mit neuen, da
         * wie gesagt -- Map erlaub Duplikaten NICHT
         */
        
        
        System.out.println(students.keySet()); // so werden alle Keys ausgegeben, oder...: 
        
        for (String s : students.keySet()) {
            System.out.print(" key: " + s);
        }
        
        System.out.println();
        
        
        System.out.println(students.values()); // und im Prinzip genauso mit den Elementen 
        
        for (int w : students.values()) {
            System.out.print(" Note: " + w);
        }
        
        //genauso funktionier mit TreeMap, der Unterschied ist halt nur, dass die sortiert werden (vllt. s. CollecionSet)
        
        Map<Integer, Bussgeld> bussgeld = new TreeMap<>();  //das wäre eine Lösung zu Punkt 2 Allgemein
        
        bussgeld.put(45,new Bussgeld("Mercedes-Benz","LG8888JT", 65.70f, 1));
        bussgeld.put(48,new Bussgeld("Toyota","WL254T", 71.10f, 2));
        bussgeld.put(37,new Bussgeld("Audi","HH7777A6", 26.10f, 0));
        bussgeld.put(71,new Bussgeld("BMW","PI12C", 160.05f, 4));
        
        System.out.println(bussgeld);
        
        //TODO Map<keine Ahnung was, Map<ka was, Map <ka was, ka was > > > ... 
    }

}
