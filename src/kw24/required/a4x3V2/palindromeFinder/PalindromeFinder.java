package kw24.required.a4x3V2.palindromeFinder;

public class PalindromeFinder {

    private String stringToCheck;

    public PalindromeFinder() {
        this("");
    }

    public PalindromeFinder(String stringToCheck) {
        // TODO Alle Parameter prüfen => assert
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

    // TODO boolean istPalindrome(String text)
    public String getLongestPalindrome() {
        String longestPalindrome = "";
        int aktuelleLangeMuster = stringToCheck.length();

        while (aktuelleLangeMuster >= 1) {
            for (int i = 0; i <= stringToCheck.length() - aktuelleLangeMuster; i++) {
                String substring = stringToCheck.substring(i, aktuelleLangeMuster + i);

                if (isPalindrome(substring)) {
                    longestPalindrome = substring;
                    return longestPalindrome;
                }
            }
            aktuelleLangeMuster--;
        }

        return longestPalindrome;
    }

    private boolean isPalindrome(String subStringToCheck) {
        int left = 0;
        int right = subStringToCheck.length() - 1;
        while (left < right && Character.toLowerCase(subStringToCheck.charAt(left)) ==
                Character.toLowerCase(subStringToCheck.charAt(right))) {
           
            left++;
            right--;
        }

        return left>=right;
    }
}