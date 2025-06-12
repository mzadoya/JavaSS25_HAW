// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package kw24.required.a4x3.palindromeFinder;

import java.util.Random;

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
    public static void performanceTest() {
        System.out.println("Генерируем огромную тестовую строку...");
        String hugeString = generateHugeTestString();
        
        System.out.println("Длина строки: " + hugeString.length() + " символов");
        System.out.println("Первые 50 символов: " + hugeString.substring(0, 50));
        System.out.println("Символы в позиции 1000000-1000050: " + 
                          hugeString.substring(1000000, 1000050));
        
        PalindromeFinder pf = new PalindromeFinder(hugeString);
        
        System.out.println("\nЗапускаем поиск палиндрома...");
        long startTime = System.currentTimeMillis();
        
        String result = pf.getLongestPalindrome();
        
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        
        System.out.println("Результат найден!");
        System.out.println("Время выполнения: " + duration + " мс (" + (duration/1000.0) + " сек)");
        System.out.println("Длина найденного палиндрома: " + result.length());
        System.out.println("Первые 20 символов результата: " + 
                          result.substring(0, Math.min(20, result.length())));
        
        // Проверяем, что результат действительно палиндром
        boolean isPalindrome = result.equals(new StringBuilder(result.toLowerCase()).reverse().toString());
        System.out.println("Результат является палиндромом: " + isPalindrome);
    }
    //++++ EXTERN START++++ 
    public static String generateExtremeTestString() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        
        System.out.println("Генерация экстремального теста...");
        
        // 1. ОГРОМНЫЙ блок одинаковых символов (5 миллионов)
        System.out.println("Добавляем 5 млн символов 'x'...");
        for (int i = 0; i < 5_000_000; i++) {
            sb.append('x');
        }
        
        // 2. СПРЯТАННЫЕ палиндромы внутри блока 'x'
        System.out.println("Встраиваем скрытые палиндромы...");
        
        // Большой палиндром в позиции 1 млн
        insertPalindromeAt(sb, 1_000_000, "a", 50_000, "MEGA");  // 100k + центр
        
        // Средний палиндром в позиции 2 млн  
        insertPalindromeAt(sb, 2_000_000, "b", 25_000, "SUPER"); // 50k + центр
        
        // Маленький палиндром в позиции 3 млн
        insertPalindromeAt(sb, 3_000_000, "c", 10_000, "HIDDEN"); // 20k + центр
        
        // 3. МНОЖЕСТВО мелких палиндромов в случайных местах
        System.out.println("Добавляем 1000 случайных палиндромов...");
        String[] smallPalindromes = {
            "racecar", "level", "deed", "noon", "civic", "radar", "refer", 
            "madam", "kayak", "rotator", "deified", "reviver", "repaper"
        };
        
        for (int i = 0; i < 1000; i++) {
            int pos = random.nextInt(sb.length() - 100);
            String pal = smallPalindromes[random.nextInt(smallPalindromes.length)];
            sb.replace(pos, pos + pal.length(), pal);
        }
        
        // 4. ДЛИННЫЕ последовательности разных символов
        System.out.println("Добавляем длинные блоки других символов...");
        
        // 1 миллион 'y'
        for (int i = 0; i < 1_000_000; i++) {
            sb.append('y');
        }
        
        // Палиндром из 'y' с центром
        int yStart = sb.length() - 500_000;
        sb.replace(yStart, yStart + 1, "Z"); // Центр другого регистра
        
        // 500k 'z'
        for (int i = 0; i < 500_000; i++) {
            sb.append('z');
        }
        
        // 5. СМЕШАННЫЕ блоки с палиндромами
        System.out.println("Добавляем смешанные блоки...");
        addMixedPalindromeBlock(sb, 100_000);
        addMixedPalindromeBlock(sb, 75_000);
        addMixedPalindromeBlock(sb, 50_000);
        
        // 6. ФИНАЛЬНЫЙ огромный блок с вложенными структурами
        System.out.println("Добавляем финальный сложный блок...");
        addComplexNestedStructure(sb, 2_000_000);
        
        System.out.println("Экстремальный тест готов!");
        return sb.toString();
    }

    private static void insertPalindromeAt(StringBuilder sb, int position, String baseChar, int halfSize, String center) {
        // Создаем палиндром: halfSize * baseChar + center + halfSize * baseChar
        StringBuilder palindrome = new StringBuilder();
        for (int i = 0; i < halfSize; i++) {
            palindrome.append(baseChar);
        }
        palindrome.append(center);
        for (int i = 0; i < halfSize; i++) {
            palindrome.append(baseChar);
        }
        
        // Заменяем часть строки на палиндром
        int endPos = Math.min(position + palindrome.length(), sb.length());
        sb.replace(position, endPos, palindrome.toString());
    }

    private static void addMixedPalindromeBlock(StringBuilder sb, int size) {
        // Создаем блок со множеством мелких палиндромов
        StringBuilder block = new StringBuilder();
        Random random = new Random();
        String[] chars = {"a", "b", "c", "d", "e"};
        
        for (int i = 0; i < size; i += 10) {
            if (random.nextBoolean()) {
                // Добавляем мини-палиндром
                String ch = chars[random.nextInt(chars.length)];
                block.append(ch).append(ch).append(ch); // "aaa"
                i += 2;
            } else {
                // Добавляем случайный символ
                block.append(chars[random.nextInt(chars.length)]);
            }
        }
        
        sb.append(block);
    }

    private static void addComplexNestedStructure(StringBuilder sb, int totalSize) {
        // Создаем структуру: [случайные] + [огромный палиндром] + [случайные]
        Random random = new Random();
        
        // 25% случайных символов
        int randomPart = totalSize / 4;
        for (int i = 0; i < randomPart; i++) {
            sb.append((char)('a' + random.nextInt(26)));
        }
        
        // 50% - огромный палиндром из смешанных символов
        int palindromeSize = totalSize / 2;
        StringBuilder palindrome = new StringBuilder();
        for (int i = 0; i < palindromeSize / 2; i++) {
            char ch = (char)('a' + (i % 5)); // Циклично a,b,c,d,e
            palindrome.append(ch);
        }
        String center = "ULTIMATE_CENTER";
        palindrome.append(center);
        // Добавляем реверс
        for (int i = palindromeSize / 2 - 1; i >= 0; i--) {
            char ch = (char)('a' + (i % 5));
            palindrome.append(ch);
        }
        sb.append(palindrome);
        
        // Оставшиеся 25% - случайные символы
        for (int i = 0; i < totalSize - randomPart - palindrome.length(); i++) {
            sb.append((char)('a' + random.nextInt(26)));
        }
    }

    // Метод для экстремального теста производительности
    public static void extremePerformanceTest() {
        System.out.println("=== ЭКСТРЕМАЛЬНЫЙ ТЕСТ ПРОИЗВОДИТЕЛЬНОСТИ ===");
        
        String extremeString = generateExtremeTestString();
        
        System.out.println("Общая длина строки: " + extremeString.length() + " символов");
        System.out.println("Это примерно " + (extremeString.length() / 1_000_000.0) + " миллионов символов");
        
        PalindromeFinder pf = new PalindromeFinder(extremeString);
        
        System.out.println("\n🚀 ЗАПУСК ЭКСТРЕМАЛЬНОГО ТЕСТА...");
        System.out.println("Ожидаемый самый длинный палиндром: 5 миллионов символов 'x'");
        
        long startTime = System.currentTimeMillis();
        String result = pf.getLongestPalindrome();
        long endTime = System.currentTimeMillis();
        
        long duration = endTime - startTime;
        
        System.out.println("\n🎯 РЕЗУЛЬТАТЫ:");
        System.out.println("⏱️ Время выполнения: " + duration + " мс (" + (duration/1000.0) + " сек)");
        System.out.println("📏 Длина найденного палиндрома: " + result.length());
        System.out.println("🔤 Первые 30 символов: " + result.substring(0, Math.min(30, result.length())));
        System.out.println("📊 Производительность: " + (extremeString.length() / Math.max(duration, 1)) + " символов/мс");
        
        // Проверка корректности (только для небольших результатов)
        if (result.length() < 1000) {
            boolean isPalindromeResult = pf.isPalindrome(result);
            System.out.println("✅ Корректность: " + isPalindromeResult);
        } else {
            System.out.println("✅ Результат слишком большой для полной проверки");
        }
    }


    //++++ EXTERN END ++++ 
    private static void printTestResult( final String testResult ){
        if( null != testResult ){
            System.out.printf( "\"%s\" -> length=%d\n",  testResult, testResult.length() );
        }else{
            System.out.printf( "null\n" );
        }//if
    }//method()
    
}//class
