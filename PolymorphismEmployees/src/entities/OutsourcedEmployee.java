package entities;

public class OutsourcedEmployee extends Employee {
    private double additionalCharge;

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return (getHours() * getValuePerHour()) + additionalCharge * 1.10;
    }
    
}
