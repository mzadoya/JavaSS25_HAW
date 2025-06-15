package kw25.optional.collectionsTest1;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() { // Comparator
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else
                    return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();

        nums.add(45);
        nums.add(72);
        nums.add(15);
        nums.add(78);
        nums.add(11);
        nums.add(69);
        nums.add(16);
        nums.add(64);

        Collections.sort(nums, com); // com ist wie die Liste sortiert wird, ohne den zweiten Parameter
        // also ohne com wird ein Standardverfahren für Sortierung benutzt, die für
        // Liste spezifisch
        System.out.println(nums);

        Collections.sort(nums); // wird wie oben gennant ist nach einem Standardsortierung sortiert
        // (erste Zahl ist die mächtigste, 1X ist links bzw. quasi niedrigste Adresse,
        // 9x ist quasi höchste Adresse -> rechts)
        System.out.println(nums);

        Comparator<Autos> comAutos = new Comparator<Autos>() { // Comparator
            public int compare(Autos i, Autos j) {
                if (i.baujahr % 100 > j.baujahr % 100) {
                    return 1;
                } else
                    return -1;
            }
        };

        List<Autos> autos = new ArrayList<>();

        autos.add(new Autos(2012, "BMW", 103));
        autos.add(new Autos(2003, "Audi", 243));
        autos.add(new Autos(2014, "Mercedes", 94));
        autos.add(new Autos(2019, "Volkswagen", 146));
        autos.add(new Autos(2011, "Toyota", 750));

        System.out.println("Before Sort");
        for (Autos a : autos) {
            System.out.println(a);
        }

        Collections.sort(autos, comAutos);

        System.out.println("After Sort");

        for (Autos a : autos) {
            System.out.println(a);
        }

        // Collections.sort(autos); BUT!!! FAIl! Da sie nicht Comparible sind (Compiler
        // weisst nicht wie er Autos vergleichen muss)
        // s. Class Houses

        List<Houses> houses = new ArrayList<>();

        houses.add(new Houses(853256, 123));
        houses.add(new Houses(56399, 10));
        houses.add(new Houses(143674, 73));

        System.out.println("Before Sort");

        for (Houses h : houses) {
            System.out.println(h);
        }

        // jetzt werden Houses AUTOMATISCH mit bereit in der Klasse implementierten
        // Methode sortiert, dabei muss nicht ein
        // Comparator explizit hier geschr. werden oder als zweites Paramether
        // uebergeben

        Collections.sort(houses);

        System.out.println("After Sort");

        for (Houses h : houses) {
            System.out.println(h);
        }
    }

}
