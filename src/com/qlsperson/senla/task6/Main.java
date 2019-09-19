package com.qlsperson.senla.task6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Thing> things = new ArrayList<>();
        System.out.print("Введите грузоподъемность рюкзака: ");
        if (scanner.hasNextInt()) {
            int capacity = scanner.nextInt();
            Backpack backpack = new Backpack(capacity);
            if(backpack.getCapacity() > 0) {
                System.out.print("Введите количество вещей: ");
                if (scanner.hasNextInt()) {
                    int countThings = scanner.nextInt();
                    if(countThings > 0) {
                        for (int i = 1; i <= countThings; i++) {
                            System.out.print("Введите вес вещи №" + i + ": ");
                            int weightThing = scanner.nextInt();
                            System.out.print("Введите стоимость вещи №" + i + ": ");
                            int costThing = scanner.nextInt();
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
                    System.out.print("Некорректное количество вещей");
                }
            }else {
                System.out.println("Грузоподъемность рюкзака должна быть больше 0");
            }
        } else {
            System.out.print("Некорректная грузоподъемность рюкзака");
        }
        scanner.close();
    }
}
