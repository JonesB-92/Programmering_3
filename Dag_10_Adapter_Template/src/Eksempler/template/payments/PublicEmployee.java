package Eksempler.template.payments;

public class PublicEmployee extends Employee{
    public PublicEmployee(double salary) {
        super(salary);
    }

    @Override
    protected double calculateRetirementDeductions() {
        return super.salary * 0.10;
    }

    @Override
    protected double calculateHealthPlanDeductions() {

        return (super.salary - calculateRetirementDeductions()) * 0.13;
    }

    @Override
    protected double calculateOtherDeductions() {
        if (super.salary > 100_000) {
            return 1000;
        }
        return 0;
    }
}
