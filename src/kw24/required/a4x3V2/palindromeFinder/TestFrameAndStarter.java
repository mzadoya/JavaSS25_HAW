// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package kw24.required.a4x3V2.palindromeFinder;


import java.util.Scanner;

import kw24.required.a4x3.stuffBeginnersDontHaveToUnderstand.Beautician;
import kw24.required.a4x3.stuffBeginnersDontHaveToUnderstand.EnvironmentAnalyzer;
import kw24.required.a4x3.stuffBeginnersDontHaveToUnderstand.GivenCodeVersion;
import kw24.required.a4x3.stuffBeginnersDontHaveToUnderstand.Version;


/**
 * Die Klasse {@link TestFrameAndStarter} testet und startet die Lösung(en) zur
 * Aufgabe "PalindromeFinder/LongestPalindrome" - see task
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          P1@Hamburg-UAS.eu 
 * @version {@value #encodedVersion} 
 */
public class TestFrameAndStarter {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00002_002___2024_05_26__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung
    
    
    
    
    
    /**
     * Diese Methode {@link #main()} testet und startet Ihre Lösung zur Aufgabe: "PalindromeFinder/LongestPalindrome".
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
        String givenText = "Werner sagte: \"Es stellen sich neben dem Reliefpfeiler auf: Otto neben Otto und Ede neben Ede.\"";
        PalindromeFinder palindromeFinder = new PalindromeFinder( givenText );
        System.out.printf( "Der folgende Text\n" );
        System.out.printf( "    %s\n",  givenText );
        System.out.printf( "    ____________________~~~~______~~~~~~~___~~~~~~~~~~~~~~~____^^^^^^^^^^^^^^^^^___~~~~~~~~~~~~~~_\n" );
        System.out.printf( "\n" );
        System.out.printf( "liefert:\n" );
        System.out.printf( "    %s\n",  palindromeFinder.getText() );
        System.out.printf( "und\n" );
        System.out.printf( "    " );
        printTestResult( palindromeFinder.getLongestPalindrome() );
        System.out.printf( "\n\n\n" );
        
        
        
        System.out.printf( "Preparing next test.\n" );
        System.out.printf( "The result is expected in about 5 seconds that means in particular less than one minute.\n" );
        StringBuilder sb = new StringBuilder( "apbbpcccp");
        for( int stillToDo=42; --stillToDo>=0; )  sb.append( "x" );
        sb.append( "q" );
        for( int stillToDo=1_000_000; --stillToDo>=0; )  sb.append( "xxxxxxxxxx" );
        sb.append( "p" );
        for( int stillToDo=42; --stillToDo>=0; )  sb.append( "x" );
        sb.append( "qcccqbbqa" );
        givenText = sb.toString();
        System.out.printf( "Starting actual test.\n" );
        palindromeFinder = new PalindromeFinder( givenText );
        final long timeStamp1st = System.nanoTime();
        final String pali = palindromeFinder.getLongestPalindrome();
        final long timeStamp2nd = System.nanoTime();
        assert 10_000_000 == pali.length();
        assert 'x' == pali.charAt( 0 );
        assert 'x' == pali.charAt( 9_999_999 );
        final long delta = timeStamp2nd - timeStamp1st;
        System.out.printf( "Test passed after %s.",  Beautician.nanoSecondBasedTimeToString( delta ));
        System.out.printf( "\n\n\n" );
        
        
        
        System.out.printf( "And now an interactive test.\n\n" );
        try(
            final Scanner workAroundForSeriousUserInterface = new Scanner( System.in );
        ){
            System.out.printf( "Gebe einen Text ein\n" );
            System.out.printf( "und tippe danach die Return-Teste um die Eingabe abzuschliessen.\n" );
            System.out.printf( "=> " );
            //
            final String theText = workAroundForSeriousUserInterface.nextLine();
            palindromeFinder.setText( theText );
            System.out.printf( "Der folgene Text\n" );
            if( null != theText ){
                System.out.printf( "    %s\n",  palindromeFinder.getText() );
            }else{
                System.out.printf( "    null\n" );
            }//if
            System.out.printf( "liefert:\n" );
            printTestResult( palindromeFinder.getLongestPalindrome() );
            
        }catch( final Throwable ex ){
            if( ! (( ex instanceof AssertionError ) || ( ex instanceof IllegalArgumentException ))){
                System.out.flush();
                System.err.printf( "###\n" );
                System.err.printf( "### Uuuupppss, was ist denn da passiert ????\n" );
                System.err.printf( "###\n" );
                System.err.printf( "\n" );
            }//if
            throw( ex );
        }//try
        
        
        
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
        //###   das vor der Abgabe rueckgängig gemacht wird,  erlaubt.
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
        
        performanceTest();
        
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
    
    public static String generateHugeTestString() {
        StringBuilder sb = new StringBuilder();
        
        // Начинаем с небольшого текста
        sb.append("start");
        
        // 1. Огромный палиндром из одинаковых символов (как в реальном тесте)
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("x");
        }
        
        // Разделитель
        sb.append("middle");
        
        // 2. Большой палиндром смешанного типа (500k символов)
        for (int i = 0; i < 250_000; i++) {
            sb.append("a");
        }
        sb.append("Z");  // Центр с другим регистром
        for (int i = 0; i < 250_000; i++) {
            sb.append("a");
        }
        
        // Разделитель  
        sb.append("separator");
        
        // 3. Средний палиндром (100k символов)
        for (int i = 0; i < 50_000; i++) {
            sb.append("b");
        }
        for (int i = 0; i < 50_000; i++) {
            sb.append("b");
        }
        
        // Случайный текст в конце
        sb.append("random text at the end with some palindromes like racecar and level");
        
        return sb.toString();
    }

    // Метод для тестирования производительности
   
    private static void performanceTest() {
        System.out.printf("=== ГИПЕР-СЛОЖНЫЕ ТЕСТЫ ===\n\n");
        
        // ТЕСТ 1: Множественные вложенные палиндромы
        System.out.printf("Тест 1: Множественные вложенные палиндромы\n");
        String complexPalindromes = "abcdefghijklmnopqrstuvwxyzabacabABCcbacbacbAzyxwvutsrqponmlkjihgfedcbaabcdefg";
        testPalindrome(complexPalindromes, "Вложенные палиндромы");
        
        // ТЕСТ 2: Огромный палиндром с разными символами (1 миллион символов)
        System.out.printf("Тест 2: Огромный палиндром (1M символов)\n");
        StringBuilder hugePalindrome = new StringBuilder();
        String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
        for (int i = 0; i < 10000; i++) {
            hugePalindrome.append(base);
        }
        hugePalindrome.append("ЦЕНТР");
        for (int i = 9999; i >= 0; i--) {
            hugePalindrome.reverse().append(base).reverse();
        }
        testPalindrome(hugePalindrome.toString(), "Гигантский палиндром");
        
        // ТЕСТ 3: Множественные одинаковые символы с "ловушками"
        System.out.printf("Тест 3: Ловушки с одинаковыми символами\n");
        StringBuilder trickTest = new StringBuilder();
        // Создаем много блоков "aaaa" но с более длинным палиндромом в конце
        for (int i = 0; i < 50000; i++) {
            trickTest.append("aaaa");
        }
        trickTest.append("bcdefghijklmnopqrstuvwxyzzyxwvutsrqponmlkjihgfedcb");
        testPalindrome(trickTest.toString(), "Ловушка с одинаковыми символами");
        
        // ТЕСТ 4: Регистро-зависимые палиндромы
        System.out.printf("Тест 4: Сложные регистро-зависимые палиндромы\n");
        String caseTest = "AbCdEfGhIjKlMnOpQrStUvWxYzZyXwVuTsRqPoNmLkJiHgFeDcBaAbCdEfGhI";
        testPalindrome(caseTest, "Регистро-зависимый");
        
        // ТЕСТ 5: Unicode и специальные символы
        System.out.printf("Тест 5: Unicode и специальные символы\n");
        String unicodeTest = "🌟💫⭐✨🎭🎪🎨🎯🎲🎰🎯🎨🎪🎭✨⭐💫🌟абвгдеёжзийклмнопрстуфхцчшщъыьэюяяюэьыъщшчцхфутсрпонмлкйизжёедгвба";
        testPalindrome(unicodeTest, "Unicode тест");
        
        // ТЕСТ 6: Экстремальная длина с одним символом (10 миллионов)
        System.out.printf("Тест 6: Экстремальная длина (10M одинаковых символов)\n");
        StringBuilder extremeTest = new StringBuilder();
        for (int i = 0; i < 10_000_000; i++) {
            extremeTest.append("z");
        }
        testPalindrome(extremeTest.toString(), "10M одинаковых символов");
        
        // ТЕСТ 7: Чередующиеся палиндромы разной длины
        System.out.printf("Тест 7: Чередующиеся палиндромы\n");
        String alternatingTest = "aba" + "cddc" + "efgfe" + "hijklkjih" + "mnopqponm" + "rstuvwxwvutsr";
        testPalindrome(alternatingTest, "Чередующиеся палиндромы");
        
        // ТЕСТ 8: Почти-палиндром (отличается одним символом в середине)
        System.out.printf("Тест 8: Почти-палиндром\n");
        String almostPalindrome = "abcdefghijklmnopqXstuvwxyzzyxwvutsrqponmlkjihgfedcba";
        testPalindrome(almostPalindrome, "Почти-палиндром");
        
        // ТЕСТ 9: Пустые строки и null
        System.out.printf("Тест 9: Граничные случаи\n");
        testPalindrome("", "Пустая строка");
        testPalindrome("a", "Один символ");
        testPalindrome("ab", "Два разных символа");
        testPalindrome("aa", "Два одинаковых символа");
        
        // ТЕСТ 10: Смешанные языки и символы
        System.out.printf("Тест 10: Многоязычный тест\n");
        String multilangTest = "EnglishсилиГнЭhsilgnE中文字符符字文中ΕλληνικάάκινηλλΕ";
        testPalindrome(multilangTest, "Многоязычный");
        
        // ТЕСТ 11: Производительность на чередующихся символах
        System.out.printf("Тест 11: Производительность на чередующихся символах\n");
        StringBuilder alternatingPerf = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            alternatingPerf.append(i % 2 == 0 ? "a" : "b");
        }
        testPalindrome(alternatingPerf.toString(), "Чередующиеся символы (1M)");
        
        // ТЕСТ 12: СУПЕР-СЛОЖНЫЙ: Матрёшка палиндромов
        System.out.printf("Тест 12: СУПЕР-СЛОЖНЫЙ - Матрёшка палиндромов\n");
        String matryoshka = buildMatryoshkaPalindrome(5, 1000);
        testPalindrome(matryoshka, "Матрёшка палиндромов");
        
        System.out.printf("\n=== ВСЕ ГИПЕР-СЛОЖНЫЕ ТЕСТЫ ЗАВЕРШЕНЫ ===\n");
    }

    private static void testPalindrome(String input, String testName) {
        System.out.printf("Тестирую: %s (длина: %d)\n", testName, input.length());
        
        PalindromeFinder finder = new PalindromeFinder(input);
        long startTime = System.nanoTime();
        String result = finder.getLongestPalindrome();
        long endTime = System.nanoTime();
        
        long duration = endTime - startTime;
        System.out.printf("Результат: '%s' (длина: %d)\n", 
            result.length() > 50 ? result.substring(0, 47) + "..." : result, 
            result.length());
        System.out.printf("Время: %s\n", nanoToString(duration));
        System.out.printf("Производительность: %.2f символов/мс\n\n", 
            input.length() / (duration / 1_000_000.0));
    }

    private static String buildMatryoshkaPalindrome(int levels, int baseLength) {
        if (levels == 0) return "ЦЕНТР";
        
        StringBuilder sb = new StringBuilder();
        String pattern = "abcdefghijklmnopqrstuvwxyz".substring(0, baseLength % 26);
        
        // Добавляем текущий уровень
        sb.append(pattern);
        
        // Рекурсивно добавляем внутренние уровни
        sb.append(buildMatryoshkaPalindrome(levels - 1, baseLength / 2));
        
        // Добавляем зеркальное отражение текущего уровня
        sb.append(new StringBuilder(pattern).reverse());
        
        return sb.toString();
    }

    private static String nanoToString(long nanos) {
        if (nanos < 1_000) return nanos + " ns";
        if (nanos < 1_000_000) return String.format("%.2f μs", nanos / 1_000.0);
        if (nanos < 1_000_000_000) return String.format("%.2f ms", nanos / 1_000_000.0);
        return String.format("%.2f s", nanos / 1_000_000_000.0);
    }

    
    
    private static void printTestResult( final String testResult ){
        if( null != testResult ){
            System.out.printf( "\"%s\" -> length=%d\n",  testResult, testResult.length() );
        }else{
            System.out.printf( "null\n" );
        }//if
    }//method()
    
}//class
