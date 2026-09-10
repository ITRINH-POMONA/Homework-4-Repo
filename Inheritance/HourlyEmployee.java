public class HourlyEmployee extends Employee {
 
    private double wage;
    private double hoursWorked;
 
    // Constructor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
                           double wage, double hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        setWage(wage);
        setHoursWorked(hoursWorked);
    }
 
    // Set method (mutator) - validates that wage is not negative
    public void setWage(double wage) {
        this.wage = (wage < 0.0) ? 0.0 : wage;
    }
 
    // Set method (mutator) - validates hours worked is between 0 and 168
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = (hoursWorked < 0.0 || hoursWorked > 168.0) ? 0.0 : hoursWorked;
    }
 
    // Get methods (accessors)
    public double getWage() {
        return wage;
    }
 
    public double getHoursWorked() {
        return hoursWorked;
    }
 
    @Override
    public String toString() {
        return String.format("Hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
                super.toString(), "Hourly wage", getWage(), "Hours worked", getHoursWorked());
    }
}