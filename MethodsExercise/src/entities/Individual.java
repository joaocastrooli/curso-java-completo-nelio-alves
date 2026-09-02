package entities;

public class Individual extends Taxpayer {
    private double healthcareExpenses;

    public Individual() {
    }

    public Individual(String name, double annualIncome, double healthcareExpenses) {
        super(name, annualIncome);
        this.healthcareExpenses = healthcareExpenses;
    }

    public double getHealthcareExpenses() {
        return healthcareExpenses;
    }

    public void setHealthcareExpenses(double healthcareExpenses) {
        this.healthcareExpenses = healthcareExpenses;
    }

    @Override
    public double taxPaid(){
        if (getAnnualIncome() < 20000) {
            return ((getAnnualIncome() * 0.15) - (healthcareExpenses * 0.5));
        } else {
            return ((getAnnualIncome() * 0.25) - (healthcareExpenses * 0.5));
        }
    }
}
