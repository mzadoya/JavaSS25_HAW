// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package kw20.optional.z2x3.fiveRedFaceCards;


import kw20.optional.z2x3.stuffBeginnersDontHaveToUnderstand.Version;


/* 
 * "Dies" (diese "Klasse") wird "zum Anstarten" benötigt. Zwar ist es nicht verboten,
 * sich auch "hier" umzuschauen, aber vermutlich ist Ihre Zeit deutlich besser inverstiert,
 * wenn Sie sich auf die Klasse/den Bereich konzentrieren, der entgsprechend markiert ist.
 */
/**
 * {@link TestFrameAndStarter} for {@link FiveRedFaceCards}.
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
        final FiveRedFaceCards fiveRedFaceCards = new FiveRedFaceCards();
        fiveRedFaceCards.drawAndPrintCardsAsRequested();
    }//method()
    
}//class
