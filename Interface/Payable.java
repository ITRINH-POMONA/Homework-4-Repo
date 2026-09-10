public interface Payable {
    // returns amount to be paid
    double calculatePayment();
    // returns name of the person/entity that's being paid
    String getPayeeName();
}
