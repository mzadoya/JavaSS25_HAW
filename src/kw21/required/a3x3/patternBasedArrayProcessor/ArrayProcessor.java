// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package kw21.required.a3x3.patternBasedArrayProcessor;


/**
 * ArrayProcessor - see task
 * 
 * @author   (your name(s)) 
 * @version  (a version number or a date)
 *
 */
public class ArrayProcessor {
    
    //###
    //###
    //###
    //###         HIER kommt Ihr Code hin ;-)
    //###
    //###                    VVVV
    //###                    VVVV
    //###                    VVVV
    //###   VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
    //###      VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
    //###         VVVVVVVVVVVVVVVVVVVVVVVVVV
    //###            VVVVVVVVVVVVVVVVVVVV
    //###               VVVVVVVVVVVVVV
    //###                  VVVVVVVV
    //###                     VV
    public long process( long[][] theArray ){
        

        
        int musterSiteHeigth = 2; int musterSiteLength = 2;
        
        int testedFor = musterSiteHeigth + musterSiteLength;
        int startPosition = 0;
        
        int longestReihe = 0; 
        int longestReiheToCompare = 0;
        
        long sum = 0;
        
        while (startPosition+testedFor <= theArray.length) {
            
           for (int i = startPosition; i<testedFor+startPosition; i++) {
               longestReiheToCompare = theArray[i].length;
               if (longestReiheToCompare>longestReihe) { longestReihe = longestReiheToCompare; 
              }
           }
           for (int i = startPosition; i<testedFor+startPosition; i++) {
               longestReiheToCompare = theArray[i].length;
               if (longestReiheToCompare<longestReihe) { longestReihe = longestReiheToCompare; 
              }
           }
           
          // for (int i = startPosition; i < testedFor+startPosition; i++) {
            for (int j = 0; j < longestReihe-testedFor+1; j++) {
                 
                for (int i = 0; i < musterSiteLength; i++) {
                    sum += theArray[startPosition][i+j+1];
                    sum += theArray[startPosition+testedFor-1][i+j+1];
                }
                
                for (int i = 0; i < musterSiteHeigth; i++ ) {
                    sum += theArray[startPosition+1+i][j];
                    sum += theArray[startPosition+1+i][j+testedFor-1];
                }
                
             }
         //  }
           startPosition++;
           longestReihe = 0;
           longestReiheToCompare = 0;
        }
        
        
        
        
        
        
        
        
        
        
       /* 
        
        
        
        int arrayHigth = theArray.length;
        int arrayWidth = theArray[0].length;
        boolean[][] isPosNotNull = new boolean[arrayHigth][arrayWidth];
        
        int maxPasst = 0;
        
        
 
        
        int aktuellPosX = 1;
        int aktuellPosY = 1;
        
        long tempSum = 0;
        long ergebnis = 0;
        
        boolean isLength = true;
        for (int i = 0; i < 2; i++) {
            if (isLength) {
            for (int j = aktuellPosX; j < musterSiteLength+aktuellPosX; j++) {
                if (theArray[j][aktuellPosY]!=null && theArray[j][aktuellPosY+musterSiteHeigth+1]!=null) {
                    tempSum += theArray[aktuellPosY][j];
                    tempSum += theArray[aktuellPosY+musterSiteHeigth+1][j];
                   }
                }
            }
            if (!isLength) {
            for (int j = aktuellPosY; j < musterSiteHeigth+aktuellPosY; j++) {
                if (theArray[aktuellPosX-1][j]!=null&&theArray[aktuellPosX+musterSiteLength+1][j]!=null) {
                    tempSum += theArray[j][aktuellPosX-1];
                    tempSum += theArray[j][aktuellPosX+musterSiteLength+1];
                   }
                }
            }
            isLength = !isLength;
        }
        
        
        */
        
        return sum;   // <<<=== Diese Zeile ist falsch!   bzw. nur ein Platzhalter um den Compiler gluecklich zu machen. Die Zeile muss sinnvoll ersetzt werden.
    }//method()
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    // Führen Sie Änderungen oberhalb dieser Zeilen durch.
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
}//class
