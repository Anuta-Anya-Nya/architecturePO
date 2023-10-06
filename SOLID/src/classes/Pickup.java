package classes;

import java.awt.Color;

import Enumerators.TypeOfBody;
import Enumerators.TypeOfFuel;
import Enumerators.TypeOfGearBox;
import Interfaces.iFuelStation;
import Interfaces.iWipingCar;

public class Pickup extends Car implements iFuelStation, iWipingCar {
    private float loadCapacity;

    public Pickup(String make, String model, Color color, int numOfWheels,
            TypeOfGearBox typeOfGearBox, TypeOfFuel typeOfFuel, float enginCapacity, float loadCapacity) {
        super(make, model, color, TypeOfBody.PICKUP, numOfWheels, typeOfGearBox, typeOfFuel, enginCapacity);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void fuel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fuel'");
    }

    @Override
    public void wipWindSheld() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipWindSheld'");
    }

    @Override
    public void wipHeadLights() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipHeadLights'");
    }

    @Override
    public void wipMirrows() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipMirrows'");
    }

}
