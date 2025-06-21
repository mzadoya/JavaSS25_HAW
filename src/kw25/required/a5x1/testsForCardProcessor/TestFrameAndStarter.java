// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package kw25.required.a5x1.testsForCardProcessor;


import static kw25.required.a5x1.cards.Card.*;
import static kw25.required.a5x1.cards.Card.Constant.*;
//
import kw25.required.a5x1.cardProcessor.CardProcessor;
import kw25.required.a5x1.cards.*;
import kw25.required.a5x1.cards.Card.*;
import kw25.required.a5x1.stuffBeginnersDontHaveToUnderstand.EnvironmentAnalyzer;
import kw25.required.a5x1.stuffBeginnersDontHaveToUnderstand.GivenCodeVersion;
import kw25.required.a5x1.stuffBeginnersDontHaveToUnderstand.Version;


/**
 * Die Klasse {@link TestFrameAndStarter} testet die Lösung zur Aufgabe "cards in reverse order" - siehe Aufgabenstellung.
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          P1@Hamburg-UAS.eu 
 * @version {@value #encodedVersion} 
 */
public class TestFrameAndStarter {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00002_002___2023_05_19__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung
    
    
    
    
    
    /**
     * Die Methode {@link #main() testet die Lösung zu "cards in reverse order".
     * Diese Methode darf bis zur "Markierung" NICHT geändert werden
     * außer, dass Sie "den Kommentar vor den letzten Statements" entfernen müssen.
     * Wohl aber dürfen Sie am Ende/nach der Markierung eigene Tests ergänzen.
     * 
     * @param unused wird nicht genutzt, aber "von Java eingefordert".
     */
    public static void main( final String... unused ){
        
        // print some information at start
        System.out.printf( "TestFrame information\n" );
        System.out.printf( "=====================\n" );
        System.out.printf( "\n" );
        //
        System.out.printf( "Release:\n" );
        System.out.printf( "    GivenCode version:      %s\n",  GivenCodeVersion.getDecodedVersion() );
        System.out.printf( "    Card version:           %s\n",  Card.getDecodedVersion() );
        System.out.printf( "    Deck version:           %s\n",  Deck.getDecodedVersion() );
        System.out.printf( "\n" );
        //
        System.out.printf( "Environment:\n" );
        System.out.printf( "    #Cores:                 %d\n",  EnvironmentAnalyzer.getAvailableCores() );
        System.out.printf( "    Java:                   %s\n",  EnvironmentAnalyzer.getJavaVersion() );
        System.out.printf( "    assert enabled?:        %s\n",  EnvironmentAnalyzer.isAssertEnabled() );
        System.out.printf( "    UTF-8 configured?:      %s      <- check output\n",  "[ÄËÏÖÜẞäëïöüß␣🙂😉🙁😟😓😎☠]" );
        System.out.printf( "\n\n\n\n" );
        //
        System.out.printf( "Start of actual demo\n" );
        System.out.printf( "vvvvvvvvvvvvvvvvvvvv\n" );
        System.out.printf( "\n\n" );
        //
        System.out.flush();
        
        
        
        
        
        // Anfang des eigentlichen Tests
        //==============================
        
        final Deck deck = new Deck();
        final CardProcessor cardProcessor = new CardProcessor();
        cardProcessor.reverseOrder( deck, CJ, true );
        
        
        //----------------------------------------------------------------------// "MARKIERUNG" ;-)
        // Ab hier dürfen Sie eigene Tests ergänzen
      //test Karte während Ziehung nicht ausgeben
        
        final Deck deck1 = new Deck();
        final CardProcessor cardProcessor1 = new CardProcessor();
        cardProcessor1.reverseOrder( deck1, H6, false );
         
        
        //test deck leer
        cardProcessor.reverseOrder( deck, SQ, true );
    }//method()
    
}//class
