public class CommissionEmployee extends Employee {
 
    private double commissionRate; // percentage, e.g. 0.15 for 15%
    private double grossSales;
 
    // Constructor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                              double commissionRate, double grossSales) {
        super(firstName, lastName, socialSecurityNumber);
        setCommissionRate(commissionRate);
        setGrossSales(grossSales);
    }
 
    // Set method (mutator) - validates rate is between 0 and 1
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = (commissionRate <= 0.0 || commissionRate >= 1.0) ? 0.0 : commissionRate;
    }
 
    // Set method (mutator) - validates gross sales is not negative
    public void setGrossSales(double grossSales) {
        this.grossSales = (grossSales < 0.0) ? 0.0 : grossSales;
    }
 
    // Get methods (accessors)
    public double getCommissionRate() {
        return commissionRate;
    }
 
    public double getGrossSales() {
        return grossSales;
    }
 
    @Override
    public String toString() {
        return String.format("Commission employee: %s%n%s: $%,.2f; %s: %.2f%%",
                super.toString(), "Gross sales", getGrossSales(),
                "Commission rate", getCommissionRate() * 100);
    }
}
