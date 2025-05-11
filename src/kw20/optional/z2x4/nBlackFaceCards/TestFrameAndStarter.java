// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package kw20.optional.z2x4.nBlackFaceCards;


import java.util.Scanner;

import kw20.optional.z2x3.stuffBeginnersDontHaveToUnderstand.Version;

/* 
 * "Dies" (diese "Klasse") wird "zum Anstarten" benötigt. Zwar ist es nicht verboten,
 * sich auch "hier" umzuschauen, aber vermutlich ist Ihre Zeit deutlich besser inverstiert,
 * wenn Sie sich auf die Klasse/den Bereich konzentrieren, der entgsprechend markiert ist.
 */
/**
 * {@link TestFrameAndStarter} for {@link NBlackFaceCards}.
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class TestFrameAndStarter {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_001___2025_05_03__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    /**
     * The method {@link #getDecodedVersion()} delivers the code version as reground/readable String.
     * @return version as decoded/readable String.
     */
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung.
    
    
    
    
    
    /**
     * Method to start test.
     * 
     * @param unused  is unused ;-)
     */
    public static void main( final String... unused ) {
        try(
            final Scanner workAroundForSeriousUserInterface = new Scanner( System.in );
        ){
            System.out.printf( "Gebe ein, wieviele schwarze Bild-Karten vom Stapel gezogen werden sollen\n" );
            System.out.printf( "und tippe danach Return um die Eingabe abzuschliessen.\n" );
            System.out.printf( "=> " );
            final int requestedAmount = workAroundForSeriousUserInterface.nextInt();
            if( (requestedAmount<0) || (6<requestedAmount) ){
                System.out.printf( "\n\n" );
                System.out.printf( "Hmhm, war die Eingabe %d wirklich sinnvoll ?\n",  requestedAmount );
                System.out.printf( "Aber schaun wir doch einfach mal was passiert\n");
                System.out.printf( "\n\n" );
            }//if
            //
            final NBlackFaceCards nBlackFaceCards = new NBlackFaceCards();
            nBlackFaceCards.drawAndPrintCardsAsRequested( requestedAmount );
        }//try
    }//method()
    
}//class
