class Payment {
    private int  paymentId;
    private int amount;
    private String paymentMethod;
    private String paymentStatus;
    private String PaymentDate;

    public Payment(int paymentId, int amount, String paymentMethod, String paymentStatus, String PaymentDate) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
        this.PaymentDate = PaymentDate;
    }


}