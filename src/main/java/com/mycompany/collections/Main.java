package com.mycompany.collections;

import com.mycompany.collections.equipment.Footwear;
import com.mycompany.collections.equipment.MotorcyclistEquipment;
import com.mycompany.collections.equipment.ProtectionItems;
import com.mycompany.collections.equipment.StreetGarment;
import com.mycompany.collections.models.MotorbikeStyle;
import com.mycompany.collections.models.ProtectionType;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    static List<MotorcyclistEquipment> motoEquipment = Arrays.asList(
            new StreetGarment("Jeans Alpinestars Copper Black", 227.6, 1.5, MotorbikeStyle.STREET),
            new StreetGarment("Gloves Seca Summer Way", 64.2, 0.5, MotorbikeStyle.STREET),
            new StreetGarment("Jacket leather Rebelhorn Rebel Black", 369.3, 4.5, MotorbikeStyle.STREET),
            new Footwear("Boots Forma ADV TOURER", 233.5, 1.2, MotorbikeStyle.STREET),
            new ProtectionItems("Helmet HJC RPHA 70 Grandal MC1SF", 412.8, 1.2, ProtectionType.HEAD),
            new ProtectionItems("Back protection ACERBIS", 81.7, 0.8, ProtectionType.TORSO_PROTECTOR),
            new ProtectionItems("Knee pads ACERBIS GINOCCHIERA GORILLA", 175.1, 0.6, ProtectionType.KNEE)
    );

    public static void main(String[] args) {
        Motorcyclist motorcyclist = new Motorcyclist(motoEquipment);
        System.out.println("________");
        System.out.println("Общая стоимость экипировки : " + motorcyclist.getEquipmentCost());
        System.out.println("________");
        System.out.println("Экипировка отсортирована по весу: " + "\n" +
                motorcyclist.getMotorcyclistEquipmentSortedByWeight());
        System.out.println("________");
        System.out.println("Экипировка отсортирована по цене: " + "\n" +
                motorcyclist.getMotorcyclistEquipmentSortedByPrice());

        String minPrice = JOptionPane.showInputDialog(null, "Введите минмальную цену диапазона ");
        String maxPrice = JOptionPane.showInputDialog(null, "Введите максимальную цену диапазона ");
        double min = (Double.parseDouble(minPrice));
        double max = (Double.parseDouble(maxPrice));

        StringBuilder rangeOfPrices = new StringBuilder();
        for (MotorcyclistEquipment motoEquip : motoEquipment) {
            if (motoEquip.getPrice() >= min && motoEquip.getPrice() <= max) {
                rangeOfPrices.append(motoEquip);
            }
        }
        System.out.println("________");
        System.out.println("Экипировка в диапазоне цен:  min = " + min + " , max = " + max + "\n" + rangeOfPrices);
    }
}


