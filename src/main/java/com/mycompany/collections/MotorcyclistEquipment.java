package com.mycompany.collections;

import java.util.Objects;

public class MotorcyclistEquipment {

    private String equipment;
    private double price;
    private double weight;

    public MotorcyclistEquipment(String equipment, Double price, Double weight) {
        this.equipment = equipment;
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Item:{" +
                "equipment='" + equipment + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MotorcyclistEquipment that = (MotorcyclistEquipment) o;
        return Double.compare(that.price, price) == 0 &&
                Double.compare(that.weight, weight) == 0 &&
                equipment.equals(that.equipment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(equipment, price, weight);
    }
}
