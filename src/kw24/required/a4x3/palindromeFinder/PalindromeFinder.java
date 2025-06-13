package kw24.required.a4x3.palindromeFinder;

import java.util.Objects;

public class PalindromeFinder {

    String stringToCheck;

    public PalindromeFinder() {
        this("");
    }

    public PalindromeFinder(String stringToCheck) {
        this.stringToCheck = stringToCheck;
    }

    public void setText(String stringToSet) {
        if (stringToSet != null) {
            this.stringToCheck = stringToSet;
        }
    }

    public String getText() {

        return this.stringToCheck;
    }

    public String getLongestPalindrome() {
        String longestPalindrome = "";
        int pos1 = 0;
        int pos2 = pos1 + 1;

        if (stringToCheck == null || stringToCheck.length() == 0)
            return "";

        while (pos2 < stringToCheck.length()) {
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

        if (longestPalindrome.length() > stringToCheck.length() / 2) {
            return longestPalindrome;
        }

        for (int i = 0; i < stringToCheck.length(); i++) {
            int left = i;
            int right = i;
            longestPalindrome = findPalindrome(longestPalindrome, left, right);
            longestPalindrome = findPalindrome(longestPalindrome, left, right + 1);
        }
        return longestPalindrome;
    }

    private String findPalindrome(String longestPalindrome, int left, int right) {

        while (left >= 0 && right < stringToCheck.length() && Character.toLowerCase(stringToCheck.charAt(left)) == Character.toLowerCase(stringToCheck.charAt(right))) {
            if (right - left + 1 > longestPalindrome.length()) {
                longestPalindrome = stringToCheck.substring(left, right + 1);
            }
            left--;
            right++;
        }

        return longestPalindrome;
    }

    @Override
    public String toString() {
        return "PalindromeFinder [stringToCheck=" + stringToCheck + "]";
    }

   
}
