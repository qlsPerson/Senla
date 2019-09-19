package com.qlsperson.senla.task5;

import com.qlsperson.senla.utils.Utils;
import java.util.Scanner;

public class PalindromeProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 0 до 100: ");
        if(scanner.hasNextInt()) {
            int inputNumber = scanner.nextInt();
            if(inputNumber >= 0 && inputNumber <= 100) {
                System.out.println("Числа палиндромы: " + Utils.arrayListToString(Utils.palindromeNumbers(inputNumber)));
            } else {
                System.out.println("Вы ввели число меньше 0 или больше 100");
            }
        } else {
            System.out.println("Вы ввели не число");
        }
    }
}
