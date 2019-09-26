package com.qlsperson.senla.task6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите грузоподъемность рюкзака: ");
            Backpack backpack = new Backpack(scanner.nextInt());
            Backpack.Cargo cargo = backpack.new Cargo();
            ArrayList<Backpack.Cargo.Thing> things = new ArrayList<>();
            System.out.print("Введите количество вещей: ");
            int countThings = scanner.nextInt();
            if (countThings > 0) {
                for (int i = 1; i <= countThings; i++) {
                    System.out.print("Введите вес вещи №" + i + ": ");
                    int weightThing = scanner.nextInt();
                    System.out.print("Введите стоимость вещи №" + i + ": ");
                    int costThing = scanner.nextInt();
                    things.add(cargo.new Thing(i, weightThing, costThing));
                }
                backpack.fillBackpack(things);
                for (Backpack.Cargo.Thing t : backpack.getThings()) {
                    System.out.print("Вещь под №" + t.getNumber());
                    System.out.print(" c весом: " + t.getWeight());
                    System.out.print(" и стоимостью: " + t.getCost());
                    System.out.println(" попала в рюкзак.");
                }
                System.out.println("Вес груза в рюкзаке: " + backpack.getWeightThings());
                System.out.println("Суммарная ценность груза в рюкзаке: " + backpack.getCostThings());
            } else {
                throw new InputMismatchException("Количество вещей должно быть больше 0");
            }
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
