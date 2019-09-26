package com.qlsperson.senla.task6;

import java.util.ArrayList;
import java.util.InputMismatchException;

class Backpack {
    private Cargo cargo;
    private int capacity;
    private int[][] temp;

    Backpack(int capacity) {
        if (capacity <= 0) {
            throw new InputMismatchException("Грузоподъемность рюкзака должна быть больше 0");
        }
        this.cargo = new Cargo();
        this.capacity = capacity;
    }

    int getWeightThings() {
        return cargo.getWeight();
    }

    int getCostThings() {
        return cargo.getCost();
    }

    ArrayList<Thing> getThings() {
        return cargo.getThings();
    }

    void fillBackpack(ArrayList<Thing> things) {
        temp = new int[things.size() + 1][capacity + 1];
        for (int i = 1; i <= things.size(); i++) {
            for (int j = 1; j <= capacity; j++) {
                if (things.get(i - 1).getWeight() > j) {
                    temp[i][j] = temp[i - 1][j];
                } else {
                    temp[i][j] = Math.max(temp[i - 1][j], (temp[i - 1][j - things.get(i - 1).getWeight()] + things.get(i - 1).getCost()));
                }
            }
        }
        findSetOfThings(things, things.size(), capacity);
    }

    private void findSetOfThings(ArrayList<Thing> things, int i, int j) {
        if (temp[i][j] == 0) return;
        if (temp[i - 1][j] == temp[i][j]) {
            findSetOfThings(things, i - 1, j);
        } else {
            cargo.addThing(things.get(i - 1));
            findSetOfThings(things, i - 1, j - things.get(i - 1).getWeight());
        }
    }
}
