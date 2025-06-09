package kw21.required.a3x1.simpleCharacterArrayBasedPalindromeTester;


/**
 * PalindromeTester - see task
 * 
 * @author   Maksym Zadoya
 * @version  26.05.2025, v1.0
 *
 */
public class PalindromeTester {
    
    
    public boolean isPalindrome(char[] arrayOfChars) {
       
        int i = 0;
        while (i < arrayOfChars.length/2) {
            if (arrayOfChars[i]==arrayOfChars[arrayOfChars.length-1-i]) {
            }
            else return false;
            i++;
        }
        
       return true;
    }
    
}//class
