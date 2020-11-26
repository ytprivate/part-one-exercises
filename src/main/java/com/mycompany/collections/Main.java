package com.mycompany.collections;

import java.util.Arrays;
import java.util.List;

public class Main {
    static List<MotorcyclistEquipment> moto = Arrays.asList(
            new MotorcyclistEquipment("Jeans Alpinestars Copper Black", 227.6, 1.5),
            new MotorcyclistEquipment("Gloves Seca Summer Way", 64.2, 0.5),
            new MotorcyclistEquipment("Helmet HJC RPHA 70 Grandal MC1SF", 412.8, 1.2),
            new MotorcyclistEquipment("Jacket leather Rebelhorn Rebel Black", 369.3, 4.5),
            new MotorcyclistEquipment("Boots Forma ADV TOURER", 233.5, 1.2),
            new MotorcyclistEquipment("Back protection ACERBIS", 81.7, 0.8),
            new MotorcyclistEquipment("Knee pads ACERBIS GINOCCHIERA GORILLA", 175.1, 0.6)
    );

    public static void main(String[] args) {
        Motorcyclist motorcyclist = new Motorcyclist(moto);
        Motorcyclist motorcyclistEquipment = new Motorcyclist(motorcyclist.getMotorcyclistEquipment());
        System.out.println("Общая стоимость экипировки : " + motorcyclistEquipment.getSum());
        System.out.print("Экипировка отсортирована по весу: " + "\n" +
                motorcyclistEquipment.sortByWeight().getMotorcyclistEquipment());
        System.out.println();
        System.out.println("Экипировка отсортирована по цене: " + "\n" +
                motorcyclistEquipment.sortByPrice().getMotorcyclistEquipment());

        double min = Motorcyclist.setMinPrice();
        double max = Motorcyclist.setMaxPrice();

        System.out.println("Экипировка в диапазоне цен:  min = " + min + " , max = " + max + "\n" +
                motorcyclistEquipment.getRangeOfPrices());
    }
}
