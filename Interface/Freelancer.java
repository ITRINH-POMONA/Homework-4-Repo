public class Freelancer implements Payable{
    private String firstName;
    private String lastName;
    private double hourlyRate;
    private double hoursWorked;
    
    public Freelancer(String firstName, String lastName, double hourlyRate, double hoursWorked){
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = (hourlyRate < 0.0) ? 0.0 : hourlyRate;
    }
 
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = (hoursWorked < 0.0) ? 0.0 : hoursWorked;
    }

    // getters
    public String getFirstName() {
        return firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public double getHourlyRate() {
        return hourlyRate;
    }
 
    public double getHoursWorked() {
        return hoursWorked;
    }

    // required functions from interface
    public String getPayeeName() {
        return firstName + " " + lastName;
    }

    public double calculatePayment(){
        if (hoursWorked > 40.0) {
            double regularPay = 40.0 * hourlyRate;
            double overtimePay = (hoursWorked - 40.0) * hourlyRate * 1.5;
            return regularPay + overtimePay;
        } else {
            return hoursWorked * hourlyRate;
        }
    }
    public void print() {
        System.out.printf("Freelancer: %s - Payment due: $%,.2f%n",
                getPayeeName(), calculatePayment());
    }

}
