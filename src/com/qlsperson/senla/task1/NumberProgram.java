package com.qlsperson.senla.task1;

import com.qlsperson.senla.utils.Utils;
import java.util.Scanner;

public class NumberProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста введите целое число: ");
        if(scanner.hasNextLong()) {
            long number = scanner.nextLong();
            System.out.println(number + " " + Utils.typesOfNumber(number));
        } else {
            System.out.println("Простите, Ваше число является не целым");
        }
        scanner.close();
    }
}
