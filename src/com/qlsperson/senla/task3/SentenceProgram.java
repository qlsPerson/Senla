package com.qlsperson.senla.task3;

import com.qlsperson.senla.utils.Utils;
import java.util.ArrayList;
import java.util.Scanner;

public class SentenceProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение:");
        String inputString  = scanner.nextLine();
        ArrayList<String> words = Utils.correctArrayListWords(inputString);
        System.out.println("Количество слов в предложении: " + words.size());
        if(words.size() > 0) {
            ArrayList<String> sortUpperCaseWords = Utils.sortWords(Utils.toUpperCaseFirstLetter(words));
            System.out.println("Первая буква каждого слова заглавная, слова отсортированы в алфавитном порядке:");
            System.out.println(Utils.arrayListToString(sortUpperCaseWords));
        }
        scanner.close();
    }
}
