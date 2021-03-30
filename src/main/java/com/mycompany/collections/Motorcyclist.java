package com.mycompany.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Motorcyclist {

    private final List<MotorcyclistEquipment> motoEquipment;

    public Motorcyclist(List<MotorcyclistEquipment> motoEquipment) {
        this.motoEquipment = motoEquipment;
    }

    public List<MotorcyclistEquipment> getMotorcyclistEquipment() {
        List<MotorcyclistEquipment> mte = this.motoEquipment;
        List<MotorcyclistEquipment> motoEquipment = new ArrayList<>();
        for (MotorcyclistEquipment me : mte) {
            if (me != null) {
                motoEquipment.add(me);
            }
        }
        return motoEquipment;
    }

    public Motorcyclist sortByWeight() {
        motoEquipment.sort(Comparator.comparing(MotorcyclistEquipment::getWeight));
        return this;
    }

    public Motorcyclist sortByPrice() {
        motoEquipment.sort(Comparator.comparing(MotorcyclistEquipment::getPrice));
        return this;
    }

    public double getSum() {
        double currentSum = 0.0;
        for (MotorcyclistEquipment me : motoEquipment) {
            currentSum += me.getPrice();
        }
        return currentSum;
    }
}