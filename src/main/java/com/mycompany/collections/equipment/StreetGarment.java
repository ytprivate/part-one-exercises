package com.mycompany.collections.equipment;

import com.mycompany.collections.models.MotorbikeStyle;

import java.util.Objects;

public class StreetGarment extends MotorcyclistEquipment {

    private final MotorbikeStyle type;

    public StreetGarment(String equipmentName, Double price, Double weight, MotorbikeStyle type) {
        super(equipmentName, price, weight);
        this.type = type;
    }

    public MotorbikeStyle getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + type +
                        '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StreetGarment)) return false;
        if (!super.equals(o)) return false;
        StreetGarment that = (StreetGarment) o;
        return getType() == that.getType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getType());
    }
}
