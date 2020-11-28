import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Motorcyclist {

    private final List<MotorcyclistEquipment> moto;

    public Motorcyclist(List<MotorcyclistEquipment> moto) {
        this.moto = moto;
    }


    public List<MotorcyclistEquipment> getMotorcyclistEquipment() {
        List<MotorcyclistEquipment> mte = this.moto;
        List<MotorcyclistEquipment> moto = new ArrayList<>();
        for (MotorcyclistEquipment me : mte) {
            if (me != null) {
                moto.add(me);
            }
        }
        return moto;
    }

    public Motorcyclist sortByWeight() {
        moto.sort(Comparator.comparing(MotorcyclistEquipment::getWeight));
        return this;
    }

    public double getSum() {
        double currentSum = 0.0;
        for (MotorcyclistEquipment me : moto) {
            currentSum += me.getPrice();
        }
        return currentSum;
    }

}

