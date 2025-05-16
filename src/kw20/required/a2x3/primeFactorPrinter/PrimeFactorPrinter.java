// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package kw20.required.a2x3.primeFactorPrinter;
/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Wir erinnern uns: NIEMALS verschiedene Sprachen in einem Programm mixen.
 * Oder konkreter: Entweder Code, Variablen und Kommentar in deutsch oder in englisch.
 * Es gelten die in der Vorlesung besprochenen Regeln.
 * Es lohnt sich immer, die Vorlesungsinhalte zu kennen ;-)
 * 
 * Auch ist diese Art von Kommentar KEIN guter Kommentar.
 * Wir nutzen den Kommentar "hier" für Erklärungen und Ausführungen zur
 * Aufgabenstellung. Es  gilt "hier" die Regel:
 *  o) "Kommentar" der Kommentar ist in englisch.
 *  o) "Kommentar" der die Aufgabenstellung vertieft in deutsch.
 *     Löschen Sie derartigen Kommentar vor der Abgabe.
 * 
 * Im Rahmen der Aufgabenstellung müssen Sie GUTEN Kommentar schreiben.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */


/**
 * PFP :  {@link PrimeFactorPrinter} - see task.
 * 
 * @author   Maksym Zadoya
 * @version  2025_05_10
 */
public class PrimeFactorPrinter {
    
    /**
     * print factorization of given number
     * 
     * @param number the number to be factorized
     */
    public void printFactorization( long number ){
        
        if (number > 1)  {
        while (number > 1) {
            int i = 2;
            while (number%i!=0) {
                i++;
            }
            System.out.print(i);
            number = number / i;
            if (number!=1)  System.out.print(" * ");
        }
      }
        else assert (false) : "Deine Zahl ist zu klein :(";  
        System.out.flush();
    }
    
    public long integerSquareRoot( final long value ){
        if( 0 > value )  throw new IllegalArgumentException( String.format( "Parameter %d has to be positive",  value ));
        
        
        long approximation = 0;                                                 // the approximation itself
        if( value < (1L<<62) ){
            //\=> can be handled the fast way
            
            // determine msb position of approximation resp. later sqrt  resp. start position of "walking one setter"
            long tmp = value;                                                   // temporary to determine maxb position of approximation
            int currentBitPosition = 0;                                         // current bit position where setting of bit is tested
            if( 0 < tmp ){
                tmp >>>= 2;
                approximation = 1;
                while( 0 < tmp ){
                    tmp >>>= 2;
                    approximation <<= 1;
                    currentBitPosition++;
                }//while
                
                // start of actual integer square root computation
                // compute integer square root with: w = integerSqrt(x)    =>    (w+1)*(w+1) > x  &&  w*w <= x 
                long remainder = value - (approximation<<currentBitPosition);
                do{
                    final long refinement = 1L<<currentBitPosition;
                    final long trialResult =  remainder  -  (((approximation<<1) + refinement) << currentBitPosition);
                    if( 0 <= trialResult ){
                        remainder = trialResult;
                        approximation += refinement;
                    }//while
                    currentBitPosition--;
                }while( currentBitPosition >= 0 );
            }//if
            
        }else{
            //\=> Math.sqrt() is used that might result in rounding errors less or equal than +/-512
            // and further:
            //      9_223_372_024_852_248_004   =  3_037_000_498 * 3_037_000_498
            //      9_223_372_030_926_249_001   =  3_037_000_499 * 3_037_000_499
            //      9_223_372_036_854_775_807   =  Long.MAX_VALUE
            //      square-root(Long.MAX_VALUE) =  3037000499.9760496924513885
            // Hence, 
            //      9_223_372_030_926_249_001 is the last (integer) square and
            //                  3_037_000_499 is the last (integer) square root
            //      inside long range
            // if  approximation is greater than 3_037_000_498  than..
            // ..approximation must be 3_037_000_499  since square is inside "long range"
            //
            //
            // Achtung obiges ist "hier" in unserem Anwendungsfall nicht relevant,
            // da die Mantisse eines double ausreicht um die Wurzel eines long ohne Rundungsfehler aufzunehmen.
            // Im Rahmen dieser Aufgabe ist der Eingabewert/Parameter value auf den Datentyp long limitiert.
            // Es kann "hier" daher keine Rundungsfehler bei der Darstellung des Ergebnisses geben.
            // Jedoch wie funktioniert Math.sqrt() intern - können Rundungsfehler bei der internen Berechnung auftreten???
            //
            final long lastSquare = 9_223_372_030_926_249_001L;
            final long lastSquareRoot = 3_037_000_499L;                                     // lastSquare = lastSquareRoot *lastSquareRoot
            if( lastSquare <= value ){
                approximation = lastSquareRoot;                                             // SC#1 resp. special case #1
            }else{
                //\=>  value < lastSquare 
                approximation = (long)( Math.sqrt( value ));
                if( lastSquareRoot < approximation )  approximation = lastSquareRoot;       // SC#2 resp. special case #2
                final long square = approximation * approximation;
                if( square <= value ){                                                      // as result of SC#1 and SC#2 uncritical
                    //\=> incrementation of integer approximation might be necessary
                    while( (approximation+1) * (approximation+1) <= value ){                // will stop when approximation+1=lastSquareRoot as result of SC#1 and SC#2
                        approximation++;
                    }//while
                }else{
                    //\=> decrement integer approximation
                    do{
                        approximation--;
                    }while( (approximation-1) * (approximation-1) >= value );
                }//if
            }//if
        }//if
        
        return approximation;
    }//method()
    
}//class
