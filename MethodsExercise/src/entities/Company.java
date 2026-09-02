package entities;

public class Company extends Taxpayer {
    private int numberEmployees;

    public Company() {
    }

    public Company(String name, double annualIncome, int numberEmployees) {
        super(name, annualIncome);
        this.numberEmployees = numberEmployees;
    }

    public int getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @Override
    public double taxPaid(){
        if (getNumberEmployees() < 10) {
            return getAnnualIncome() * 0.16;
        } else {
            return getAnnualIncome() * 0.14;
        }
    }

}
