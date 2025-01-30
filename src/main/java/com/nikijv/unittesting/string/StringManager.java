package com.nikijv.unittesting.string;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManager {
    public boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0, right = str.length() - 1;

        while(left <= right) {
            if(str.charAt(left) == ' ')
                left++;

            if(str.charAt(right) == ' ')
                right--;

            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    public int getVowelsCount(String str) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y');
        int count = 0;

        for(char c : str.toCharArray()) {
            if(vowels.contains(c))
                count++;
        }
        return count;
    }

    public int getConsonantsCount(String str) {
        Set<Character> consonants = Set.of('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z',
                'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z');
        int count = 0;

        for(char c : str.toCharArray()) {
            if(consonants.contains(c))
                count++;
        }
        return count;
    }

    public int getMatchesCount(String str, String word) {
        int count = 0;
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(str);

        while(matcher.find())
            count++;

        return count;
    }
}

