public class SalariedEmployee extends Employee {
 
    private double weeklySalary;
 
    // Constructor
    public SalariedEmployee(String firstName, String lastName,
                             String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        setWeeklySalary(weeklySalary);
    }
 
    // Set method (mutator) - validates that salary is not negative
    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = (weeklySalary < 0.0) ? 0.0 : weeklySalary;
    }
 
    // Get method (accessor)
    public double getWeeklySalary() {
        return weeklySalary;
    }
 
    @Override
    public String toString() {
        return String.format("Salaried employee: %s%n%s: $%,.2f",
                super.toString(), "Weekly salary", getWeeklySalary());
    }
}
