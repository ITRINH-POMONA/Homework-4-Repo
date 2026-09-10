public class BaseEmployee extends Employee {
 
    private double baseSalary;
 
    // Constructor
    public BaseEmployee(String firstName, String lastName,
                         String socialSecurityNumber, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        setBaseSalary(baseSalary);
    }
 
    // Set method (mutator) - validates that base salary is not negative
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = (baseSalary < 0.0) ? 0.0 : baseSalary;
    }
 
    // Get method (accessor)
    public double getBaseSalary() {
        return baseSalary;
    }
 
    @Override
    public String toString() {
        return String.format("Base employee: %s%n%s: $%,.2f",
                super.toString(), "Base salary", getBaseSalary());
    }
}
