package com.qlsperson.senla.task6;

import java.util.InputMismatchException;

class Thing {
    private int number;
    private int weight;
    private int cost;

    Thing(int number, int weight, int cost) {
        if(weight <= 0 || cost <= 0 ) {
            throw new InputMismatchException("Вес и стоимость должны быть больше 0");
        }
        this.number = number;
        this.weight = weight;
        this.cost = cost;
    }

    int getNumber() { return number; }
    int getWeight() { return weight; }
    int getCost() { return cost; }
}
