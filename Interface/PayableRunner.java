import java.util.ArrayList;
public class PayableRunner {
    public static void main(String[] args) {
 
        ArrayList<Payable> payables = new ArrayList<>();
 
        payables.add(new Freelancer("Jeff", "Jones", 35.00, 45.0));
        payables.add(new Freelancer("Alex", "Albon", 28.50, 38.0));
 
        payables.add(new VendorInvoice("Office Supply Co.", "INV-1001", 1250.75));
        payables.add(new VendorInvoice("CloudHost Services", "INV-2044", 899.99));
 
        double totalPayout = 0.0;
 
        // Loop through the collection and process each element
        for (Payable p : payables) {
            if (p instanceof Freelancer) {
                ((Freelancer) p).print();
            } else if (p instanceof VendorInvoice) {
                ((VendorInvoice) p).print();
            }
            totalPayout += p.calculatePayment();
        }
 
        // After the loop, display the total payout
        System.out.printf("%nTotal payout for the period: $%,.2f%n", totalPayout);
    }

}