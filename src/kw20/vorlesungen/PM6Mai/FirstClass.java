package kw20.vorlesungen.PM6Mai;
import java.util.Arrays;

public class FirstClass {

    
    int zustandVariable = 256; // eine Zustandvariable 
    public void CodeUnderTest(String[] args) { 
        zustandVariable++;
        System.out.printf( "1 Test mit einer ZustandVaribale %4d", zustandVariable);
    }
   public void LokaleVariableDeklaration(String[] args) { 
       int eineLokaleVariable = 128;    
       zustandVariable = 89; 
   }
   public void VersuchLokaleVariableZuBenutzen(String[] args) {
       /* System.out.printf( "1 Test mit einer lokalen Variable %d", eineLokaleVariable); 
 Fehler Meldung! 
 */
       System.out.printf( "1 Test mit einer ZustandVaribale %4d", zustandVariable);
   }
   
   public static void main (String[] args) {
   int[] arrayA ;
   arrayA = new int[5];
   for (int i=0; i<5; i++)  arrayA[i]=i;
   
   int[] b;
   b = new int[] {5,6,7,8};
   
   int[] c = {1,3,5,7}; //sonderfall deklaration+zuwaeisung (initialisierung)
   
   int[] arrayK;
   arrayK = new int [4];
   for (int i = 0; i < arrayK.length; i++) {
       arrayK[i] = i+1;
   }
   for (int i = 0; i < arrayK.length; i++) {
       System.out.println (arrayK[i]);        //ausgabe v1
   }
   System.out.println(Arrays.toString(arrayK)); //ausgabe v2 (import java.util.Arrays; is benötigt)
   
   int summeArray = 0;
   for (int i = 0; i<arrayK.length; i++) {
       summeArray += arrayK[i];
   }
   System.out.print(summeArray); 
     }
}
