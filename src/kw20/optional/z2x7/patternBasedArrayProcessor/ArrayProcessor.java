// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package kw20.optional.z2x7.patternBasedArrayProcessor;


/**
 * ArrayProcessor - see task
 * 
 * @author   Maksym Zadoya
 * @version  2025_05_11
 *
 */
public class ArrayProcessor {
    
    public long process( long[][] theArray ){
        
        for (int i = 0; i < theArray.length; i++) {
            System.out.println("a new one");
            for (int j = 0; j < theArray[i].length; j++) {
                 System.out.println(theArray[i][j]);
                    
                
            }
        }
        
        return 0;   
    }
  
}//class
