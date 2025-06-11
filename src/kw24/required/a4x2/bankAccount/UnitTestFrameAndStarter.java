package kw24.required.a4x2.bankAccount;


import static org.junit.jupiter.api.Assertions.assertEquals;

//
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import kw24.required.a4x2.stuffBeginnersDontHaveToUnderstand.EnvironmentAnalyzer;
import kw24.required.a4x2.stuffBeginnersDontHaveToUnderstand.GivenCodeVersion;
import kw24.required.a4x2.stuffBeginnersDontHaveToUnderstand.Version;


/**
 * (Unit-)TestFrame for bank account stuff
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class UnitTestFrameAndStarter {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_003___2025_06_07__03L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    /**
     * The method {@link #getDecodedVersion()} delivers the code version as reground/readable String.
     * @return version as decoded/readable String.
     */
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung.
    
    
    
    
    
    /**
     * Setup and check environment
     */
    @BeforeAll
    public static void init(){
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
        System.out.printf( "ATTENTION\n" );
        System.out.printf( "This TestFrame is still in an early development phase\n" );
        System.out.printf( "\n\n" );
        //
        System.out.flush();
    }//method()
    
    
    
    
    
    /**
     * Simple tests - create objects and check them
     */
    @Test
    public void test01(){
        final int numOfCurrentAccounts = 10;
        final int numOfSavingAccounts = 5;
        final int numOfAllAccounts = numOfCurrentAccounts + numOfSavingAccounts;
        //
        final int feeInCent = 1_00;
        final int interestRateInPerMille = 499;
        
        BankAccount[] bankAccount = new BankAccount[numOfAllAccounts];
        CurrentAccount[] currentAccount = new CurrentAccount[numOfCurrentAccounts];
        SavingsAccount[] savingsAccount = new SavingsAccount[numOfSavingAccounts];
        
        for( int i=0; i<numOfCurrentAccounts; i++ ){
            currentAccount[i] = new CurrentAccount( Long.toString( 10_000_000 + i ),  1_000_00,  feeInCent );
            bankAccount[i] = currentAccount[i];
        }//for
        for( int i=0; i<numOfSavingAccounts; i++ ){
            savingsAccount[i] = new SavingsAccount( Long.toString( 99_000_000 + i ),  i*1_000_00,  interestRateInPerMille );
            bankAccount[numOfCurrentAccounts+i] = savingsAccount[i];
        }//for
        
        for( int i=0; i<numOfCurrentAccounts; i++ ){
            assertEquals( Long.toString( 10_000_000 + i ), bankAccount[i].getAccountId() );
            assertEquals( 1_000_00, bankAccount[i].getAccountBalance() );
            assertEquals( feeInCent, ((CurrentAccount)bankAccount[i]).getFee() );
        }//for
        for( int i=0; i<numOfSavingAccounts; i++ ){
            assertEquals( Long.toString( 99_000_000 + i ), bankAccount[numOfCurrentAccounts+i].getAccountId() );
            assertEquals( i*1_000_00, bankAccount[numOfCurrentAccounts+i].getAccountBalance() );
            assertEquals( interestRateInPerMille, ((SavingsAccount)bankAccount[numOfCurrentAccounts+i]).getInterestRate() );
        }//for
    }//method()
    
    
    
    /**
     * Simple tests concerning money transfer and transfer manager
     */
    @Test
    public void testMoneyTransfer(){
        final int numOfCurrentAccounts = 10;                                            // quasi inflexible setting for this very test
        assert 0==(numOfCurrentAccounts&0b1) : "invalid setting for this very test";    // test setting has to have even value
        final int feeInCent = 1_00;
        assert 0 <= feeInCent : "invalid setting for this very test";    //
        
        BankAccount[] bankAccount = new BankAccount[numOfCurrentAccounts];
        CurrentAccount[] currentAccount = new CurrentAccount[numOfCurrentAccounts];
        //
        for( int i=0; i<numOfCurrentAccounts; i++ ){
            currentAccount[i] = new CurrentAccount( Long.toString( 10_000_000 + i ),  1_000_00,  feeInCent );
            bankAccount[i] = currentAccount[i];
        }//for
        
        final int endOf1stHalf = numOfCurrentAccounts >>> 1;
        TransferManager transferManager = new TransferManager();
        for( int i=0; i<endOf1stHalf; i++ ){
            transferManager.transfer( currentAccount[i+endOf1stHalf],  currentAccount[i],  currentAccount[i+endOf1stHalf].getAccountBalance() - feeInCent );
        }//for
        // now special sophisticated values are used for this very test
        for( int i=0; i<2; i++ ){
            transferManager.transfer( currentAccount[i+3],  currentAccount[i],  currentAccount[i+3].getAccountBalance() - feeInCent );
        }//for
        transferManager.transfer( currentAccount[1],  currentAccount[0],  currentAccount[1].getAccountBalance() - feeInCent );
        
        assertEquals( 7_993_00, bankAccount[0].getAccountBalance() );
        assertEquals(     0_00, bankAccount[1].getAccountBalance() );
        assertEquals( 1_999_00, bankAccount[2].getAccountBalance() );
        for( int i=3; i<numOfCurrentAccounts; i++ ){
            assertEquals( 0_00, bankAccount[i].getAccountBalance() );
        }//for
    }//method()
    
    
    
    /**
     * Simple tests concerning interest distribution
     */
    @Test
    public void testInterestDistribution01(){
        final int numOfSavingAccounts = 100;
        //
        final int interestRateInPerMille = 47;  // This values
        final long beforeInterest = 1_000_00;   //..have to be
        final long afterInterest  = 1_047_00;   //..in harmony
        
        BankAccount[] bankAccount = new BankAccount[numOfSavingAccounts];
        SavingsAccount[] savingsAccount = new SavingsAccount[numOfSavingAccounts];
        
        for( int i=0; i<numOfSavingAccounts; i++ ){
            savingsAccount[i] = new SavingsAccount( Long.toString( 99_000_000 + i ),  i*beforeInterest,  interestRateInPerMille );
            bankAccount[i] = savingsAccount[i];
        }//for
        
        for( int i=0; i<numOfSavingAccounts; i++ ){
            savingsAccount[i].giveInterest();
        }//for
        
        for( int i=0; i<numOfSavingAccounts; i++ ){
            assertEquals( i*afterInterest, bankAccount[i].getAccountBalance() );
        }//for
    }//method()
    
    
    
    /**
     * Simple tests concerning interest distribution
     */
    @Test
    public void testInterestDistribution02(){
        final int numOfSavingAccounts = 10;     // The very values
        final int interestRateInPerMille = 47;  //..for this very test
        final long beforeInterest = 1_001_00;   //..DO NOT CHANGE !!!
        
        BankAccount[] bankAccount = new BankAccount[numOfSavingAccounts];
        SavingsAccount[] savingsAccount = new SavingsAccount[numOfSavingAccounts];
        
        for( int i=0; i<numOfSavingAccounts; i++ ){
            savingsAccount[i] = new SavingsAccount( Long.toString( 99_000_000 + i ),  i*beforeInterest,  interestRateInPerMille );
            bankAccount[i] = savingsAccount[i];
        }//for
        
        for( int i=0; i<numOfSavingAccounts; i++ ){
            savingsAccount[i].giveInterest();
        }//for
        
        // expected results have been manually calculated for the very test(s)
        assertEquals(        0, bankAccount[0].getAccountBalance() );
        assertEquals( 1_048_04, bankAccount[1].getAccountBalance() );
        assertEquals( 2_096_09, bankAccount[2].getAccountBalance() );
        assertEquals( 3_144_14, bankAccount[3].getAccountBalance() );
        assertEquals( 4_192_18, bankAccount[4].getAccountBalance() );
        assertEquals( 5_240_23, bankAccount[5].getAccountBalance() );
        assertEquals( 6_288_28, bankAccount[6].getAccountBalance() );
        assertEquals( 7_336_32, bankAccount[7].getAccountBalance() );
        assertEquals( 8_384_37, bankAccount[8].getAccountBalance() );
        assertEquals( 9_432_42, bankAccount[9].getAccountBalance() );
    }//method()
    
    
    
    /**
     * Simple tests concerning interest distribution
     */
    @Test
    public void testInterestDistribution03(){
        final int interestRateInPerMille = 47;              // The very values
        final long beforeInterest = 87_841638_446236_31L;   //..for this very test
        final long afterInterest  = 91_970195_453209_41L;   //..DO NOT CHANGE !!!
        
        SavingsAccount savingsAccount = new SavingsAccount( "DE65 3705 0299 0000 9191 91",  beforeInterest,  interestRateInPerMille );
        BankAccount bankAccount = savingsAccount;
        savingsAccount.giveInterest();
        assertEquals( afterInterest, bankAccount.getAccountBalance() );
    }//method()
    
    
    
    
    
    /**
     * tear down
     */
    @AfterAll
    public static void tearDown(){
        System.out.printf( "\n\n\n" );
        System.out.printf( "THE END" );
        System.out.flush();
    }//method()
    
}//class
