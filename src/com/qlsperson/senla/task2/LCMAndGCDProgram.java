package com.qlsperson.senla.task2;

import com.qlsperson.senla.utils.Utils;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LCMAndGCDProgram {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Пожалуйста введите первое целое число: ");
            long numberA = scanner.nextLong();
            System.out.print("Пожалуйста введите второе целое число: ");
            long numberB = scanner.nextLong();
            System.out.println("наибольший общий делитель = " + Utils.gcd(numberA, numberB));
            System.out.println("наименьшее общее кратное = " + Utils.lcm(numberA, numberB));
        } catch (InputMismatchException ex) {
            System.out.println("Некорректный ввод.");
            ex.printStackTrace();
        }
    }
}
