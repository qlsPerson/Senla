package com.qlsperson.senla.task2;

import com.qlsperson.senla.utils.Utils;
import java.util.Scanner;

public class LCMAndGCDProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста введите первое целое число: ");
        if(scanner.hasNextLong()) {
            long numberA = scanner.nextLong();
            System.out.print("Пожалуйста введите второе целое число: ");
            if(scanner.hasNextLong()) {
                long numberB = scanner.nextLong();
                System.out.println("наибольший общий делитель = " + Utils.gcd(numberA, numberB));
                System.out.println("наименьшее общее кратное = " + Utils.lcm(numberA, numberB));
            } else {
                System.out.println("Простите, второе число не является целым");
            }
        } else {
            System.out.println("Простите, первое число не является целым");
        }
        scanner.close();
    }
}
