// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package kw24.required.a4x2.bankAccount;


import kw24.required.a4x2.stuffBeginnersDontHaveToUnderstand.EnvironmentAnalyzer;
import kw24.required.a4x2.stuffBeginnersDontHaveToUnderstand.GivenCodeVersion;
import kw24.required.a4x2.stuffBeginnersDontHaveToUnderstand.Version;


/**
 * Die Klasse {@link TestFrameAndStarter} testet und startet die Aufgabe "BankAccount" - see task
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          P1@Hamburg-UAS.eu 
 * @version {@value #encodedVersion} 
 */
public class TestFrameAndStarter {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00002_001___2023_04_25__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung
    
    
    
    
    
    /**
     * Diese Methode {@link #main()} testet und startet Ihre Lösung zur Aufgabe: "BankAccount".
     * Hierfür müssen Sie den Test durch Entfernen der Blockkommentarzeichen "aktivieren",
     * sobald Ihre Lösung fertiggestellt ist.
     * Die Tests in dieser Methode dürfen nicht geändert werden.
     * Aber, Sie dürfen gerne eigene Tests am Ende der Methode ergänzen.
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
        System.out.printf( "    Test version:           %s\n",  version.getDecodedVersion() );
        System.out.printf( "\n" );
        //
        System.out.printf( "Environment:\n" );
        System.out.printf( "    #Cores:                 %d\n",  EnvironmentAnalyzer.getAvailableCores() );
        System.out.printf( "    Java:                   %s\n",  EnvironmentAnalyzer.getJavaVersion() );
        System.out.printf( "    assert enabled?:        %s\n",  EnvironmentAnalyzer.isAssertEnabled() );
        System.out.printf( "    UTF-8 configured?:      %s      <- check output\n",  "[ÄËÏÖÜẞäëïöüß🙂😉🙁😟😓😎]" );
        System.out.printf( "\n\n\n\n" );
        //
        System.out.printf( "Start of actual test\n" );
        System.out.printf( "vvvvvvvvvvvvvvvvvvvv\n" );
        System.out.printf( "\n\n" );
        //
        System.out.flush();
        
        
        
        
        
        // Anfang des eigentlichen Tests
        //==============================
        
        // Sobald Sie Ihre Lösung(en) in der/den geforderten Klasse(n) implementiert
        // haben,  müssen die Blockkommentarzeichen entfernt werden.
        //vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
        
                                                                   // <- muss weg
        BankAccount[] bankAccount = new BankAccount[15];
        CurrentAccount[] currentAccount = new CurrentAccount[10];
        SavingsAccount[] savingsAccount = new SavingsAccount[5];
        
        
        
        for( int i=0; i<10; i++ ){
            currentAccount[i] = new CurrentAccount( Long.toString( 10_000_000 + i ),  1_000_00,  1_00 );
            bankAccount[i] = currentAccount[i];
        }//for
        for( int i=0; i<5; i++ ){
            savingsAccount[i] = new SavingsAccount( Long.toString( 99_000_000 + i ),  i*1_000_00,  50 );
            bankAccount[10+i] = savingsAccount[i];
        }//for
        
        for( int i=0; i<15; i++ ){
            System.out.printf( "%s\n",  bankAccount[i] );
        }//for
        System.out.printf( "\n\n" );
        
        
        
        TransferManager transferManager = new TransferManager();
        for( int i=0; i<5; i++ ){
            transferManager.transfer( currentAccount[i+5],  currentAccount[i],  currentAccount[i+5].getAccountBalance() -1_00 );
        }//for
        for( int i=0; i<2; i++ ){
            transferManager.transfer( currentAccount[i+3],  currentAccount[i],  currentAccount[i+3].getAccountBalance() -1_00 );
        }//for
        transferManager.transfer( currentAccount[1],  currentAccount[0],  currentAccount[1].getAccountBalance() -1_00 );
        
        for( int i=0; i<5; i++ ){
            savingsAccount[i].giveInterest();
        }//for
        
        for( int i=0; i<15; i++ ){
            System.out.printf( "%s\n",  bankAccount[i] );
        }//for
        System.out.printf( "\n" );
        
        
        
        
        System.out.printf( "\n\n" );
        System.out.printf( "END OF GIVEN TESTs\n" );
        System.out.printf( "-------------------------------------------------------------------------------\n" );
        System.out.printf( "OPTIONAL TESTs  from Student(s)\n" );
        System.out.printf( "\n\n" );
                                                                      // <- muss weg
        //###
        //###   Oberhalb dieser Position sind KEINE Änderungen am Code erlaubt.
        //###   Bei der Abgabe müssen die oberen Zeilen im Original-Zustand sein.
        //###   Während der Entwicklung wäre ein kurzzeitiges (teilweises) Auskommentieren,
        //###   das vor der Abgabe rückgängig gemacht wird,  erlaubt.
        //###
        //###-------------------------------------------------------------------
        //###
        //###   Ab HIER dürfen Sie gerne eigene Tests ergänzen
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
        
        // === Eigene Tests ===
        System.out.printf("==== Zusätzliche Tests ====\n\n");

        // 1. Test: Übertrag von mehr Geld als verfügbar -> sollte scheitern (evtl. stillschweigend)
        CurrentAccount c1 = new CurrentAccount("30000001", 500_00, 50); // 5.00 Euro
        CurrentAccount c2 = new CurrentAccount("30000002", 100_00, 50); // 1.00 Euro
        TransferManager tm = new TransferManager();
        tm.transfer(c1, c2, 1_000_00); // Versuch, 100.00 zu überweisen
        System.out.printf("1. Zu viel überweisen:\n  %s\n  %s\n\n", c1, c2);

        // 2. Test: Übertrag von genauem Guthaben abzüglich Gebühr -> sollte gehen
        CurrentAccount c3 = new CurrentAccount("30000003", 1_000_00, 50); // 10.00 Euro
        CurrentAccount c4 = new CurrentAccount("30000004", 0, 50);
        tm.transfer(c3, c4, 950); // 9.50 + 0.50 Gebühr = 10.00
        System.out.printf("2. Übertrag exakt möglicher Betrag:\n  %s\n  %s\n\n", c3, c4);

        // 3. Test: Zinsen korrekt berechnen (z. B. 10% auf 1000)
        SavingsAccount s1 = new SavingsAccount("99000000", 1_000_00, 10); // 10%
        s1.giveInterest();
        System.out.printf("3. Zinsen auf 1000.00 (10%%):\n  %s\n\n", s1); // Sollte 1100.00 sein

        // 4. Test: Mehrfaches giveInterest – darf mehrfach angewendet werden?
        SavingsAccount s2 = new SavingsAccount("99000001", 1_000_00, 20); // 20%
        s2.giveInterest();
        s2.giveInterest(); // zweites Mal
        System.out.printf("4. Zwei mal Zinsen auf 1000.00 (20%%):\n  %s\n\n", s2); // 1000 → 1200 → 1440

       

        // 6. Test: Versuch negativer Betrag
        try {
            tm.transfer(c3, c4, -500);
            System.out.printf("6. Negativer Transferbetrag - kein Fehler?\n");
        } catch (Exception e) {
            System.out.printf("6. Negativer Transferbetrag - Exception: %s\n", e.getMessage());
        }

        // 7. Test: Konten mit gleichem IBAN – allowed?
        CurrentAccount cx = new CurrentAccount("DUPLICATE", 1000_00, 10);
        CurrentAccount cy = new CurrentAccount("DUPLICATE", 0, 10);
        tm.transfer(cx, cy, 500_00);
        System.out.printf("7. Zwei Konten mit gleicher IBAN:\n  %s\n  %s\n\n", cx, cy);
        
        // HHH      HHH   III   EEEEEEEEEEEE   RRRRRRRRRRR          <<<                                  !!!
        // HHH      HHH   III   EEEEEEEEEEEE   RRRRRRRRRRRR        <<<                                   !!!
        // HHH      HHH   III   EEE            RRR      RRR       <<<                                    !!!
        // HHH      HHH   III   EEE            RRR      RRR      <<<                                     !!!
        // HHHHHHHHHHHH   III   EEEEEEEEEEEE   RRRRRRRRRRR      <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<     !!!
        // HHHHHHHHHHHH   III   EEEEEEEEEEEE   RRRRRRRRRR       <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<     !!!
        // HHH      HHH   III   EEE            RRR   RRR         <<<                                     !!!
        // HHH      HHH   III   EEE            RRR    RRR         <<<
        // HHH      HHH   III   EEEEEEEEEEEE   RRR     RRR         <<<                                   !!!
        // HHH      HHH   III   EEEEEEEEEEEE   RRR      RRR         <<<                                  !!!
        //
        //
        // Fügen Sie hier Ihre zusätzlichen Tests ein
        // bzw. ersetzen Sie diesen Kommentar durch Ihren Code.
        
        
        
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    }//method()
    
}//class
