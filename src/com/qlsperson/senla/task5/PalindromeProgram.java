package com.qlsperson.senla.task5;

import com.qlsperson.senla.utils.Utils;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PalindromeProgram {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число от 0 до 100: ");
            int inputNumber = scanner.nextInt();
            if(inputNumber >= 0 && inputNumber <= 100) {
                System.out.println("Числа палиндромы: " + Utils.arrayListToString(Utils.palindromeNumbers(inputNumber)));
            } else {
                System.out.println("Вы ввели число меньше 0 или больше 100");
            }
        }catch (InputMismatchException ex) {
            System.out.println("Некорректный ввод.");
            ex.printStackTrace();
        }
    }
}
