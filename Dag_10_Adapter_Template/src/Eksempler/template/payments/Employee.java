package Eksempler.template.payments;

public abstract class Employee {
    protected double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    // Dette er Template Metoden. Den er ofte 'final' for at
    // forhindre underklasser i at ændre selve algoritmens struktur.
    public final double calculateNetSalary() {
        double retirement = calculateRetirementDeductions();
        double health = calculateHealthPlanDeductions();
        double other = calculateOtherDeductions();

        return salary - (retirement + health + other);
    }

    // Disse trin overlades til underklasserne at implementere
    protected abstract double calculateRetirementDeductions();
    protected abstract double calculateHealthPlanDeductions();
    protected abstract double calculateOtherDeductions();
}
