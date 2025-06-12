package kw24.required.a4x3.palindromeFinder;

import java.util.Objects;

public class PalindromeFinder {

    String stringToCheck;

    public PalindromeFinder() {
        this("leer");
    }

    public PalindromeFinder(String stringToCheck) {
        this.stringToCheck = stringToCheck;
    }

    public void setText(String stringToCheck) {
        this.stringToCheck = stringToCheck;
    }

    public String getText() {
       
        return this.stringToCheck;
    }

    public String getLongestPalindrome() {
        String longestPalindrome = "";
        int pos1 = 0;
        int pos2 = pos1+1;
        
        if (stringToCheck == null || stringToCheck.length() == 0)
            return "leer";
        
        while (pos1 < stringToCheck.length()) {
            if (pos2 >= stringToCheck.length()) {
                if (pos2 - pos1 > longestPalindrome.length()) {
                    longestPalindrome = stringToCheck.substring(pos1, pos2);
                }
                break;
            }
            
            if (Character.toLowerCase(stringToCheck.charAt(pos1)) == Character.toLowerCase(stringToCheck.charAt(pos2))) {
                pos2++;
            } else {
                if (pos2 - pos1 > longestPalindrome.length()) {
                    longestPalindrome = stringToCheck.substring(pos1, pos2);
                }
                pos1 = pos2;
                pos2 = pos1 + 1;
            }
        }
        
        if (longestPalindrome.length()>stringToCheck.length()/2) {
            return longestPalindrome;
        }
        for (int i = 0; i < stringToCheck.length(); i++) {
            int left = i;
            int right = i;
            while (left >= 0 && right < stringToCheck.length() && 
                    Character.toLowerCase(stringToCheck.charAt(left)) == Character.toLowerCase(stringToCheck.charAt(right))) {
                if (right - left + 1 > longestPalindrome.length()) {
                    longestPalindrome = stringToCheck.substring(left, right + 1);
                }
                left--;
                right++;
            }

            left = i;
            right = i + 1;
            while (left >= 0 && right < stringToCheck.length() && 
                    Character.toLowerCase(stringToCheck.charAt(left)) == Character.toLowerCase(stringToCheck.charAt(right))) {
                if (right - left + 1 > longestPalindrome.length()) {
                    longestPalindrome = stringToCheck.substring(left, right + 1);
                }
                left--;
                right++;
            }
        }

        return longestPalindrome;
    }
    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
        
   
    @Override
    public String toString() {
        return "PalindromeFinder [stringToCheck=" + stringToCheck + "]";
    }
   

    // private boolean
}
