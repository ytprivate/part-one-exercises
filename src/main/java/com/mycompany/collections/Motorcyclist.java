package com.mycompany.collections;

import com.mycompany.collections.equipment.MotorcyclistEquipment;

import java.util.Comparator;
import java.util.List;

public class Motorcyclist {

    private final List<MotorcyclistEquipment> motoEquipment;

    public Motorcyclist(List<MotorcyclistEquipment> motoEquipment) {
        this.motoEquipment = motoEquipment;
    }

    public double getEquipmentCost() {
        double equipmentCost = 0.0;
        for (MotorcyclistEquipment me : motoEquipment) {
            equipmentCost += me.getPrice();
        }
        return equipmentCost;
    }

    public List<MotorcyclistEquipment> getMotorcyclistEquipmentSortedByPrice() {
        motoEquipment.sort(Comparator.comparing(MotorcyclistEquipment::getPrice));
        return this.motoEquipment;
    }

    public List<MotorcyclistEquipment> getMotorcyclistEquipmentSortedByWeight() {
        motoEquipment.sort(Comparator.comparing(MotorcyclistEquipment::getWeight));
        return this.motoEquipment;
    }
}