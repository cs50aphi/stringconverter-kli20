// by Kate Li
import java.lang.*;
import java.io.*;
import java.util.*;

public class StringConverter
{
    public static String reverse(String input) {
        // getBytes() method to convert string into bytes[]
        byte [] strAsByteArray = input.getBytes();
        byte [] result = new byte [strAsByteArray.length];

        // store result in reverse order into the result byte[]
        for (int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }

        return new String(result);
    }

    public static boolean checkPalindrome(String str) {
        // replace all special characters
        str = str.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        // reverse the entire string
        byte [] strAsByteArray = str.getBytes();
        byte [] result = new byte [strAsByteArray.length];
        // store result in reverse order into the result byte[]
        for (int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }
        // check if original string is same as reversed string
        if (str.equals(new String(result))) {
            return true;
        }
        else {
            return false;
        }
    }
    public static String pigLatinate(String englishWord) {
        int vowel = -1;
        for (int i = 0; i < englishWord.length(); i++) {
            // if englishWord has a vowel, return the index
            if (englishWord.charAt(i) == 'a' || englishWord.charAt(i) == 'e' || englishWord.charAt(i) == 'i' || englishWord.charAt(i) == 'o' || englishWord.charAt(i) == 'u' || englishWord.charAt(i) == 'A' || englishWord.charAt(i) == 'E' || englishWord.charAt(i) == 'I' || englishWord.charAt(i) == 'O' || englishWord.charAt(i) == 'U') {
                break;
            }
            vowel = i;
        }
        // if englishWord has no vowels, return englishWord + "ay"
        if (vowel < 0) {
            return englishWord + "ay";
        }
        // else if englishWord begins with a vowel, return englishWord + "yay"
        else if (vowel == 0) {
            return englishWord + "yay";
        }
        // else if englishWord has a vowel in it and yet doesn't start with a vowel, return end + start + "ay"
        else {
            // Let start be all of englishWord up to (but not including) its first vowel.
            String start = englishWord.substring(0, vowel);
            // Let end be all of englishWord from its first vowel on
            String end = englishWord.substring(vowel);
            // Convert string to array of characters to check capitalization
            char[] charArray = englishWord.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                // if any character is upper case, capitalize END and uncapitalize start
                if (Character.isUpperCase(charArray[i]))
                    return end.toUpperCase() + start.toLowerCase() + "ay";
            }
            return end + start + "ay";
        }
    }
    // public static int checkVowel(String englishWord) {
    //     for (int i = 0; i < englishWord.length(); i++) {
    //         // if englishWord has a vowel, return the index
    //         if ((englishWord.charAt(i) == 'a') || (englishWord.charAt(i)) == 'e') || (englishWord.charAt(i)) == 'i') || (englishWord.charAt(i)) == 'o') || (englishWord.charAt(i)) == 'u') || (englishWord.charAt(i)) == 'A') || (englishWord.charAt(i)) == 'E') || (englishWord.charAt(i)) == 'I') || (englishWord.charAt(i)) == 'O') || (englishWord.charAt(i)) == 'U')) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
}