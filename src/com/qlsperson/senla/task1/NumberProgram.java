package com.qlsperson.senla.task1;

import com.qlsperson.senla.utils.Utils;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberProgram {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите целое число: ");
            long number = scanner.nextLong();
            System.out.println(number + " " + Utils.typesOfNumber(number));
        } catch (InputMismatchException ex) {
            System.out.println("Некорректный ввод.");
            ex.printStackTrace();
        }
    }
}
