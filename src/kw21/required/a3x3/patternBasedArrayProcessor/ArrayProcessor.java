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
        

        
        int musterSiteHeigth = 2; int musterSiteLength = 2;
        
        int testedFor = musterSiteHeigth + musterSiteLength;
        int startPosition = 0;
        
        int longestReiheMid = 999999999; 
        int longestReiheToCompare = 0;
        int longestReiheStartEnd = 999999999;
        int longestReiheBegrenzung = 0;
        
        long sum = 0;
        System.out.printf("theArray is: %n");
        for (int i = 0 ; i < theArray.length; i++) {
            for (int j = 0; j < theArray[i].length; j++) {
                System.out.printf("%d", theArray[i][j]);
            }
            System.out.println();
        }
        
        while (startPosition+testedFor <= theArray.length) {
            
            if (theArray[startPosition].length > 0 && theArray[startPosition+1].length > 0 && 
                    theArray[startPosition+2].length > 0 && theArray[startPosition+3].length > 0) {
                
                
                
            for (int i = startPosition; i<testedFor+startPosition; i++) {
                
                if (i - startPosition == 1 || i - startPosition == 2 ) {
                    longestReiheToCompare = theArray[i].length;
                      if (longestReiheToCompare<longestReiheMid) { 
                          longestReiheMid = longestReiheToCompare; 
                          
                    }//if inside if
                      
                }//if inside if and for
                else { 
                    longestReiheToCompare = theArray[i].length;
                     if (longestReiheToCompare < longestReiheStartEnd) {
                         longestReiheStartEnd = longestReiheToCompare;
                    }//if inside else 
                }//else
            }//for 
            
            if (longestReiheStartEnd >= longestReiheMid) {
                longestReiheBegrenzung = longestReiheMid;
            }//if 
            else if (longestReiheStartEnd < longestReiheMid) {
                longestReiheBegrenzung = longestReiheStartEnd+1; 
            }
            
            System.out.printf("Begrenzung %d %n",longestReiheBegrenzung);
            
           if (longestReiheBegrenzung > 0) {
            for (int j = 0; j <= longestReiheBegrenzung-testedFor; j++) {
                 
                for (int i = 0; i < musterSiteLength; i++) {
                    sum += theArray[startPosition][i+j+1]; System.out.printf("+ %d (%d) +", theArray[startPosition][i+j+1], j);
                    sum += theArray[startPosition+testedFor-1][i+j+1]; System.out.printf("+ %d (%d) +", theArray[startPosition+testedFor-1][i+j+1], j);
                }// for inside for and if(musterSiteLength)
            }//for 
            for (int j = 0; j <= longestReiheBegrenzung-testedFor; j++) {
                for (int i = 0; i < musterSiteHeigth; i++ ) {
                    sum += theArray[startPosition+1+i][j]; System.out.printf("+ %d (%d) +", theArray[startPosition+1+i][j], j);
                    sum += theArray[startPosition+1+i][j+testedFor-1]; System.out.printf("+ %d (%d) +", theArray[startPosition+1+i][j+testedFor-1], j);
                }// for inside for and if (musterSiteHeigth)
                
             }//for inside if
           }//if
        }
           startPosition++;
           longestReiheToCompare = 0;
           longestReiheBegrenzung = 0;
           longestReiheMid = Integer.MAX_VALUE; 
           longestReiheStartEnd = Integer.MAX_VALUE;
           System.out.println();
         
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
        
        return sum;   // <<<=== Diese Zeile ist falsch!   bzw. nur ein Platzhalter um den Compiler gluecklich zu machen. Die Zeile muss sinnvoll ersetzt werden.
    }//method()
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    // Führen Sie Änderungen oberhalb dieser Zeilen durch.
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
}//class
