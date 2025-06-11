package kw24.required.a4x3.palindromeFinder;

import java.util.Objects;

public class PalindromeFinder {
    
   String stringToCheck;
  

    public PalindromeFinder() {
        this ("leer");
    }
    
    public PalindromeFinder(String stringToCheck) {
        this.stringToCheck = stringToCheck;
    }
    
    public void setText(String stringToCheck) {
        this.stringToCheck = stringToCheck;
    }
    
    public String getText() {
        if (this.stringToCheck != null) {
            return this.stringToCheck;
        }
        else return "you have nothing to return";
    }
    
    
    public String getLongestPalindrome() {
       String longestPalindrome = "";
        
        if (stringToCheck == null || stringToCheck.length() == 0) return "leer";
        
        for (int i = 0; i < stringToCheck.length(); i++) {
            int left = i; int right = i; 
            while (left >= 0 && right < stringToCheck.length() && stringToCheck.charAt(left)==stringToCheck.charAt(right)) {
                if (right - left + 1 > longestPalindrome.length()) {
                    longestPalindrome = stringToCheck.substring(left, right + 1);
                }
                left--;
                right++;
            }
            
            left = i; right = i+1;
            while (left >= 0 && right < stringToCheck.length() && stringToCheck.charAt(left)==stringToCheck.charAt(right)) {
                if (right - left + 1 > longestPalindrome.length()) {
                    longestPalindrome = stringToCheck.substring(left, right + 1);
                }
                left--;
                right++;
            }
        }
        
        return longestPalindrome;
    }

    @Override
    public String toString() {
        return "PalindromeFinder [stringToCheck=" + stringToCheck + "]";
    }
    
  // private boolean
}
