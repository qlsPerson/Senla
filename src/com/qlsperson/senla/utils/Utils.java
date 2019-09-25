package com.qlsperson.senla.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Utils {

    private Utils() { }

    public static boolean isEven(long number) {
        return (number%2 == 0);
    }

    public static boolean isComposite(long number) {
        boolean composite = false;
        for (long i = 2; i < number; i++) {
            if(number%i == 0) {
                composite = true;
                break;
            }
        }
        return composite;
    }

    public static String typesOfNumber(long number) {
        if(number <= 0 || number == 1) { // Не может быть ни простым, ни составным
            if(isEven(number)) { return "четное"; } else { return "нечетное"; }
        } else {
            if(Utils.isEven(number)) {
                if(Utils.isComposite(number)) { return "четное и составное"; }
                else { return "четное и простое"; }
            } else {
                if(Utils.isComposite(number)) { return "нечетное и составное"; }
                else { return "нечетное и простое"; }
            }
        }
    }

    public static long gcd(long a, long b) {
        if(b == 0) {
            return Math.abs(a);
        } else {
            return gcd(b, a % b);
        }
    }
    public static long lcm(long a, long b) {
        return Math.abs(a*b) / gcd(a, b);
    }

    public static ArrayList<String> correctArrayListWords(String inputString) {
        ArrayList<String> arrayList = new ArrayList<>();
        String regex = "\\p{Alpha}\\w+";
        Pattern pattern = Pattern.compile(regex, Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(inputString);
        while (matcher.find()) { arrayList.add(matcher.group()); }
        return arrayList;
    }

    public static ArrayList<String> toUpperCaseFirstLetter(ArrayList<String> words) {
        String temp;
        for (int i = 0; i < words.size(); i++) {
            temp = words.get(i).substring(0, 1).toUpperCase() + words.get(i).substring(1);
            words.set(i, temp);
            temp = "";
        }
        return words;
    }

    public static ArrayList<String> sortWords(ArrayList<String> words) {
        Collections.sort(words);
        return words;
    }

    public static <T> StringBuilder arrayListToString(ArrayList<T> values) {
        StringBuilder builder = new StringBuilder();
        for (T value:values) {
            builder.append(value).append(" ");
        }
        return builder;
    }

    public static int countSearchWords(String inputText, String searchWord) {
        int count = 0;
        String text = inputText.toLowerCase();
        String word = searchWord.toLowerCase();
        Pattern pattern = Pattern.compile("\\b" + word + "\\b", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) { count++; }
        return count;
    }

    public static boolean isPalindrome(int number) {
        String temp = String.valueOf(number);
        int lengthNumber = temp.length();
        for (int i = 0; i < (lengthNumber/2); i++) {
            if(temp.charAt(i) != temp.charAt(lengthNumber - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> palindromeNumbers(int number) {
        ArrayList<Integer> outputNumbers = new ArrayList<>();
        for (int i = 0; i <= number; i++) {
            if(isPalindrome(i)) {
                outputNumbers.add(i);
            }
        }
        return outputNumbers;
    }
}
