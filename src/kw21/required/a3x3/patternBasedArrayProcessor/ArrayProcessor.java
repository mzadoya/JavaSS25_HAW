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
    

    public long process( long[][] theArray ){
        

        
        int patternHeight = 2; int patternWidth = 2;
        
        int patternSize = patternHeight + patternWidth;
        int startPosition = 0;
        
        int minMiddleRowLength, currentRowLength, minEdgeRowLength, limitLength;

        long totalSum = 0;
        
        while (startPosition+patternSize <= theArray.length) {
           
            currentRowLength = 0;
            limitLength = 0;
            minMiddleRowLength = Integer.MAX_VALUE; 
            minEdgeRowLength = Integer.MAX_VALUE;
                
            for (int i = startPosition; i<patternSize+startPosition; i++) {
                
                if (i - startPosition == 1 || i - startPosition == 2 ) {
                    currentRowLength = theArray[i].length;
                      if (currentRowLength<minMiddleRowLength) { 
                          minMiddleRowLength = currentRowLength; 
                          
                    }//if inside if
                      
                }//if inside if and for
                else { 
                    currentRowLength = theArray[i].length;
                     if (currentRowLength < minEdgeRowLength) {
                         minEdgeRowLength = currentRowLength;
                    }//if inside else 
                }//else
            }//for 
            
            if (minEdgeRowLength >= minMiddleRowLength) {
                limitLength = minMiddleRowLength;
            }//if 
            else { limitLength = minEdgeRowLength+1; 
            }
            
         if (limitLength >= 4) {
            for (int j = 0; j <= limitLength-patternSize; j++) {
                 
                for (int i = 0; i < patternWidth; i++) {
                    totalSum += theArray[startPosition][i+j+1];
                    totalSum += theArray[startPosition+patternSize-1][i+j+1]; 
                }// for inside for and if(musterSiteLength)
                for (int i = 0; i < patternHeight; i++ ) {
                    totalSum += theArray[startPosition+1+i][j];
                    totalSum += theArray[startPosition+1+i][j+patternSize-1];
                }// for inside for and if (musterSiteHeigth)
                
             }//for inside if
           }//if
        
            startPosition++;
    }//while
        
        /*  for (int i = startPosition; i<testedFor+startPosition; i++) {
        longestReiheToCompare = theArray[i].length;
        if (longestReiheToCompare>longestReiheMid) { longestReiheMid = longestReiheToCompare; 
       }
    }
    for (int i = startPosition; i<testedFor+startPosition; i++) {
        longestReiheToCompare = theArray[i].length;
        if (longestReiheToCompare<longestReiheMid) { longestReiheMid = longestReiheToCompare; 
       }
    }
    */
        
        
        
        
        
        
        
        
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
        
        return totalSum;   // <<<=== Diese Zeile ist falsch!   bzw. nur ein Platzhalter um den Compiler gluecklich zu machen. Die Zeile muss sinnvoll ersetzt werden.
    }//method()
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    // Führen Sie Änderungen oberhalb dieser Zeilen durch.
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
}//class
