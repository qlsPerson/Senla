package com.qlsperson.senla.task6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            ArrayList<Thing> things = new ArrayList<>();
            System.out.print("Введите грузоподъемность рюкзака: ");
            int capacity = scanner.nextInt();
            Backpack backpack = new Backpack(capacity);
            if(backpack.getCapacity() > 0) {
                System.out.print("Введите количество вещей: ");
                int countThings = scanner.nextInt();
                if(countThings > 0) {
                    for (int i = 1; i <= countThings; i++) {
                        System.out.print("Введите вес вещи №" + i + ": ");
                        int weightThing = scanner.nextInt();
                        System.out.print("Введите стоимость вещи №" + i + ": ");
                        int costThing = scanner.nextInt();
                        if(weightThing <= 0 || costThing <= 0)
                        {throw new InputMismatchException("Вес и стоимость должны быть больше 0");}
                        things.add(new Thing(i, weightThing, costThing));
                    }
                    backpack.fillBackpack(things);
                    for (Thing t :backpack.getBestThings()) {
                        System.out.print("Вещь под №" + t.getNumber());
                        System.out.print(" c весом: " + t.getWeight());
                        System.out.print(" и стоимостью: " + t.getCost());
                        System.out.println(" попала в рюкзак.");
                    }
                    System.out.println("Суммарная стоимость рюкзака: " + backpack.getBestCost());
                } else {
                    System.out.println("Количество вещей должно быть больше 0");
                }
            } else {
                System.out.println("Грузоподъемность рюкзака должна быть больше 0");
            }
        }catch (InputMismatchException ex) {
            System.out.println("Некорректный ввод.");
            ex.printStackTrace();
        }
    }
}
