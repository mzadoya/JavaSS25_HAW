package kw20.vorlesungen.PM13MaiMethoden; 
import java.util.Random;

public class Package {
    
    
    
    public static void main(String[] args) {
        Random randomGenerator = new Random(); //ignorieren 
        int upperBondForNumbers = 255;
        int upperBondForArraysSize = 12;

      makeATest(); //Prozedur ohne Rückgabewert
      
      int aTestValue1 = randomGenerator.nextInt(upperBondForNumbers), aTestValue2 = randomGenerator.nextInt(upperBondForNumbers); 
      System.out.printf("Die Zahlen lauten: %d und %d %n", aTestValue1, aTestValue2);
      
      int resultAddition = computeAValue(aTestValue1,aTestValue2);
      System.out.printf("%d + %d ergibt %d oder direkt als Ausgabe %d %n", aTestValue1, aTestValue2, resultAddition, computeAValue(aTestValue1,aTestValue2));
      
      int[] aTestArray = new int[randomGenerator.nextInt(upperBondForArraysSize)];
      System.out.printf("Array hat die Grosse von %d besteht aus: ", aTestArray.length);   
      for(int i = 0; i < aTestArray.length; i++) {
          aTestArray[i] = randomGenerator.nextInt(upperBondForNumbers);     // füllen Array mit Random Numbers 
          System.out.printf("pos%d: %d ", i, aTestArray[i]);   
      }
      System.out.println();
     
      int resultSumArray = avg(aTestArray); // Übergeben Array in eine Funktion aka Methode um die Summe aller Zahlen zu berechnen 
      System.out.printf("Die Summe lautet: %d, wobei Mittelwert %d ist", resultSumArray, resultSumArray/aTestArray.length);
      
    
    }
    
    public static void makeATest()  // Methodenkopf 
    { //Methodenblock
        System.out.printf("Hi Bro, dein Code funktioniert!!!! %n"); //Methodenblock
    } //Methodenblock
    
    public static int computeAValue(int value1, int value2) {
        return (value1+value2);
    }
    
    public static int avg (int[] inputArrayVonElementen) {
        int ergebnis = 0;
        for (int i = 0; i < inputArrayVonElementen.length; i++) {
            ergebnis += inputArrayVonElementen[i];
        }
        return ergebnis;
    }
}
