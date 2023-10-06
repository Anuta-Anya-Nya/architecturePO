package task2;

public class Bus extends Vehicle implements SpeedCalculation{
    
    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }

    @Override
    public double calculateAllowedSpeed() {
        return this.getMaxSpeed() * 0.6;
    }
    
}
