package classes;
import java.awt.*;

import Enumerators.TypeOfGearBox;
import Enumerators.TypeOfBody;
import Enumerators.TypeOfFuel;

public abstract class Car {
    private String make;
    private String model;
    private Color color;
    private TypeOfBody bodyType;
    private int numOfWheels;
    private TypeOfGearBox typeOfGearBox;
    private TypeOfFuel typeOfFuel;
    private float enginCapacity;
    
    public Car(String make, String model, Color color, TypeOfBody bodyType, int numOfWheels,
            TypeOfGearBox typeOfGearBox, TypeOfFuel typeOfFuel, float enginCapacity) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numOfWheels = numOfWheels;
        this.typeOfGearBox = typeOfGearBox;
        this.typeOfFuel = typeOfFuel;
        this.enginCapacity = enginCapacity;
    }

    public void movement(){}
    public void maintenance(){}
    public boolean turnLights(){return true;}
    public boolean turnWrapers(){return true;}

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public TypeOfBody getBodyType() {
        return bodyType;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public TypeOfGearBox getTypeOfGearBox() {
        return typeOfGearBox;
    }

    public TypeOfFuel getTypeOfFuel() {
        return typeOfFuel;
    }

    public float getEnginCapacity() {
        return enginCapacity;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setBodyType(TypeOfBody bodyType) {
        this.bodyType = bodyType;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public void setTypeOfGearBox(TypeOfGearBox typeOfGearBox) {
        this.typeOfGearBox = typeOfGearBox;
    }

    public void setTypeOfFuel(TypeOfFuel typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public void setEnginCapacity(float enginCapacity) {
        this.enginCapacity = enginCapacity;
    }

}
