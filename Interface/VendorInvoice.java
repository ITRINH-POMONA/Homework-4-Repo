public class VendorInvoice implements Payable {
    private String vendorName;
    private String invoiceNumber;
    private double amountDue;
    public VendorInvoice(String vendorName, String invoiceNumber, double amountDue) {
        this.vendorName = vendorName;
        this.invoiceNumber = invoiceNumber;
        this.amountDue = amountDue;
    }

    // setters
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
 
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = (amountDue < 0.0) ? 0.0 : amountDue;
    }

    // getters
    public String getVendorName() {
        return vendorName;
    }
 
    public String getInvoiceNumber() {
        return invoiceNumber;
    }
 
    public double getAmountDue() {
        return amountDue;
    }

    // required functions from interface
    public double calculatePayment() {
        return amountDue;
    }
 
    // Returns the vendor's name
    public String getPayeeName() {
        return vendorName;
    }

    public void print() {
        System.out.printf("Vendor: %s - Invoice #%s - Payment due: $%,.2f%n", 
                getVendorName(), getInvoiceNumber(), calculatePayment());
    }
}
