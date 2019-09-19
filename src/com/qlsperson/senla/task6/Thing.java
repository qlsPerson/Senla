package com.qlsperson.senla.task6;

public class Thing {
    private int number;
    private int weight;
    private int cost;

    public Thing(int number, int weight, int cost) {
        this.number = number;
        this.weight = weight;
        this.cost = cost;
    }

    public int getNumber() { return number; }
    public int getWeight() { return weight; }
    public int getCost() { return cost; }
}
