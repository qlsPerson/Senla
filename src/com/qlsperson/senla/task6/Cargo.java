package com.qlsperson.senla.task6;

import java.util.ArrayList;

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
}
