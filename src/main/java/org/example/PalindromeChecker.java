package org.example;

public class PalindromeChecker {
    public static boolean isPalindrome(String word) {
        String cleanWord = word.replaceAll("\\s", "").toLowerCase();

        int length = cleanWord.length();

        for (int i = 0; i < length / 2; i++) {
            if (cleanWord.charAt(i) != cleanWord.charAt(length - i - 1)) {
                System.out.println(word + " не є паліндромом.");
                return false;
            }
        }

        System.out.println(word + " є паліндромом.");
        return true;
    }
}
