package com.mycompany.collections.equipment;

import java.util.Objects;

abstract public class MotorcyclistEquipment {

    private String equipmentName;
    private double price;
    private double weight;

    public MotorcyclistEquipment(String equipmentName, Double price, Double weight) {
        this.equipmentName = equipmentName;
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
        return "  => Equipment:{" +
                "name='" + equipmentName + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MotorcyclistEquipment)) return false;
        MotorcyclistEquipment that = (MotorcyclistEquipment) o;
        return Double.compare(that.getPrice(), getPrice()) == 0 && Double.compare(that.getWeight(), getWeight()) == 0
                && equipmentName.equals(that.equipmentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(equipmentName, getPrice(), getWeight());
    }
}