package com.mycompany.collections.equipment;

import com.mycompany.collections.models.ProtectionType;

import java.util.Objects;

public class ProtectionItems extends MotorcyclistEquipment {
    private final ProtectionType type;

    public ProtectionItems(String equipmentName, Double price, Double weight, ProtectionType type) {
        super(equipmentName, price, weight);
        this.type = type;
    }

    public ProtectionType getType() {
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
        if (!(o instanceof ProtectionItems)) return false;
        if (!super.equals(o)) return false;
        ProtectionItems that = (ProtectionItems) o;
        return getType() == that.getType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getType());
    }
}
