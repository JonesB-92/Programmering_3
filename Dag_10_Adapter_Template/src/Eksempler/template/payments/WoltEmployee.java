package Eksempler.template.payments;

public class WoltEmployee extends Employee{
    public WoltEmployee(double salary) {
        super(salary);
    }

    @Override
    protected double calculateRetirementDeductions() {
        return 0;
    }

    @Override
    protected double calculateHealthPlanDeductions() {
        return 0;
    }

    @Override
    protected double calculateOtherDeductions() {
        return 0;
    }
}
