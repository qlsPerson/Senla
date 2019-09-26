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

    ArrayList<Cargo.Thing> getThings() {
        return cargo.getThings();
    }

    void fillBackpack(ArrayList<Cargo.Thing> things) {
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

    private void findSetOfThings(ArrayList<Cargo.Thing> things, int i, int j) {
        if (temp[i][j] == 0) return;
        if (temp[i - 1][j] == temp[i][j]) {
            findSetOfThings(things, i - 1, j);
        } else {
            cargo.addThing(things.get(i - 1));
            findSetOfThings(things, i - 1, j - things.get(i - 1).getWeight());
        }
    }

    class Cargo {
        private ArrayList<Thing> things;
        private int cost;
        private int weight;

        Cargo() {
            this.things = new ArrayList<>();
        }

        void addThing(Thing thing) {
            things.add(thing);
            weight += thing.getWeight();
            cost += thing.getCost();
        }

        int getWeight() {
            return weight;
        }

        int getCost() {
            return cost;
        }

        ArrayList<Thing> getThings() {
            return things;
        }

        class Thing {
            private int number;
            private int weight;
            private int cost;

            Thing(int number, int weight, int cost) {
                if (weight <= 0 || cost <= 0) {
                    throw new InputMismatchException("Вес и стоимость должны быть больше 0");
                }
                this.number = number;
                this.weight = weight;
                this.cost = cost;
            }

            int getNumber() {
                return number;
            }

            int getWeight() {
                return weight;
            }

            int getCost() {
                return cost;
            }
        }
    }
}
