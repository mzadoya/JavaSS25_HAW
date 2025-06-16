package kw24.required.a4x3V2.palindromeFinder;

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
        int aktuelleLangeMuster = stringToCheck.length();

        while (aktuelleLangeMuster >=1) {
            for (int i = 0; i <= stringToCheck.length() - aktuelleLangeMuster; i++) {
                int left = i;
                int right = aktuelleLangeMuster - 1 + i;
                boolean isSubstringPalindrome = true;

                while (left < right) {
                    if (Character.toLowerCase(stringToCheck.charAt(left)) != Character.toLowerCase(stringToCheck.charAt(right))) {
                        isSubstringPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }

                if (isSubstringPalindrome) {
                    longestPalindrome = stringToCheck.substring(i, aktuelleLangeMuster + i);
                    return longestPalindrome;
                }
            }
            aktuelleLangeMuster--;
        }

        return longestPalindrome;
    }

}
