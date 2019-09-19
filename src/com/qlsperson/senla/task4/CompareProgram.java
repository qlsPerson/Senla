package com.qlsperson.senla.task4;

import com.qlsperson.senla.utils.Utils;
import java.util.Scanner;

public class CompareProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите текст: ");
        String inputText = scanner.nextLine();
        System.out.println("Пожалуйста введите слово для поиска: ");
        String searchWord = scanner.nextLine();
        System.out.print("Количество повторений слова '" + searchWord +
                "' в тексте: " + Utils.countSearchWords(inputText, searchWord));
        scanner.close();
    }
}
